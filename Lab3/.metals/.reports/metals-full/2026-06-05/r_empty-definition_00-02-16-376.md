error id: file://<WORKSPACE>/date/test/DateTest.java:_empty_/Date#
file://<WORKSPACE>/date/test/DateTest.java
empty definition using pc, found symbol in pc: _empty_/Date#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 3862
uri: file://<WORKSPACE>/date/test/DateTest.java
text:
```scala
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }


  // test ajputes

  @Test
  void invalid_day_greater_than_31() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 1, 32)
    );
  }

  @Test
  void invalid_day_31_for_thirty_day_month() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date@@(2024, 4, 31)
    );
  }

  @Test
  void invalid_february_30_on_leap_year() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 2, 30)
    );
  }

  @Test
  void valid_february_29_on_leap_year_divisible_by_400() {
    Date date = new Date(2000, 2, 29);

    assertEquals(2000, date.getYear());
    assertEquals(2, date.getMonth());
    assertEquals(29, date.getDay());
  }

  @Test
  void invalid_february_29_on_century_non_leap_year() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1900, 2, 29)
    );
  }

  @Test
  void next_date_february_28_non_leap_year() {
    Date today = new Date(2023, 2, 28);
    Date expectedTomorrow = new Date(2023, 3, 1);

    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void to_string_returns_expected_format() {
    Date date = new Date(2024, 3, 15);

    assertEquals("2024/March/15", date.toString());
  }

  @Test
  void equals_returns_false_for_non_date_object() {
    Date date = new Date(2024, 3, 15);

    assertFalse(date.equals("2024/March/15"));
  }

  @Test
  void equals_returns_false_for_different_year() {
    Date date1 = new Date(2024, 3, 15);
    Date date2 = new Date(2025, 3, 15);

    assertFalse(date1.equals(date2));
  }

  @Test
  void equals_returns_false_for_different_month() {
    Date date1 = new Date(2024, 3, 15);
    Date date2 = new Date(2024, 4, 15);

    assertFalse(date1.equals(date2));
  }

  @Test
  void equals_returns_false_for_different_day() {
    Date date1 = new Date(2024, 3, 15);
    Date date2 = new Date(2024, 3, 16);

    assertFalse(date1.equals(date2));
  }

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Date#