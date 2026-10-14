package ar.edu.unq.po2.observer.enumsYStreams.secretariaDeportes;

import java.time.Duration;
import java.time.LocalTime;

public class ActividadSemanal {

	private int duracion;
	private LocalTime horaInicio;	// TODO: preguntar que se hace con este tipo de atributos
	private DiaDeLaSemana dia;
	private Deporte deporte;

	public ActividadSemanal(DiaDeLaSemana dia, LocalTime horaInicio, int duracion, Deporte deporte) {
		
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
		
	}
	
	public int getDuracion() {

		return duracion;

	}

	public Deporte getDeporte() {

		return deporte;
		
	}

	public Double costo() {

		return costoSegunDia() + costoPorComplejidad();
		
	}

	private Double costoSegunDia() {
		
		return (DiaDeLaSemana.Lunes.ordinal() <= dia.ordinal()
				|| dia.ordinal() <= DiaDeLaSemana.Miercoles.ordinal()) ? 500.0d : 1000.0d;
		
	}
	
	private Double costoPorComplejidad() {
		
		return 200.0d * deporte.getComplejidad();
		
	}
	
	public Integer getComplejidad() {

		return deporte.getComplejidad();
		
	}
	
	@Override
	public String toString() {
		
		return "Deporte: " + deporte.toString() + ". Dia: " + dia.toString() + " A LAS: " + horaInicio.toString() + ". Duración: " + duracion;
		
	}

}
