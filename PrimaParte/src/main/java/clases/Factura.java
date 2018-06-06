package clases;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Factura {
	private int codigo;
	private Calendar fecha;
	private Tarifa tarifa;
	private Calendar inicioPeriodo;
	private Calendar finalPeriodo;
	private float importe;
	private HashSet<Llamada> llamadasFacturadas;

	public Factura(){
		
	}
	public Factura(int codigo, Tarifa tarifa, Calendar inicioPeriodo, Calendar finalperiodo, HashSet<Llamada> llamadasFacturadas){
		this.codigo=codigo;
		this.tarifa=tarifa;
		this.inicioPeriodo=inicioPeriodo;
		this.finalPeriodo=finalPeriodo;
		this.llamadasFacturadas=llamadasFacturadas;
		this.importe=tarifa.calcularImporte(llamadasFacturadas);
	}
	public int getCodigo(){
		return this.getCodigo();
	}
	public Calendar getInicioPeriodo(){
		return this.getInicioPeriodo();
	}
	public Calendar getFinalPeriodo(){
		return this.getFinalPeriodo();
	}
	public float getImporte(){
		return this.getImporte();
	}
	public HashSet<Llamada> getLlamadasFacturadas(){
		return this.getLlamadasFacturadas();
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("codigo: " + codigo + " ");
		sb.append("tarifa; " + tarifa + " ");
		sb.append("Periodo: " + inicioPeriodo + " de "+ finalPeriodo + " ");
		sb.append("importe: " + importe + "  \n");
		Iterator<Llamada> iter = llamadasFacturadas.iterator();
		while(iter.hasNext()){
			Llamada aux= iter.next();
			sb.append(aux.toString()+ "\n");
		}
		return sb.toString();
	}
}
