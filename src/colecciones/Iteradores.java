package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteradores {
	public static void main(String[] args) {

		// creando una colecci�n
		Set<Empleado> empleados = new HashSet<Empleado>();
		
		empleados.add(new Empleado(20, "Juan"));
		empleados.add(new Empleado(28, "Mario"));
		empleados.add(new Empleado(12, "Luis"));

		// los iteradores nos permiten recorrer los elementos de una colecci�n
		Iterator<Empleado> itEmpleados = empleados.iterator();

		// el m�todo hasNext indica si hay un elemento siguiente en la colecci�n
		while (itEmpleados.hasNext()) {

			// el m�todo next salta al siguiente elemento de la colecci�n
			Empleado empleado = itEmpleados.next();

			System.out.println(empleado);
		}
	}
}

class Empleado {

	private String nombre;
	private int edad;

	public Empleado(int edad, String nombre) {

		this.edad = edad;
		this.nombre = nombre;
	}

	public String toString() {
		return "[" + nombre + ", " + edad + "]";
	}
}