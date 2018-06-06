package clases;

public class Direccion {

	private String codPostal;
	private String provincia;
	private String poblacion;
	
	public Direccion(String cosPostal, String provincia, String poblacion){
		
		this.codPostal=codPostal;
		this.provincia=provincia;
		this.poblacion=poblacion;
		
	}
	public Direccion(){
		
	}
	public String getCodPostal(){
		return this.codPostal;
	}
	public String getProvincia(){
		return this.provincia;
	}
	public String getPoblacion(){
		return this.poblacion;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("codPostal: " + codPostal + " ");
		sb.append("provincia: " + provincia + " ");
		sb.append("poblacion: " + poblacion + " ");
		return sb.toString();
	}
}

