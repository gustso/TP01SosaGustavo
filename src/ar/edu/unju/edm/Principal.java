package ar.edu.unju.edm;
import java.util.Date;

import ar.edu.unju.edm.model.Calculo;
import ar.edu.unju.edm.model.Empleado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroA = 5;
		Calculo unCalculo = new Calculo();
		System.out.println(unCalculo.determinarParidad(numeroA));
		
		System.out.println(unCalculo.calcularFactorial(numeroA));
		
		System.out.println(unCalculo.determinarBisiesto(numeroA));
		
		System.out.println(unCalculo.determinarMesDelAño(numeroA));
		
		Empleado unEmpleado = new Empleado();
		unEmpleado.setNombre("Gustavo");
		
		Empleado otroEmpleado = new Empleado("Gustavo", null, 23, "email", null, null);
	}

}
