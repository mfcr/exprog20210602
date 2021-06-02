package fp.daw.exprog20210602.ejercicio3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio3 {


	public static void main(String[] args) {
		Queue<Integer> cola=new ArrayDeque<>();
		cola.add(2);		cola.add(13);		cola.add(-42);		cola.add(21);		cola.add(4);
		cola.add(9);		cola.add(14);		cola.add(-3);		cola.add(11);		cola.add(5);
		try {
			//Para hacer pruebas ir comentando y descomentando ya que al modificar la cola
			//  cada llamada envia un array distinto
			System.out.println("Cola enviada: "+cola+ "./n invertir(-10,cola): "+invertir(-10,cola));
			System.out.println("Cola enviada: "+cola+ "./n invertir(0,cola): "+invertir(0,cola));
			System.out.println("Cola enviada: "+cola+ "./n invertir(3,cola): "+invertir(3,cola));
			System.out.println("Cola enviada: "+cola+ "./n invertir(7,cola): "+invertir(7,cola));
			System.out.println("Cola enviada: "+cola+ "./n invertir(35,cola): "+invertir(35,cola));
			System.out.println("Cola enviada: "+cola+ "./n invertir(null,cola): "+invertir(null,cola));
		} catch (Exception e) {
			System.out.println("Error en la llamada. "+e.getClass());
		}
	}
	
	public static Queue<Integer> invertir(Integer num, Queue<Integer> cola) throws IllegalArgumentException{
		if (num<=0) {return cola;}
		if (num==null || num>cola.size() ) {throw new IllegalArgumentException();} 
		Deque<Integer> pila=new ArrayDeque<>(); //Pila auxiliar
		int restoelementos=cola.size()-num; //elementos que no hay que desordenar
		for (int i=0;i<num;i++) {
			pila.push(cola.remove()); //retiramos los primeros n elementos de la cola (en una pila)
		}
		while(!pila.isEmpty()) {
			cola.add(pila.pop()); //devolvemos los elementos al final de la cola invertidos
		}
		for (int i=0;i<restoelementos;i++) {
			cola.add(cola.remove()); //El resto de elementos que no hay que tocas los pasamos al final
		}
		return cola;
	}
	
	

}
