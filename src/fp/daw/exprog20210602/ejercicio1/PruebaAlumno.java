package fp.daw.exprog20210602.ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.TreeSet;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno alumno1=new Alumno("Luis","fdez",LocalDate.of(2014, Month.FEBRUARY, 27),"daw",1);
		Alumno alumno2=new Alumno("Luis","alvarez",LocalDate.of(2014, Month.FEBRUARY, 27),"dam",2);
		Alumno alumno3=new Alumno("Alba","fdez",LocalDate.of(2014, Month.FEBRUARY, 27),"dam",1);
		Alumno alumno4=new Alumno("Luis","fdez",LocalDate.of(2014, Month.FEBRUARY, 27),"daw",2);
		//TreeSet ordenado por Apellido y luego nombre
		TreeSet<Alumno> primerTreeSet=new TreeSet<Alumno>();
		primerTreeSet.add(alumno1);		primerTreeSet.add(alumno2);		primerTreeSet.add(alumno3);		primerTreeSet.add(alumno4);

		System.out.println(primerTreeSet); //Mostramos sin iterar
		//Mostramos iterando (se ve mejor)
		for (Alumno al:primerTreeSet) { //El orden de ordenacion interno es el de apellido y luego nombre.
			System.out.println(al.toString());
		}

		//TreeSet ordenado por ciclo, curso, apellido y nombre.
		TreeSet<Alumno> segundoTreeSet=new TreeSet<Alumno>(new TreeSetComparator());
		segundoTreeSet.add(alumno1);		segundoTreeSet.add(alumno2);		segundoTreeSet.add(alumno3);		segundoTreeSet.add(alumno4);

		System.out.println(segundoTreeSet); //Mostramos sin iterar
		//Mostramos iterando (se ve mejor)
		for (Alumno al:segundoTreeSet) { //El orden de ordenacion interno es el de apellido y luego nombre.
			System.out.println(al.toString());
		}
		
		
		//Guardamos los TreeSet en un fichero como Objetos serializados.
		String fichero1="c:\\Users\\alumno\\TreeSet1.obj";
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fichero1))) {
			for (Alumno al:primerTreeSet) { 
				oos.writeObject(al);
			}
		} catch (IOException e) {System.out.println("Error de escritura");}
		String fichero2="c:\\Users\\alumno\\TreeSet2.obj";
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fichero2))) {
			for (Alumno al:segundoTreeSet) { 
				oos.writeObject(al);
			}
		} catch (IOException e) {System.out.println("Error de escritura");}
	}
	
	 	

}
