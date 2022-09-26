package concatenacionanamariagomez;

import java.util.Scanner;

/**
 *
 * @author Ana María Gómez Fandiño
 */
public class ConcatenacionAnaMariaGomez {
       Scanner entrada =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        Scanner entrada = new Scanner(System.in);  
        String nombre =entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido =entrada.nextLine();
        
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
    }
    
}
