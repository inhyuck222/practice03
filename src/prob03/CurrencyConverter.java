package prob03;

public class CurrencyConverter {
	//krw/dollar
	//krw : 1076
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	public static double toDollar( double krw ) {
		double dollar = krw / rate;
		return dollar;
	}
	
	public static double toKRW( double dollar ) {
		double krw = dollar * rate;
		return krw;
	}
	
}
