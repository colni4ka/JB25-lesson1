package by.epam.anastasiya.hometask1.Mathematic;

public class Gipotenuza4 {
	public static void main (String[] args) {
		double a,b; // катеты
		double c; //гипотенуза
		double r; // степень
		double s;// площадь
		a = 5;
		b = 6;
		r = 2;
		c = Math.sqrt(Math.pow(a, r) + Math.pow(b, r));
		s = a*b/2;
		System.out.println ("Гипотенуза = " + c + "\n" + "Площадь = " + s);
		
	}

}
