public class RealNumber extends Number{

	private double value;

	public RealNumber(double v){
		value = v;
	}

	public double getValue(){
		return value;
	}

	public String toString(){
		return "" + getValue();
	}
	
	public RealNumber add(RealNumber other){
		double value2 = getValue() + other.getValue();
		return new RealNumber(value2);
	}

	public RealNumber multiply(RealNumber other){
		double value2 = getValue() * other.getValue();
		return new RealNumber(value2);
	}

	public RealNumber divide(RealNumber other){
		double value2 = getValue() / other.getValue();
		return new RealNumber(value2);
	}

	public RealNumber subtract(RealNumber other){
		double value2 = getValue() - other.getValue();
		return new RealNumber(value2);
	}
}