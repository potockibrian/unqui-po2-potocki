package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

public class EquipoDeTrabajo {

	public String nombre;
	private List<Persona> personas = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void añadirPersona(Persona persona) {
		
		personas.add(persona);
		
	}
	
	public int promedioDeEdades() {
		
		int edadesSumadas = 0;
		int cantidadPersonas = 0;
		
		for (Persona persona : personas) {
			
			edadesSumadas += persona.edad();
			cantidadPersonas++;
			
		}
		
		return edadesSumadas / cantidadPersonas; 
		
	}
	
}
