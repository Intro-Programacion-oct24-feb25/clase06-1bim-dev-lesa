/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        
        //cambia todo a mayusculas
        ciudad = ciudad.toUpperCase();
        //cambia todo a minusculas
        System.out.printf("%s\n", ciudad.toLowerCase());
        // System.out.printf("%s\n", ciudad.toUpperCase());
        //imprime LOJA, no loja, pq no actualizamos o asignamos u nuveo valor a  ciudad, sino que en el print ponemos un caso
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un método
        // toUpperCase es un método
        
    }
}
