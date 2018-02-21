package prob06;

public class Div extends Arithmetic {

	@Override
	public int calculate() {
		int a = getA();
		int b = getB();
		
		return a / b;
	}

}
