package main;

import clases.Menu;
import clases.EntradaSalida;
import clases.Gestor;

public class Main {
	public static void main(String[] args){
		new Menu(new EntradaSalida(), new Gestor()).startMenu();;
	}
}
