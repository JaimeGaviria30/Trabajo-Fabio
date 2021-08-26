
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
    calcularSerieFinobacci(7);
    }

    public static void calcularSerieFinobacci(int numero){
        int x=0 ; 
        int y=1 ; 
        int n;
        int r;
        int aux;
        int val = 0;
                
        r =numero;
        
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
    
    public static boolean esPrimo(int numero) {

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