public class RealNumber{

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
	
	public boolean equals(RealNumber other){
		if((value == 0 && other.getValue() != 0) || (other.getValue() == 0 && value != 0))
			return false;
		if(Math.abs(value - other.getValue()) / value <= 0.00001)
			return true;
		return false;
	}
		

	public RealNumber add(RealNumber other){
		value = value + other.getValue();
		return new RealNumber(value);
	}

	public RealNumber multiply(RealNumber other){
		value = value * other.getValue();
		return new RealNumber(value);
	}

	public RealNumber divide(RealNumber other){
		value = value / other.getValue();
		return new RealNumber(value);
	}

	public RealNumber subtract(RealNumber other){
		value = value - other.getValue();
		return new RealNumber(value);
	}
}