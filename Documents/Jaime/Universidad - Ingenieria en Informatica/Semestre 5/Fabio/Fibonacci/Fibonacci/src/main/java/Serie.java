
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaime
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CalcularSerieFinobacci(7);  // llamado del metodo
    }

    public static void CalcularSerieFinobacci(int numero){  //metodo para realizar la serie
        int x=0 ;       //variable inicial de la serie
        int y=1 ;       //variable consecutiva a la inicial en la serie
        int n;          // utilizada para almacenar el valor de la suma
        int r;          //me almacena el dato del tipo de numero
        int aux;
        int val = 0;
                
        r =numero; //asignacion del valor
        
        System.out.println("Tenemos");
        
        for (int i = 0; i < r ;i++){
            
            boolean esprimo = esPrimo(x);
            System.out.print("El numero " + x + " es primo? " +esprimo +"\n");
            n=x+y;
            x=y;
            y=n;
            val=0;
            }
    }
    
    public static boolean esPrimo(int numero) { //definicion de si es primo o no

        if (numero == 1) {
            return false;
        } 
        if (numero == 0) {
            return false;
        } 
        else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}