package clases;

import javax.swing.JOptionPane;

public class persona {

    private String nombre;
    private String apellido;
    private String edad;
    private String cedula;

    public persona() {

        this.nombre = "";
        this.apellido = "";
        this.edad = "";
        this.cedula = "";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void pedirDatos(){

        setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        setApellido(JOptionPane.showInputDialog(null, "Digite su apellido:"));
        setEdad(JOptionPane.showInputDialog(null, "Digite su edad"));
        setCedula(JOptionPane.showInputDialog(null, "Digite su cedula"));

    }

    public void mostrarDatos(){

        String S = "";
        S += "Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nCedula: " + getCedula(); 
        JOptionPane.showMessageDialog(null, S);
    
    }

}
