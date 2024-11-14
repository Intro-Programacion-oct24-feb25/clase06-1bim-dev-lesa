/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del estudiante");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad del estudiante");
        int edad = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Ingrese la Universidad del estudiante");
        String universidad = entrada.nextLine();
        String inicial = nombre.toLowerCase();
        char inicial2 = inicial.charAt(0); 
    
        switch(inicial2){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s %s con edad %d, es un estudiante de %s",
                        nombre.toLowerCase(), apellido.toLowerCase(), 
                        edad, universidad);
                break;
            
            default:
                System.out.printf("%s %s con edad %d, es un estudiante de %s",
                        nombre.toUpperCase(), apellido.toUpperCase(), 
                        edad, universidad);
                break;
                
        }
        
    }
}
