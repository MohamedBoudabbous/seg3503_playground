error id: file://<WORKSPACE>/date/test/DateNextDateOkTest.java:java/util/List#
file://<WORKSPACE>/date/test/DateNextDateOkTest.java
empty definition using pc, found symbol in pc: java/util/List#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 668
uri: file://<WORKSPACE>/date/test/DateNextDateOkTest.java
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

  private Date today;
  private Date expectedTomorrow;

  public DateNextDateOkTest(
    int todayYear, int todayMonth, int todayDay,
    int expeectedYear, int expectedMonth, int expectedDay)
  {
    this.today = new Date(todayYear, todayMonth, todayDay);
    this.expectedTomorrow = new Date(expeectedYear, expectedMonth, expectedDay);
  }

  @Parameters
  public static List@@<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );
    params.add(new Integer[] { 1700, 6, 20, 1700, 6, 21 });
    params.add(new Integer[] { 2005, 4, 15, 2005, 4, 16 });
    params.add(new Integer[] { 1901, 7, 20, 1901, 7, 21 });
    params.add(new Integer[] { 3456, 3, 27, 3456, 3, 28 });
    params.add(new Integer[] { 1500, 2, 17, 1500, 2, 18 });
    params.add(new Integer[] { 1700, 6, 29, 1700, 6, 30 });
    params.add(new Integer[] { 1800, 11, 29, 1800, 11, 30 });
    params.add(new Integer[] { 3453, 1, 29, 3453, 1, 30 });
    params.add(new Integer[] { 444, 2, 29, 444, 3, 1 });
    params.add(new Integer[] { 2005, 4, 30, 2005, 5, 1 });
    params.add(new Integer[] { 3453, 1, 30, 3453, 1, 31 });
    params.add(new Integer[] { 3456, 3, 30, 3456, 3, 31 });
    params.add(new Integer[] { 1901, 7, 31, 1901, 8, 1 });
    params.add(new Integer[] { 3453, 1, 31, 3453, 2, 1 });
    params.add(new Integer[] { 3456, 12, 31, 3457, 1, 1 });
    return params;
  }

  @Test
  public void testNextDate()
  {
    Date actualTomorrow = today.nextDate();
    Assert.assertEquals(expectedTomorrow, actualTomorrow);
  }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/List#