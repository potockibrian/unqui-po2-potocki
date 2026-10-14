package ar.edu.unq.po2.observer.enumsYStreams.secretariaDeportes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretariaDeportes {

	private List<ActividadSemanal> actividades;

	public SecretariaDeportes(List<ActividadSemanal> actividades) {

		this.actividades = actividades;
		
	}

	public int cantidadDeHorasActividades() {

		return actividades.stream()
						.mapToInt(a -> a.getDuracion())
						.sum();
	
	}

	public ActividadSemanal actividadDeMenorCostoDeDeporte (Deporte basket) {

		return actividades.stream()
				.min(Comparator.comparing(a -> a.costo()))
				.get();
	
	}

	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {

		return actividades.stream()
				.filter(a -> a.getComplejidad() == complejidad)
				.toList();
	
	}

	public List<ActividadSemanal> todasLasActividadesDeFutbol() {

		return actividades.stream()
				.filter(a -> a.getDeporte() == Deporte.Futbol)
				.toList();
	
	}

	public Map<Deporte, ActividadSemanal> actividadEconomicaPorDeporte() {

		return actividades.stream()
				.collect(Collectors.groupingBy(a -> a.getDeporte()
						,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(a -> a.costo())), o -> o.get())));

	}

}
