defmodule Grades.Calculator do
  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    homework_average = average(homework)
    labs_average = average(labs)
    midterm_grade = to_number(midterm)
    final_grade = to_number(final)

    homework_average * 0.10 +
      labs_average * 0.10 +
      midterm_grade * 0.30 +
      final_grade * 0.50
    |> round()
  end

  def letter_grade(grades) do
    grades
    |> percentage_grade()
    |> letter_from_percentage()
  end

  def numeric_grade(grades) do
    grades
    |> percentage_grade()
    |> numeric_from_percentage()
  end

  defp average(values) do
    numbers = Enum.map(values, &to_number/1)

    Enum.sum(numbers) / length(numbers)
  end

  defp to_number(nil), do: 0.0
  defp to_number(""), do: 0.0

  defp to_number(value) when is_binary(value) do
    value
    |> String.trim()
    |> Float.parse()
    |> case do
      {number, _} -> number
      :error -> 0.0
    end
  end

  defp to_number(value) when is_number(value), do: value * 1.0

  defp letter_from_percentage(percentage) when percentage >= 90, do: "A+"
  defp letter_from_percentage(percentage) when percentage >= 85, do: "A"
  defp letter_from_percentage(percentage) when percentage >= 80, do: "A-"
  defp letter_from_percentage(percentage) when percentage >= 75, do: "B+"
  defp letter_from_percentage(percentage) when percentage >= 70, do: "B"
  defp letter_from_percentage(percentage) when percentage >= 65, do: "C+"
  defp letter_from_percentage(percentage) when percentage >= 60, do: "C"
  defp letter_from_percentage(percentage) when percentage >= 55, do: "D+"
  defp letter_from_percentage(percentage) when percentage >= 50, do: "D"
  defp letter_from_percentage(percentage) when percentage >= 40, do: "E"
  defp letter_from_percentage(_percentage), do: "F"

  defp numeric_from_percentage(percentage) when percentage >= 90, do: 10
  defp numeric_from_percentage(percentage) when percentage >= 85, do: 9
  defp numeric_from_percentage(percentage) when percentage >= 80, do: 8
  defp numeric_from_percentage(percentage) when percentage >= 75, do: 7
  defp numeric_from_percentage(percentage) when percentage >= 70, do: 6
  defp numeric_from_percentage(percentage) when percentage >= 65, do: 5
  defp numeric_from_percentage(percentage) when percentage >= 60, do: 4
  defp numeric_from_percentage(percentage) when percentage >= 55, do: 3
  defp numeric_from_percentage(percentage) when percentage >= 50, do: 2
  defp numeric_from_percentage(percentage) when percentage >= 40, do: 1
  defp numeric_from_percentage(_percentage), do: 0
end