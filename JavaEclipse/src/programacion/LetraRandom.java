package programacion;

public class LetraRandom {
	
	public static void main (String [] args) {
		char caracter = (char) ((Math.random()*26)+65); //*((Math.random()*RANGO)+MINIM6) */
		System.out.println(caracter);		
	}
	
	
}