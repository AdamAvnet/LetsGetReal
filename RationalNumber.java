public class RationalNumber extends RealNumber {

	private int numerator, denominator;

	public RationalNumber(int nume, int deno){
		super(0.0);

		numerator = nume;
		denominator = deno;

		reduce();
	}

	public double getValue(){
		return (numerator * 1.0) / (denominator * 1.0);
	}

	public int getNumerator(){
		return numerator;
	}

	public int getDenominator(){
		return denominator;
	}

	public RationalNumber reciprocal(){
		return new RationalNumber(denominator, numerator);
	}

	public boolean equals(RationalNumber other){
		if(numerator == other.numerator && denominator == other.denominator)
			return true;
		return false;
	}

	public String toString(){
		return "" + numerator + "/" + denominator;
	}

	private static int gcd(int a, int b){
		if(a == 0)
			return 1;
		if(a < 0)
			a = a * -1;

		int c = 0;
		if(b > a){
			c = b;
			b = a;
			a = c;
		}
		int r = 10;
		while (r > 0){
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	private void reduce(){
		if(denominator == 0 || numerator == 0){
			numerator = 0;
			denominator = 1;
		}

		if(denominator < 0){
			numerator = numerator * -1;
			denominator = denominator * -1;
		}

		int cd = gcd(numerator, denominator);
		numerator = numerator / cd;
		denominator = denominator / cd;
	}
	

	public RationalNumber multiply(RationalNumber other){
		int numerator2 = numerator * other.numerator;
		int denominator2 = denominator * other.denominator;
		RationalNumber product = new RationalNumber(numerator2, denominator2);
		return product;
	}

	public RationalNumber divide(RationalNumber other){
		int numerator2 = numerator * other.denominator;
		int denominator2 = denominator * other.numerator;
		RationalNumber quotient = new RationalNumber(numerator2, denominator2);
		return quotient;
	}

	public RationalNumber add(RationalNumber other){
		int lcm = 0;
		lcm = (denominator * other.denominator) / gcd(denominator, other.denominator);
		int numerator2 = numerator * (lcm / denominator) + other.numerator * (lcm / other.denominator);
		int denominator2 = lcm;
		RationalNumber sum = new RationalNumber(numerator2, denominator2);
		return sum;
	}

	public RationalNumber subtract(RationalNumber other){
		int lcm = 0;
		lcm = (denominator * other.denominator) / gcd(denominator, other.denominator);
		int numerator2 = numerator * (lcm / denominator) - other.numerator * (lcm / other.denominator);
		int denominator2 = lcm;
		RationalNumber difference = new RationalNumber(numerator2, denominator2);
		return difference;
	}
		
		
}


