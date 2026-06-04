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
