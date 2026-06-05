error id: file://<WORKSPACE>/computation/src/Computation.java:java/lang/Double#POSITIVE_INFINITY.
file://<WORKSPACE>/computation/src/Computation.java
empty definition using pc, found symbol in pc: java/lang/Double#POSITIVE_INFINITY.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 437
uri: file://<WORKSPACE>/computation/src/Computation.java
text:
```scala
public class Computation {

	public int add(int a, int b) {
		return a + b;
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
     
	}

	public double divide(double divisor, double divident) {
		if (divident == 0) {
		    return Double.POSITIVE_I@@NFINITY;
		} 
		    return divisor / divident;
	}

	public int justALoop() {
    	return 2;
	}
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/Double#POSITIVE_INFINITY.