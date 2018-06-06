package clases;

import interfaces.GestorClientes;

/**
 * Created by charly on 3/3/17.
 */
public class Menu implements GestorClientes {

    EntradaSalida entradasalida;
    Gestor gestor;

    public Menu(EntradaSalida EntradaSalida, Gestor gestor) {

        this.entradasalida = EntradaSalida;
        this.gestor = gestor;
    }


    public void startMenu() {


        while (true) {

            startMenu();
            int op= entradasalida.opcion();
            boolean bool=true;

            switch (bool==true){

                case 1:

                    nuevoParticular();
                    break;

                case 2:

                    nuevaEmpresa();
                    break;

                case 3:

                    borrarCliente();
                    break;

                case 4:

                    datosDNI();
                    break;

                case 5:

                    listarClientes();
                    break;

                case 6:

                    añadirLlamada();
                    break;
                case 7:

                    emiteFactura();
                    break;

                case 8:

                    facturaCodigo();
                    break;

                case 9:

                    todasFacturas();
                    break;

                case 10:

                    System.out.println("Saliendo...");
                    bool=false;

                default:

                    System.out.println("Dato introcducido erróneo");

            }
        }
    }

    private void nuevoParticular(){

        gestor.añadirParticular(entradasalida.getNombre(), entradasalida.getApellidos(), entradasalida.getDNI(); entradasalida.getMail(), new Tarifa(entradasalida.getTarifa());

    }

    private void nuevaEmpresa() {

        gestor.añadirEmpresa(entradasalida.getNombre(), entradasalida.getDNI(), entradasalida.getDireccion(),
                new Tarifa(entradasalida.getTarifa()), entradasalida.getMail());

    }

    private void borrarCliente(){

        gestor.borrarCliente(entradasalida.getDNI());
    }

    private void datosDNI(){

        gestor.recuperaDatosPorDNI(entradasalida.getDNI());
    }

    private void listarClientes(){

        gestor.listarClientes();
    }

    private void addLlamada(){

        gestor.añadirLlamada(entradasalida.getDNI(), entradasalida.getNumero(), entradasalida.getDuracion());
    }

    private void verLlamadas(){

        gestor.verLlamadas(entradasalida.getDNI());
    }

    private void emiteFactura(){

        gestor.añadirFactura(entradasalida.fechaInicio(), entradasalida.fechaFin());
    }

    private void facturaCodigo(){

        gestor.verFactura(entradasalida.getDNI(), entradasalida.getCodigo());
    }

    private void todasFacturas(){

        gestor.verFacturas(entradasalida.getDNI());
    }
}
