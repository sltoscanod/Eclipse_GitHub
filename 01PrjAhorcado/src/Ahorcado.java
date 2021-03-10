import java.util.Scanner;

public class Ahorcado {

	private char letra;
	private String cadena;
	private char[] aux_palabra;
	private char[] palabra;
	
	public Ahorcado() {
		Scanner sc = new Scanner (System.in);
		cadena="ana";
		
		palabra = new char [cadena.length()];
		
		for (int i = 0; i < cadena.length(); i++) {
			
			palabra[i]=cadena.charAt(i);
			aux_palabra[i]='_';
		}
		}

	
	public void ganar() {
		
		if (palabra.equals(aux_palabra)) {
			
			System.out.println("Enhorabuena, palabra acertada");
			System.out.println("Hola jijijij");
		}
	}
}
