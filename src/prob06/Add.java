package prob06;

public class Add extends Arithmetic {

	@Override
	public int calculate() {
		int a = getA();
		int b = getB();
		
		return a+b;
	}

}
