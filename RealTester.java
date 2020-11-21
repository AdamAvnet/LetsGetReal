public class RealTester {
	public static void main(String[] args){

		RealNumber test = new RealNumber(2.0);
		RealNumber test1 = new RealNumber(1.80);
		RealNumber operator = new RealNumber(0.20);
		System.out.println("RealNumber: " + test);
		System.out.println("Equals Test (false): " + test.equals(test1));
		test1.add(operator);
		System.out.println("Equals Test (true): " + test.equals(test1));
		System.out.println("Addition Test (should be 2.2): " + test1.add(operator));
		System.out.println("Multiply Test (should be 4.4): " + test.multiply(test1));
		System.out.println("Division Test (should be 2): " + test.divide(test1));
		System.out.println("Division Test (should be 10): " + test.divide(operator));
		System.out.println("Subtraction Test (should be 9.8): " + test.subtract(operator));

		RationalNumber num = new RationalNumber(4, 0);
		RationalNumber num1 = new RationalNumber(-10, -8);
		RationalNumber num2 = new RationalNumber(2, 3);
		RationalNumber num3 = new RationalNumber(5, 6);
		RationalNumber num4 = new RationalNumber(-5, 6);
		System.out.println("First RationalNumber: " + num);
		System.out.println("Second RationalNumber: " + num1);
		System.out.println("Addition Test (should be 5/4): " + num.add(num1));
		System.out.println("Addition Test (should be 23/12): " + num.add(num2));
		System.out.println("Subtraction Test1 (should be 0/1): " + num3.subtract(num3));
		System.out.println("Subtraction Test (should be 2/3): " + num.subtract(num1));
		
		
	}
}