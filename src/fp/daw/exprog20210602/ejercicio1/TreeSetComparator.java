package fp.daw.exprog20210602.ejercicio1;

import java.util.Comparator;

class TreeSetComparator implements Comparator<Alumno> {
	@Override
    public int compare(Alumno al1, Alumno al2)	    {
    	if (al1.equals(al2)) { return 0;}
    	if (al1.getCiclo().equals(al2.getCiclo())) {
    		if (al1.getCurso()==al2.getCurso()) {
    			return al1.compareTo(al2); //Resto de ordenacion como se establece en la clase (apellidos y nombre)
    		} else if (al1.getCurso()<al2.getCurso()) {
    			return -1;
    		} else {
    			return 1;
    		}
    	} else if (al1.getCiclo().compareTo(al2.getCiclo())<0) {
    		return -1;
    	} else {
    		return 1;
    	}
    }
}
