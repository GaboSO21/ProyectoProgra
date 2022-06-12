package clases;

import javax.swing.JOptionPane;

public class ventasComida {
    
    private int a;


    private String menu[][] = {
        {
            "Menu 1:                                        Menu 2:                                    Menu 3:                                       Menu 4:",
            "Palomitas normales                Pizza Hawaiana                     Palomitas cheddar                   Palomitas de mantequilla",
            "Nachos                                        Palomitas de caramelo       Wrap                                           Pizza bulgara",
            "Hot Dog                                       Hamburguesa Pizza             Peperonni                                    Sprite",
            "Coca                                            Dedos de queso                     Ensalada                                   Palo salchicha",
            "Precio: 5000                               Precio: 7000                           Precio: 6000                            Precio: 7500"
        }
        
        
    };

    public void mostrarMenu(){

        JOptionPane.showMessageDialog(null, menu);

    }

    public void escogerMenu(){

    persona Persona = new persona();
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del menu deseado: "));
    switch (a){
        case 1:
        JOptionPane.showMessageDialog(null, "Usted a escogido el Menu 1:");
        Persona.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        Persona.setApellido(JOptionPane.showInputDialog(null, "Ingrese su apellido: "));
        Persona.setCedula(JOptionPane.showInputDialog(null, "Ingrese su cedula"));
        Persona.setEdad(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "Usted a escogido el Menu 2:");
        Persona.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        Persona.setApellido(JOptionPane.showInputDialog(null, "Ingrese su apellido: "));
        Persona.setCedula(JOptionPane.showInputDialog(null, "Ingrese su cedula"));
        Persona.setEdad(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "Usted a escogido el Menu 3:");
        Persona.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        Persona.setApellido(JOptionPane.showInputDialog(null, "Ingrese su apellido: "));
        Persona.setCedula(JOptionPane.showInputDialog(null, "Ingrese su cedula"));
        Persona.setEdad(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
        break;
        case 4:
        JOptionPane.showMessageDialog(null, "Usted a escogido el Menu 4:");
        Persona.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        Persona.setApellido(JOptionPane.showInputDialog(null, "Ingrese su apellido: "));
        Persona.setCedula(JOptionPane.showInputDialog(null, "Ingrese su cedula"));
        Persona.setEdad(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
        break;
        default:
        JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta.","Error",JOptionPane.ERROR_MESSAGE);
        escogerMenu();
    }

    }

}
