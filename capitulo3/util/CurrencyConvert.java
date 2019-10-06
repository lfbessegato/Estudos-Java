package course.capitulo3.util;

public class CurrencyConvert {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}

}
