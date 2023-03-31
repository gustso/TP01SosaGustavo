package ar.edu.unju.edm.model;

public class Calculo {
//declarar variables
	
	
//declarar constructor
	

//metodos particulares
	public String determinarParidad(int numero) {
		//estructura de control
		String auxiliar;
		if(numero %2 == 0) {
			auxiliar = "es un NUMERO PAR";
		} else {
			auxiliar = "es un NUMERO IMPAR";
		}
		return auxiliar;
	}
	
	public long calcularFactorial(int numero) {
		//if (numero<13
		int resultado = 1;
		for (int i = numero; i>0; i--) {
			resultado = i * resultado;
		}
		return resultado;
	}
	
	public String determinarBisiesto(int numero) {
		//estructura de control
		String auxiliar;
		if(numero % 4 == 0 && numero % 100 != 0 || numero % 400 == 0) {
			auxiliar = "es un AÑO BISIESTO";
		} else {
			auxiliar = "NO es un AÑO BISIESTO";
		}
		return auxiliar;
	}
	
	public String determinarMesDelAño(int numero) {
		String auxiliar;
		switch (numero) {
		case 1: auxiliar = "ENERO";
		break;
		
		case 2: auxiliar = "FEBRERO";
		break;
		
		case 3: auxiliar = "MARZO";
		break;
		
		case 4: auxiliar = "ABRIL";
		break;
		
		case 5: auxiliar = "MAYO";
		break;
		
		case 6: auxiliar = "JUNIO";
		break;
		
		case 7: auxiliar = "JULIO";
		break;
		
		case 8: auxiliar = "AGOSTO";
		break;
		
		case 9: auxiliar = "SEPTIEMBRE";
		break;
		
		case 10: auxiliar = "OCTUBRE";
		break;
		
		case 11: auxiliar = "NOVIEMBRE";
		break;
		
		case 12: auxiliar = "DICIEMBRE";
		break;
		
		default: auxiliar = "NO es un mes del AÑO";
		}
		
		return auxiliar;
	}
	
//getters y setters de las variables
}
