package clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class Clientes  {
		
	
	private String nombre;
	private String nif;
	private Direccion direccion;
	private String correo;
	private Calendar fechaAlta;
	private Tarifa tarifa;
	private List<Factura> listaFacturas;
	private Set<Llamada> listaLlamadas;
	
public Clientes(String nombre, String nif, Direccion direccion, String correo, Tarifa tarifa){
	this.nombre=nombre;
	this.nif= nif;
	this.direccion=direccion;
	this.correo=correo;
	this.fechaAlta=GregorianCalendar.getInstance();
	this.tarifa=tarifa;
	this.listaFacturas= new ArrayList<Factura>();
	this.listaLlamadas= new HashSet<Llamada>();
	
}
public Clientes(){
	
}

	public String getNombre(){
		return this.getNombre();
	}
	public String getNif(){
		return this.getNif();
	}
	public Direccion getDireccion(){
		return this.getDireccion();
	}
	public String getCorreo(){
		return this.getCorreo();
	}
	public Tarifa getTarifa(){
		return this.getTarifa();
	}
	public void setTarifa(Tarifa tarifa){
		this.tarifa = tarifa;
	}

	public String verFactura(int codigo){
		return listaFacturas.get(codigo).toString();
	}
	public String[] verFacturas(){
		String[] stringFacturas = new String[listaFacturas.size()];
		for(int i=0; i<listaFacturas.size();i++){
			stringFacturas[i]=listaFacturas.get(i).toString();
		}
		return stringFacturas;
		
	}
	public LinkedList<String> verLlamadas(){
		LinkedList<String> stringLlamadas = new LinkedList<String>();//tamaño
		for(int i=0; i<listaFacturas.size();i++){
			Iterator<Llamada> iter = listaFacturas.get(i).getLlamadasFacturadas().iterator();
			while(iter.hasNext()){
				Llamada aux= iter.next();
				stringLlamadas.add(aux.toString());
			}
		}
		Iterator<Llamada> iter = listaLlamadas.iterator();
		while(iter.hasNext()){
			Llamada aux= iter.next();
			stringLlamadas.add(aux.toString()); 
			
		}
		return stringLlamadas;
	}
	public void nuevaFactura(Calendar inicioPeriodo, Calendar finalPeriodo ){
		HashSet<Llamada> llamadasFacturadas = extraerLlamadasFacturar(inicioPeriodo, finalPeriodo);
		Factura nueva = new Factura(listaFacturas.size(), tarifa, inicioPeriodo, finalPeriodo, llamadasFacturadas);
		listaFacturas.add(nueva);
	}
	public void nuevaLlamada(String numero,float duracion){
		Llamada nueva = new Llamada(numero ,  duracion);
		listaLlamadas.add(nueva);
		
	}
	private HashSet<Llamada> extraerLlamadasFacturar(Calendar inicioPeriodo,Calendar finalPeriodo){
		Iterator<Llamada> iter = listaLlamadas.iterator();
		HashSet<Llamada> listaLlamadasSinFacturar= new HashSet<Llamada>();
		while(iter.hasNext()){
			Llamada aux= iter.next();
			if(aux.getFecha().compareTo(finalPeriodo)<0 && aux.getFecha().compareTo(inicioPeriodo)>0){
				listaLlamadasSinFacturar.add(aux);
			}
		}
		listaLlamadas.removeAll(listaLlamadasSinFacturar);
		return listaLlamadasSinFacturar;
	}

	public String toString() {

		StringBuilder sb=new StringBuilder();

		sb.append("Nombre "+nombre+" ");
		sb.append("DNI "+nif+" ");
		sb.append("Mail "+correo+" ");
		sb.append("Dirección "+direccion+" ");
		sb.append("Tarifa "+tarifa+" ");
		sb.append("Fecha alta "+fechaAlta+".");

		return sb.toString();


	}
}
