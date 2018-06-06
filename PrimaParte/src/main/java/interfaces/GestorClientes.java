package interfaces;

	import clases.Clientes;
	import clases.Direccion;
	import clases.Llamada;
	import clases.Tarifa;

	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.LinkedList;

public interface GestorClientes {


		public void añadirParticular(String nombre,String apellidos,Tarifa tarifa,String nif,Direccion direccion,String correo);
		public void añadirEmpresa(String nombre,Tarifa tarifa,String nif,Direccion direccion,String correo);
		public void borrarCliente(String nif);
		public String recuperaDatosPorDNI(String DNI);
		public void cambiar_tarifa(String nif, float tarifa);
		public String[] verFacturas(String nif);
		public LinkedList<String> verLlamadas(String nif);
		public String verFactura(String nif, int codigo);
		public void añadirFactura(String nif, Calendar inicioPeriodo, Calendar finalPeriodo);
		public void añadirLlamada(String nif, String numero, float duracion);
		public String[] listarClientes();

	}

