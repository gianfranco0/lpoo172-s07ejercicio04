/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrando mensaje al usuario
        System.out.print("INGRESE NUMERO DE MINUTOS:   ");
        int minutes = input.nextInt();
        
        //Calcular el numero de años y dias
        int years = minutes / 5256000 ;
        int days = (minutes % 5256000)/1440;
        
        //Mostrando resultados
        System.out.println(minutes+ "minutos son aproximadamente "+years+"años"+days+"dias");
    }
}
