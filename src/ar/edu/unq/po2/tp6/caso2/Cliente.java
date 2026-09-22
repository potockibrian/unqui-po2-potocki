package ar.edu.unq.po2.tp6.caso2;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private LocalDate fechaNacimiento;
	private Double sueldoNetoMensual;
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, Double sueldoNetoMensual, Banco banco) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion= direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.banco = banco;
		this.banco.agregarCliente(this);
		
	}

	public int edad() {
		
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
		
	}

	public Double sueldoNetoMensual() {

		return sueldoNetoMensual;
		
	}

	public Double sueldoNetoAnual() {

		return sueldoNetoMensual() * 12;
		
	}

	public void solicitarCreditoHipotecario(Double monto, int plazoDeMeses, Propiedad propiedad) {

		banco.solicitarCredito(
					new SolicitudDeCreditoHipotecario(this, monto, plazoDeMeses, propiedad)
				);
		
	}

	public void solicitarCreditoPersonal(Double monto, int plazoDeMeses) {

		banco.solicitarCredito(
					new SolicitudDeCreditoPersonal(this, monto, plazoDeMeses)
				);
		
	}

}
