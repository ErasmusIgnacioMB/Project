package clases;

public class Particular extends Clientes {

	private String apellidos;
	public Particular(String nombre,String apellidos, String nif, Direccion direccion, Tarifa tarifa,  String correo){
		super(nombre, nif, direccion, correo, tarifa);
		this.apellidos=apellidos;
	}
	public Particular(){
		
	}
	public String getApellidos(){
		return this.getApellidos();
		
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: "+ super.getNombre() + " ");
		sb.append("apellidos: "+ apellidos+ " ");
		sb.append("NIF: " + super.getNif() + " ");
		sb.append("direccion: "+ super.getDireccion() + " ");
		sb.append("correo: " + getCorreo() +" ");
		sb.append("tarifa: " + super.getTarifa() + " ");
		return sb.toString();
	}
}
