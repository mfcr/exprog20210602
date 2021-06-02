package fp.daw.exprog20210602.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuencia {
	private Map<String,Integer> mapa;
	public Frecuencia(File fichero) {
		mapa=new LinkedHashMap<>();
		try (BufferedReader br=new BufferedReader(new FileReader(fichero))) {
			String linea;
			Scanner sc=null;
			while ((linea=br.readLine())!=null) {
				sc=new Scanner(linea);
				sc.useDelimiter("\\P{L}+");
				while (sc.hasNext()) {
					String estaPalabra=sc.next().toLowerCase();
					if (mapa.containsKey(estaPalabra)) {
						mapa.put(estaPalabra, mapa.get(estaPalabra)+1);
					} else {
						mapa.put(estaPalabra,1);
					}
				}
			}
			sc.close();
		} catch (Exception e) { 
			System.out.println("Error. "+e.getMessage()); 
		}
	}

	public int frecuenciaPalabra (String palabra) {
		if (mapa.get(palabra.toLowerCase())!=null) { //o mapa.containskey()
			return mapa.get(palabra.toLowerCase());
		}
		return 0;
	}

}
