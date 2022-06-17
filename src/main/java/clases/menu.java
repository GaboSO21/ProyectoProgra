package clases;

import javax.swing.JOptionPane;

public class menu {
    
    private int escoger;
    private String opcionesGenerales[][] = {

{
    "Opcion 1:                          Opcion 2:                              Opcion 3:",
    "Compra de entrada        Compra de comidas          Salir",
}

    };


    private String opcionesEntradas[][] = {

        {

            "Opcion 1:                             Opcion 2:",
            "Compra por internet        Compra por ventanilla:",

        }

    };

    

    public void mostrarMenuCine(){

        JOptionPane.showMessageDialog(null, opcionesGenerales);

    }


    public void escogerMenuCine(){


        escoger = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su opcion:"));
        switch(escoger){
            case 1:
            JOptionPane.showMessageDialog(null, opcionesEntradas);
            escoger = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su opcion:"));
            switch (escoger){
                case 1:
                compraEntradaCine entradasInternet = new compraEntradaCine();
                entradasInternet.pedirDatosInternet();
                entradasInternet.mostrarDatosInternet();
                break;
                case 2:
                compraEntradaCine entradasVentanilla = new compraEntradaCine();
                entradasVentanilla.pedirDatosVentanilla();
                entradasVentanilla.mostrarDatosVentanilla();
                break;
                default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta.","Error",JOptionPane.ERROR_MESSAGE);
                escogerMenuCine();
            }
            break;
            case 2:
            ventasComida menuComida = new ventasComida();
            menuComida.mostrarMenu();
            menuComida.escogerMenu();
            break;
            case 3:
            break;
            default:
            JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta.","Error",JOptionPane.ERROR_MESSAGE);
            escogerMenuCine();


        }



    }


}
