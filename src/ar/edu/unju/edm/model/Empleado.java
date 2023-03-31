package ar.edu.unju.edm.model;

import java.util.Date;

public class Empleado {
	
	private String nombre;
	private Date fechaIngreso;
	private Integer legajo;
	private String email;
	private Float sueldoPorHora;
	private Float horasTrabajadas;
	private String nuevaVariable;
	
	//constructor por defecto
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor parametrizado
	public Empleado(String nombre, Date fechaIngreso, Integer legajo, String email, Float sueldo,
			Float horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldoPorHora = sueldo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//métodos específicos
	public Float calcularSueldo() {
		Float sueldoAPagar = (float) 0.0;
		sueldoAPagar = sueldoPorHora * horasTrabajadas;
		
		return sueldoAPagar;
		
	}
	
	
	//getters y setters
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getSueldo() {
		return sueldoPorHora;
	}
	public void setSueldo(Float sueldo) {
		this.sueldoPorHora = sueldo;
	}
	public Float getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(Float horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	

}
