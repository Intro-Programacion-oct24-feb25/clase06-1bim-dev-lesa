/*


 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese su dia de nacimiento");
        int diaNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese el numero de su mes de nacimiento");
        int mesNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su año de nacimiento");
        int yearNacimiento = entrada.nextInt();
        
        String mesCadena= "";
        switch (mesNacimiento) {
            case 1:
                mesCadena = "ENERO";
                break;

            case 2:
                mesCadena = "FEBRERO";
                break;

            case 3:
                mesCadena = "MARZO";
                break;

            case 4:
                mesCadena = "ABRIL";
                break;

            case 5:
                mesCadena = "MAYO";
                break;

            case 6:
                mesCadena = "JUNIO";
                break;

            case 7:
                mesCadena = "JULIO";
                break;
                
            case 8:
                mesCadena = "AGOSTO";
                break;
                
            case 9:
                mesCadena = "SEPTIEMBRE";
                break;
                
            case 10:
                mesCadena = "OCTUBRE";
                break;
                
            case 11:
                mesCadena = "NOVIEMBRE";
                break;
                
            case 12:
                mesCadena = "DICIEMBRE";
                break;
                
            default:
                System.out.println("MES INCORRECTO");
                break;
        }
        System.out.printf("Usted ha nacido el %d de %s de %d\n",diaNacimiento, 
                mesCadena, yearNacimiento);
        
    }
}
