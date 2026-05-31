error id: file://<WORKSPACE>/ecs/test/DateTest.java:_empty_/DateTest#assertEquals#
file://<WORKSPACE>/ecs/test/DateTest.java
empty definition using pc, found symbol in pc: _empty_/DateTest#assertEquals#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 205
uri: file://<WORKSPACE>/ecs/test/DateTest.java
text:
```scala
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void tc01_regular_date_1700_06_20() {
    Date d = new Date(1700, 6, 20);
    assertEquals@@(new Date(1700, 6, 21), d.nextDate());
  }

  @Test
  void tc02_regular_date_2005_04_15() {
    Date d = new Date(2005, 4, 15);
    assertEquals(new Date(2005, 4, 16), d.nextDate());
  }

  @Test
  void tc03_regular_date_1901_07_20() {
    Date d = new Date(1901, 7, 20);
    assertEquals(new Date(1901, 7, 21), d.nextDate());
  }

  @Test
  void tc04_regular_date_3456_03_27() {
    Date d = new Date(3456, 3, 27);
    assertEquals(new Date(3456, 3, 28), d.nextDate());
  }

  @Test
  void tc05_regular_date_1500_02_17() {
    Date d = new Date(1500, 2, 17);
    assertEquals(new Date(1500, 2, 18), d.nextDate());
  }

  @Test
  void tc06_end_of_june() {
    Date d = new Date(1700, 6, 29);
    assertEquals(new Date(1700, 6, 30), d.nextDate());
  }

  @Test
  void tc07_end_of_november() {
    Date d = new Date(1800, 11, 29);
    assertEquals(new Date(1800, 11, 30), d.nextDate());
  }

  @Test
  void tc08_january_29() {
    Date d = new Date(3453, 1, 29);
    assertEquals(new Date(3453, 1, 30), d.nextDate());
  }

  @Test
  void tc09_february_29_leap_year() {
    Date d = new Date(444, 2, 29);
    assertEquals(new Date(444, 3, 1), d.nextDate());
  }

  @Test
  void tc10_april_30() {
    Date d = new Date(2005, 4, 30);
    assertEquals(new Date(2005, 5, 1), d.nextDate());
  }

  @Test
  void tc11_january_30() {
    Date d = new Date(3453, 1, 30);
    assertEquals(new Date(3453, 1, 31), d.nextDate());
  }

  @Test
  void tc12_march_30() {
    Date d = new Date(3456, 3, 30);
    assertEquals(new Date(3456, 3, 31), d.nextDate());
  }

  @Test
  void tc13_july_31() {
    Date d = new Date(1901, 7, 31);
    assertEquals(new Date(1901, 8, 1), d.nextDate());
  }

  @Test
  void tc14_january_31() {
    Date d = new Date(3453, 1, 31);
    assertEquals(new Date(3453, 2, 1), d.nextDate());
  }

  @Test
  void tc15_december_31() {
    Date d = new Date(3456, 12, 31);
    assertEquals(new Date(3457, 1, 1), d.nextDate());
  }

  @Test
  void tc16_invalid_february_31() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1500, 2, 31));
  }

  @Test
  void tc17_invalid_february_29_non_leap_year() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1500, 2, 29));
  }

  @Test
  void tc18_invalid_negative_year() {
    assertThrows(IllegalArgumentException.class, () -> new Date(-1, 10, 20));
  }

  @Test
  void tc19_invalid_month() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1458, 15, 12));
  }

  @Test
  void tc20_invalid_negative_day() {
    assertThrows(IllegalArgumentException.class, () -> new Date(1975, 6, -50));
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/DateTest#assertEquals#