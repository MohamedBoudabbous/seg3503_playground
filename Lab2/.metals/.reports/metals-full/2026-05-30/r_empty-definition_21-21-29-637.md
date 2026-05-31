error id: file://<WORKSPACE>/ecs/test/DateNextDateOkTest.java:java/lang/Integer#
file://<WORKSPACE>/ecs/test/DateNextDateOkTest.java
empty definition using pc, found symbol in pc: java/lang/Integer#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 843
uri: file://<WORKSPACE>/ecs/test/DateNextDateOkTest.java
text:
```scala
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class DateNextDateOkTest
{

  private int year;
  private int month;
  private int day;
  private int expectedYear;
  private int expectedMonth;
  private int expectedDay;

  public DateNextDateOkTest(int year, int month, int day, int expectedYear, int expectedMonth,
      int expectedDay) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.expectedYear = expectedYear;
    this.expectedMonth = expectedMonth;
    this.expectedDay = expectedDay;
  }

  @Paramaters
  public static List<Object[]> data() {
    List<Object[]> testCases = new LinkedList<Inte@@ger[]>();
    params.add(new Integer[] {1700, 6, 20, 1700, 6, 21});
    params.add(new Integer[] {2005, 4, 15, 2005, 4, 16});
    params.add(new Integer[] {1901, 7, 20, 1901, 7, 21});
    params.add(new Integer[] {3456, 3, 27, 3456, 3, 28});
    params.add(new Integer[] {1500, 2, 17, 1500, 2, 18});
    params.add(new Integer[] {1700, 6, 29, 1700, 6, 30});
    params.add(new Integer[] {1800, 11, 29, 1800, 11, 30});
    params.add(new Integer[] {3453, 1, 29, 3453, 1, 30});
    params.add(new Integer[] {444, 2, 29, 444, 3, 1});
    params.add(new Integer[] {2005, 4, 30, 2005, 5, 1});
    params.add(new Integer[] {3453, 1, 30, 3453, 1, 31});
    params.add(new Integer[] {3456, 3, 30, 3456, 3, 31});
    params.add(new Integer[] {1901, 7, 31, 1901, 8, 1});
    params.add(new Integer[] {3453, 1, 31, 3453, 2, 1});
    params.add(new Integer[] {3456, 12, 31, 3457, 1, 1});
    return params;
  }

  public void testNextDateOk(){
    Date actualDate = new Date(year, month, day);
    Date expectedDate = new Date(expectedYear, expectedMonth, expectedDay);
    assertEquals(expectedDate, actualDate.nextDate());
  }



}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/Integer#