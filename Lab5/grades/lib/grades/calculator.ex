defmodule Grades.Calculator do
  def percentage_grade(_grades) do
    Enum.random(0..100)
  end

  def letter_grade(_grades) do
    Enum.random(["F", "E", "D", "D+", "C", "C+", "B", "B+", "A-", "A", "A+"])
  end

  def numeric_grade(_grades) do
    Enum.random(0..10)
  end
end