package fp.daw.exprog20210602.ejercicio2;

import java.io.File;
import java.util.Scanner;

public class PruebaFrecuencia {

	public static void main(String[] args) {
		Frecuencia frQuij=new Frecuencia(new File("C:\\Users\\alumno\\El Quijote ISO-8859-1.txt"));
		Scanner teclado=new Scanner(System.in);
		String palabra;
		System.out.println("Introduzca una palabra para comprobar el número de veces que aparece en el quijote");
		while (!(palabra=teclado.nextLine()).equals("FIN")) {
			System.out.println("La palabra "+palabra+" aparece "+frQuij.frecuenciaPalabra(palabra));
			System.out.println("Introduzca una palabra para comprobar el número de veces que aparece en el quijote");
		}
		teclado.close();
	}

}
