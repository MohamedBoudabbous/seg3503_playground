public class Computation {

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int n, int m) {
    	return n * m;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public void catchesException() {
     
	}

	public double divide(double divisor, double divident) {
		if (divident == 0) {
		    return Double.POSITIVE_INFINITY;
		} 
		    return divisor / divident;
	}

	public int justALoop() {
    	return 2;
	}
}
