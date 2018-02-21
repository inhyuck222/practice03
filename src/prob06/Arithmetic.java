package prob06;

public abstract class Arithmetic {
	private int a;
	private int b;
	
	abstract public int calculate();
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;		
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}
