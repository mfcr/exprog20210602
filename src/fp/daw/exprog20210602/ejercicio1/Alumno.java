package fp.daw.exprog20210602.ejercicio1;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumno implements Comparable<Alumno>, Serializable{
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private Integer curso;
	
	
	public Alumno (String nombre, String apellidos, LocalDate fechaNacimiento, String ciclo,Integer curso) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.ciclo=ciclo;
		this.curso=curso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public String toString() {
		return ("Nombre: "+nombre+", Apellido:"+apellidos+", fechasNac:"+fechaNacimiento.toString()+", ciclo: "+ciclo+", curso:"+curso);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((ciclo == null) ? 0 : ciclo.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (ciclo == null) {
			if (other.ciclo != null)
				return false;
		} else if (!ciclo.equals(other.ciclo))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Alumno al) {
		if (this.equals(al)) {return 0;}
		if (apellidos.compareTo(al.apellidos)<0) {
			return -1;
		} else if (apellidos.compareTo(al.apellidos)>0) {
			return 1;
		} else { //El apellido es el mismo, comprobamos el nombre.
			if (nombre.compareTo(al.nombre)==0) {
				return 0;
			} else if (nombre.compareTo(al.nombre)<0) {
				return -1;
			} else {
				return 1;
			}
		}
	}


}
