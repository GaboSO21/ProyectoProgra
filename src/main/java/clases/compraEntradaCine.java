package clases;

import javax.swing.JOptionPane;

public class compraEntradaCine {

    ventasCine ventas = new ventasCine();

    public void pedirDatosInternet(){

        ventas.setPelicula(JOptionPane.showInputDialog(null, "Digite el nombre de la pelicula: "));
        ventas.setNoFactura((int)(Math.random() * 20000) + 10000);
        ventas.setAsiento((int)(Math.random() * 100) + 1);

    }
    
    public void mostrarDatosInternet(){

        String S = "";
        S += "Pelicula: " + ventas.getPelicula() + "\nNumero de factura: " + ventas.getNoFactura() + "\nAsiento: " + ventas.getAsiento() + "\nPrecio de entrada: " + ventas.getPrecioEntradaInternet();
        JOptionPane.showMessageDialog(null, S);

    }

    public void pedirDatosVentanilla(){

        ventas.setPelicula(JOptionPane.showInputDialog(null, "Digite el nombre de la pelicula: "));
        ventas.setNoFactura((int)(Math.random() * 20000) + 10000);
        ventas.setAsiento((int)(Math.random() * 100) + 1);

    }

    public void mostrarDatosVentanilla(){

        String S = "";
        S += "Pelicula: " + ventas.getPelicula() + "\nNumero de factura: " + ventas.getNoFactura() + "\nAsiento: " + ventas.getAsiento() + "\nPrecio de entrada: " + ventas.getPrecioEntradaVentanilla();
        JOptionPane.showMessageDialog(null, S);

    }



}
