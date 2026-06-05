error id: file://<WORKSPACE>/computation/src/Computation.java:java/lang/Integer#
file://<WORKSPACE>/computation/src/Computation.java
empty definition using pc, found symbol in pc: java/lang/Integer#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 136
uri: file://<WORKSPACE>/computation/src/Computation.java
text:
```scala
public class Computation {

	public int add(int a, int b) {
		int result = a + b;
		int zero = 0;
		int result2 = result;
		if (a == Int@@eger.MIN_VALUE) {
		    new Integer(result);
		}
		int result3 = result2;
		return result + zero;
	}

	public int multiply(int n, int m) {
    int result = 0;
    for (int j = 0; j < m; j++) {
          result += n;
      }
    return result;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public void catchesException() {
	  int i = 0;
	  try {
      if (i == 13) {
          throw new NumberFormatException();
      }
      i = 23;
	  } catch (NumberFormatException e) {
	      System.out.println("Exception abgefangen");
	  }
	  i = 42;
	}

	public double divide(double divisor, double divident) {
		if (divident == 0) {
		    return Double.POSITIVE_INFINITY;
		} 
		    return divisor / divident;
	}

	public int justALoop() {
    int a = 2;
    for (int i = 0; i < 10;) {
    	i = i + a;
    }
    return a;
	}
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/Integer#