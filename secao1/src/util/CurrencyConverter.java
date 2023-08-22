package util;

public class CurrencyConverter {

	  public static final double IOF = 0.06;
	  
		public static double converter(double price, double comprado){
			return (comprado * price) + (price * comprado* IOF);
			
		}
	}

