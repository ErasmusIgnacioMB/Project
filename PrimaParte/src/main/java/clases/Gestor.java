package clases;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Gestor {
	
	private Map <String, Clientes> almacen;
	
	Gestor(){
		almacen = new HashMap <String, Clientes>();
	}
	
	public void añadirParticular(String nombre,String apellidos,Tarifa tarifa,String nif,Direccion direccion,String correo){
		if(almacen.containsKey(nif)){
			Clientes nuevo = new Particular(nombre, apellidos, nif, direccion, tarifa, correo);
			almacen.put(nuevo.getNif(), nuevo);
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public void añadirEmpresa(String nombre,Tarifa tarifa,String nif,Direccion direccion,String correo){
		if(almacen.containsKey(nif)){
			Clientes nuevo = new Empresa(nombre, nif, direccion, correo, tarifa );
			almacen.put(nuevo.getNif(), nuevo);
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public void borrarCliente(String nif){
		if(almacen.containsKey(nif)){
			almacen.remove(nif);
		}else{
			throw new IllegalArgumentException();
		}
	}

	public String recuperaDatosPorDNI(String DNI){

		String datos = "";

		if(almacen.containsKey(DNI)) {
			datos = almacen.get(DNI).toString();
		} else {
			throw new IllegalArgumentException();
		}

		return datos;

	}
	
	public void cambiar_tarifa(String nif, float tarifa){
		if(almacen.containsKey(nif)){
			almacen.get(nif).setTarifa(new Tarifa(tarifa));
		}
	}
	
	public String[] verFacturas(String nif){
		if(almacen.containsKey(nif)){
			return almacen.get(nif).verFacturas();
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public LinkedList<String> verLlamadas(String nif){
		if(almacen.containsKey(nif)){
			return almacen.get(nif).verLlamadas();
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public String verFactura(String nif, int codigo){
		if(almacen.containsKey(nif)){
			return almacen.get(nif).verFactura(codigo);
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public void añadirFactura(String nif, Calendar inicioPeriodo, Calendar finalPeriodo){
		if(almacen.containsKey(nif)){
			almacen.get(nif).nuevaFactura(inicioPeriodo, finalPeriodo);		
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	public void añadirLlamada(String nif, String numero, float duracion){
		if(almacen.containsKey(nif)){
			almacen.get(nif).nuevaLlamada(numero, duracion);
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	public String[] listarClientes(){
		int contador=0;
		String[] listaClientes = new String[almacen.size()];
		for(Clientes cli:almacen.values()){
			listaClientes[contador] = cli.toString();
			contador++;
		}
		return listaClientes;
	}
	
}
