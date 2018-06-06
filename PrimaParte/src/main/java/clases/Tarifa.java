package clases;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Tarifa {
	private float numero;
	
	public Tarifa(float tarifa){
		
		this.numero=tarifa;					
	}
	public Tarifa(){
		
	}
	public float calcularImporte(HashSet <Llamada> llamadasFacturadas){
		float duracionTotal=0;
		float dineros=0;
		Iterator<Llamada> iter = llamadasFacturadas.iterator();
		while(iter.hasNext()){
			Llamada aux= iter.next();
			
			duracionTotal=duracionTotal+aux.getDuracion();
		}
		dineros=duracionTotal * numero;
		return dineros;
		
	}
	
}
