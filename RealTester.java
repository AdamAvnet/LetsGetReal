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
		RealNumber test2 = new RealNumber(3.5);
		RealNumber test3 = new RealNumber(3.500000001);
		System.out.println("Close Equals Test (true): " + test2.equals(test3));

		RationalNumber num = new RationalNumber(4, 0);
		RationalNumber num1 = new RationalNumber(-10, -8);
		RationalNumber num2 = new RationalNumber(2, 3);
		RationalNumber num3 = new RationalNumber(5, 6);
		RationalNumber num4 = new RationalNumber(-525, 65);
		RationalNumber num5 = new RationalNumber(0, 1);
		RationalNumber num6 = new RationalNumber(-5, 72);
		System.out.println("First RationalNumber: " + num);
		System.out.println("Second RationalNumber: " + num1);
		System.out.println("Addition Test (should be 5/4): " + num.add(num1));
		System.out.println("Addition Test 2 (should be 23/12): " + num.add(num2));
		System.out.println("Subtraction Test (should be 0/1): " + num3.subtract(num3));
		System.out.println("Subtraction Test 2 (should be 2/3): " + num.subtract(num1));
		System.out.println("Reduce Test (should be -105/13): " + num4.add(num5));
		System.out.println("Multiplication Test (should be 5/6): " + num.multiply(num1));
		System.out.println("Multiplication Test 2 (should be 25/24): " + num.multiply(num1));
		System.out.println("Division Test (should be -65/504): " + num.divide(num4));
		System.out.println("Division Test (should be 13/7): " + num.divide(num6));
		
		
		
	}
}