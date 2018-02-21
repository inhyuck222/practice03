package prob06;

public class Sub extends Arithmetic {

	@Override
	public int calculate() {
		int a = getA();
		int b = getB();
		
		return a - b;
	}

}
