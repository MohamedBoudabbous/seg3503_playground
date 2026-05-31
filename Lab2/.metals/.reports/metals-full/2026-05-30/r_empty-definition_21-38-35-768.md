error id: file://<WORKSPACE>/ecs/test/DateNextDateExceptionTest.java:_empty_/Parameterized#
file://<WORKSPACE>/ecs/test/DateNextDateExceptionTest.java
empty definition using pc, found symbol in pc: _empty_/Parameterized#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 218
uri: file://<WORKSPACE>/ecs/test/DateNextDateExceptionTest.java
text:
```scala
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameter@@ized.class)

public class DateNextDateExceptionTest
{

    private int year;
    private int month;
    private int day;
    public DateNextDateExceptionTest(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Parameters
    public static List<Integer[]> data() {
        List<Integer[]> params = new LinkedList<Integer[]>();
        params.add(new Integer[] {1500, 2, 31});
        params.add(new Integer[] {1500, 2, 29});
        params.add(new Integer[] {-1, 10, 20});
        params.add(new Integer[] {1458, 15, 12});
        params.add(new Integer[] {1975, 6, -50});
        return params;
    }

    @Test(expected = IllegalArgumentException.class)

    public void testNextDateException() {
        new Date(year, month, day);
    }



}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Parameterized#