public class RealTester {
	public static void main(String[] args){

		RealNumber test = new RealNumber(2.0);
		RealNumber test1 = new RealNumber(1.80);
		RealNumber operator = new RealNumber(0.20);
		System.out.println("RealNumber: " + test);
		System.out.println("Equals Test (false): " + test.equals(test1));
		test1.add(operator);
		System.out.println("Equals Test (true): " + test.equals(test1));
		test1.add(operator);
		System.out.println("Addition Test (should be 2.2): " + test1);
		test.multiply(test1);
		System.out.println("Multiply Test (should be 4.4): " + test);
		test.divide(test1); 
		System.out.println("Division Test (should be 2): " + test);
		test.divide(operator);
		System.out.println("Division Test (should be 10): " + test);
		test.subtract(operator);
		System.out.println("Subtraction Test (should be 9.8): " + test);
	}
}