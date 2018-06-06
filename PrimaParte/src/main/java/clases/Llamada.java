package clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Llamada {
	private String numero;
	private Calendar fecha;
	private float duracion; //Lo almacenaremos en segundos para luego operarlo.
	
	public Llamada(String numero, float duracion){
		this.numero=numero;
		this.fecha=GregorianCalendar.getInstance();
		this.duracion=duracion;
		
	}
	public Llamada(){
		
	}
	public int getNumero(){
		return this.getNumero();
	}
	public Calendar getFecha(){
		return this.getFecha();
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("numero" +numero + " ");
		sb.append("Fecha " + fecha.get(Calendar.DATE)+ " ");
		sb.append("Hora " + fecha.get(Calendar.HOUR)+ " ");
		sb.append("duración "+ duracion);
		return sb.toString();
				
	}
	public float getDuracion(){
		return this.getDuracion();
	}
	
}
