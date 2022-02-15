package mates;

public class Matematicas{
	public static double generarNumeroPiIterativo(long pasos){
		int i = 0;
		int count = 0;
		double pi = 0;
		double x = 0;
		double y = 0;
		while(i < n) {
			x = Math.random();
			y = Math.random();
			if ((x * x) + (y * y) < 1) {
				count++;
			}
			i++;
		}
		pi = 4 * (count / n);
		return pi;
	}
	
	public static void main(String[] args) {
		Matematicas problema = new Matematicas();
		double pi = 0;
		pi = problema.countPI(300000);

		System.out.println ("El valor es: ");
	}
}
