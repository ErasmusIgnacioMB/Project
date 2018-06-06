package clases;

import java.util.Scanner;

import interfaces.EntradaSalidaIn;

public class EntradaSalida  implements EntradaSalidaIn {

    public


        Scanner entrada = new Scanner(System.in);


        public void mostrarMenu() {


            System.out.println("------ Sección clientes ------");
            System.out.println("1.- Dar de alta un nuevo particular");
            System.out.println("2.- Dar de alta una nueva empresa");
            System.out.println("3.- Borrar un cliente");
            System.out.println("4.- Recuperar datos de un cliente a partir del DNI");
            System.out.println("5.- Recuperar listado de clientes");

            System.out.println("------ Sección llamadas ------");
            System.out.println("6.- Dar de alta una llamada");
            System.out.println("7.- Listar todas las llamadas de un cliente");

            System.out.println("------ Sección facturas------");
            System.out.println("7.- Emitir una factura para un cliente, calculando el importe de la misma en función de las llamadas");
            System.out.println("8.- Recuperar los datos de una factura a partir de su código");
            System.out.println("9.- Recuperar todas las facturas de un cliente");
            System.out.println("10.- Salir");
        }


        public int opcion() {

            System.out.println("Introduzca su opción: ");
            return entrada.nextInt();

        }

        public String getNombre() {

            System.out.println("Introduzca el nombre: ");
            return entrada.nextLine();
        }

        public String getApellidos() {

            System.out.println("Introduzca los apellidos: ");
            return entrada.nextLine();
        }

        public String getNumero(){

            System.out.println("Introduzca el número: ");
            return entrada.nextLine();

        }

        public int getCodigo(){

            System.out.println("Introduzca el código: ");
            return entrada.nextInt();

        }

        public int getDuracion(){

            System.out.println("Introduzca la duración de la llamada: ");
            return  entrada.nextFloat();

        }


        public String getDNI() {

            System.out.println("Introduzca el DNI: ");
            return entrada.nextLine();
        }

        public String getMail(){

            System.out.println("Introduzca el mail: ");
            return entrada.nextLine();
        }

        public String getDireccion(){

            System.out.println("Introduzca la dirección: ");
            return entrada.nextLine();
        }

        public String getTarifa(){

        System.out.println("Introduzca la tarifa: ");
        return entrada.nextLine();

        }

        public int[] fechaInicio() {
            int[] fechaInicio = new int[6];
            System.out.print("FECHA DE INICIO: ");
            String fecha = entrada.nextLine();
            String[] Fecha = fecha.split(" ");
            fechaInicio[0] = Integer.parseInt(Fecha[0]);
            fechaInicio[1]= Integer.parseInt(Fecha[1])-1;
            fechaInicio[2]= Integer.parseInt(Fecha[2]);
            fechaInicio[3]= Integer.parseInt(Fecha[3]);
            fechaInicio[4] = Integer.parseInt(Fecha[4]);
            fechaInicio[5] = Integer.parseInt(Fecha[5]);
            return fechaInicio;
        }

        public int[] fechaFin() {
            int[] fechaFin = new int[6];
            System.out.print("FECHA DE FIN: ");
            String fecha = entrada.nextLine();
            String[] Fecha = fecha.split(" ");
            fechaFin[0] = Integer.parseInt(Fecha[0]);
            fechaFin[1]= Integer.parseInt(Fecha[1])-1;
            fechaFin[2]= Integer.parseInt(Fecha[2]);
            fechaFin[3]= Integer.parseInt(Fecha[3]);
            fechaFin[4] = Integer.parseInt(Fecha[4]);
            fechaFin[5] = Integer.parseInt(Fecha[5]);
            return fechaFin;
        }



}


