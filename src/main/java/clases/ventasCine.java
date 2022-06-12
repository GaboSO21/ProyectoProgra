package clases;

public class ventasCine {
    
    private String pelicula;
    private int noFactura;
    private int asiento;
    private String ventanilla;
    private int precioEntradaVentanilla;
    private int precioEntradaInternet;

    public ventasCine(){

        this.pelicula = "";
        this.noFactura = 0;
        this.asiento = 0;
        this.ventanilla = "";
        this.precioEntradaVentanilla = 3600;
        this.precioEntradaInternet = 4000;

    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getVentanilla() {
        return ventanilla;
    }

    public void setVentanilla(String ventanilla) {
        this.ventanilla = ventanilla;
    }

    public int getPrecioEntradaVentanilla() {
        return precioEntradaVentanilla;
    }

    public void setPrecioEntradaVentanilla(int precioEntradaVentanilla) {
        this.precioEntradaVentanilla = precioEntradaVentanilla;
    }

    public int getPrecioEntradaInternet() {
        return precioEntradaInternet;
    }

    public void setPrecioEntradaInternet(int precioEntradaInternet) {
        this.precioEntradaInternet = precioEntradaInternet;
    } 

    



}
