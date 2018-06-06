package clases;

public class Empresa extends Clientes{

	public Empresa(String nombre, String nif, Direccion direccion, String correo, Tarifa tarifa){
		super(nombre, nif, direccion,correo, tarifa);
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: "+ getNombre() + " ");
		sb.append("NIF: " + getNif() + " ");
		sb.append("direccion: "+ super.getDireccion() + " ");
		sb.append("correo: " + getCorreo() +" ");
		sb.append("tarifa: " + super.getTarifa() + " ");
		return sb.toString();
	}
}
