package util;

public class Cambio {
	
	public static double IOF = 0.06;
	
	public static double dolarParaReal(double dolar, int quantia) {
		return quantia * dolar * (1 + IOF);
	}
}
