package util;

public class Calculator {
	
	public static final double PI = 3.14159; // PI é constante e estático
	
	// O valor dos calculos são estáticos, pode ser calculado independente de objetos
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
