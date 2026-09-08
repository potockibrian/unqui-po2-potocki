package ar.edu.unq.po2.tp5;

import java.time.LocalDate;

public class Persona implements Nombrable {

	private LocalDate fechaDeNacimiento;
	private String nombre;

	public Persona(String nombre, LocalDate fechaDeNacimiento) {

		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		
	}

	public String getNombre() {

		return nombre;
		
	}

	public Object getFechaNacimiento() {

		return fechaDeNacimiento;
		
	}

}
