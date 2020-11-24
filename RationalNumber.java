public class RationalNumber extends Number {

	private int numerator, denominator;

	public RationalNumber(int nume, int deno){
		numerator = nume;
		denominator = deno;

		reduce();
	}

	public double getValue(){
		return (getNumerator() * 1.0) / (getDenominator() * 1.0);
	}

	public int getNumerator(){
		return numerator;
	}

	public int getDenominator(){
		return denominator;
	}

	public RationalNumber reciprocal(){
		return new RationalNumber(getDenominator(), getNumerator());
	}

	public boolean equals(RationalNumber other){
		if(getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator())
			return true;
		return false;
	}

	public String toString(){
		if(getDenominator() == 1)
		return "" + getNumerator();

		return "" + getNumerator() + "/" + getDenominator();
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
		if(getDenominator() == 0 || getNumerator() == 0){
			numerator = 0;
			denominator = 1;
		}

		if(getDenominator() < 0){
			numerator = getNumerator() * -1;
			denominator = getDenominator() * -1;
		}

		int cd = gcd(getNumerator(), getDenominator());
		numerator = getNumerator() / cd;
		denominator = getDenominator() / cd;
	}
	

	public RationalNumber multiply(RationalNumber other){
		int numerator2 = getNumerator() * other.getNumerator();
		int denominator2 = getDenominator() * other.getDenominator();
		RationalNumber product = new RationalNumber(numerator2, denominator2);
		return product;
	}

	public RationalNumber divide(RationalNumber other){
		int numerator2 = getNumerator() * other.getDenominator();
		int denominator2 = getDenominator() * other.getNumerator();
		RationalNumber quotient = new RationalNumber(numerator2, denominator2);
		return quotient;
	}

	public RationalNumber add(RationalNumber other){
		int lcm = 0;
		lcm = (getDenominator() * other.getDenominator()) / gcd(getDenominator(), other.getDenominator());
		int numerator2 = getNumerator() * (lcm / getDenominator()) + other.getNumerator() * (lcm / other.getDenominator());
		int denominator2 = lcm;
		RationalNumber sum = new RationalNumber(numerator2, denominator2);
		return sum;
	}

	public RationalNumber subtract(RationalNumber other){
		int lcm = 0;
		lcm = (getDenominator() * other.getDenominator()) / gcd(getDenominator(), other.getDenominator());
		int numerator2 = getNumerator() * (lcm / getDenominator()) - other.getNumerator() * (lcm / other.getDenominator());
		int denominator2 = lcm;
		RationalNumber difference = new RationalNumber(numerator2, denominator2);
		return difference;
	}
		
		
}


