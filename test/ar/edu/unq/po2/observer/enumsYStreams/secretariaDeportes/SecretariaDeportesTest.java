package ar.edu.unq.po2.observer.enumsYStreams.secretariaDeportes;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;

class SecretariaDeportesTest {

	private SecretariaDeportes secretaria;
	private List<ActividadSemanal> actividades;
	
	@BeforeEach
	void setUp() throws Exception {
	
		actividades = new ArrayList<ActividadSemanal>();
		secretaria = new SecretariaDeportes(actividades);
	
	}

	@Test
	void testTodasLasActividadesDeFutbol() {

		ActividadSemanal actividadFutbol = mock(ActividadSemanal.class);
		when(actividadFutbol.getDeporte()).thenReturn(Deporte.Futbol);
		actividades.add(actividadFutbol);
		
		List<ActividadSemanal> actividadesFutbol = secretaria.todasLasActividadesDeFutbol();
		
		assertEquals(1, actividadesFutbol.size());
		assertEquals(actividadesFutbol.getFirst().getDeporte(), Deporte.Futbol);
		
	}
	
	@Test
	void testActividadesDeComplijidad() {
		
		ActividadSemanal actividad = mock(ActividadSemanal.class);
		when(actividad.getComplejidad()).thenReturn(1);
		actividades.add(actividad);
		
		List<ActividadSemanal> actividades = secretaria.actividadesDeComplejidad(1);
		
		assertEquals(1, actividades.size());
		assertEquals(1, actividades.getFirst().getComplejidad());
		
	}
	
	@Test
	void testCantidadTotalHorasActividades() {
		
		ActividadSemanal actividad = mock(ActividadSemanal.class);
		Duration duracion = mock(Duration.class);
		when(actividad.getDuracion()).thenReturn(2);
		actividades.add(actividad);
		
		int horasTotales = secretaria.cantidadDeHorasActividades();
		
		assertEquals(2, horasTotales);
		
	}

	@Test
	void testActividadDeMenorCostoDeDeporte() {
		
		ActividadSemanal actividad1 = mock(ActividadSemanal.class);
		ActividadSemanal actividad2 = mock(ActividadSemanal.class);
		when(actividad1.getDeporte()).thenReturn(Deporte.Basket);
		when(actividad2.getDeporte()).thenReturn(Deporte.Basket);
		when(actividad1.costo()).thenReturn(100.0d);
		when(actividad2.costo()).thenReturn(200.0d);
		actividades.add(actividad1);
		actividades.add(actividad2);
		
		ActividadSemanal actividadMenorCosto = secretaria.actividadDeMenorCostoDeDeporte(Deporte.Basket);

		assertEquals(Deporte.Basket, actividadMenorCosto.getDeporte());
		assertEquals(100.0d, actividadMenorCosto.costo());
		
	}
	
	@Test
	void testActividadEconomicaPorDeporte() {
		
		ActividadSemanal actividadBasket1 = mock(ActividadSemanal.class);
		ActividadSemanal actividadBasket2 = mock(ActividadSemanal.class);
		ActividadSemanal actividadFutbol1 = mock(ActividadSemanal.class);
		ActividadSemanal actividadFutbol2 = mock(ActividadSemanal.class);
		when(actividadBasket1.getDeporte()).thenReturn(Deporte.Basket);
		when(actividadBasket2.getDeporte()).thenReturn(Deporte.Basket);
		when(actividadBasket1.costo()).thenReturn(100.0d);
		when(actividadBasket2.costo()).thenReturn(200.0d);
		when(actividadFutbol1.getDeporte()).thenReturn(Deporte.Futbol);
		when(actividadFutbol2.getDeporte()).thenReturn(Deporte.Futbol);
		when(actividadFutbol1.costo()).thenReturn(100.0d);
		when(actividadFutbol2.costo()).thenReturn(200.0d);
		actividades.add(actividadBasket1);
		actividades.add(actividadBasket2);
		actividades.add(actividadFutbol1);
		actividades.add(actividadFutbol2);
		
		Map<Deporte, ActividadSemanal> actividadesPorDeporte = secretaria.actividadEconomicaPorDeporte();
		
		assertEquals(null, actividadesPorDeporte.get(Deporte.Running));
		assertEquals(actividadFutbol1, actividadesPorDeporte.get(Deporte.Futbol));
		assertEquals(actividadBasket1, actividadesPorDeporte.get(Deporte.Basket));
		assertEquals(null, actividadesPorDeporte.get(Deporte.Tennis));
		assertEquals(null, actividadesPorDeporte.get(Deporte.Jabalina));
		
	}

}
