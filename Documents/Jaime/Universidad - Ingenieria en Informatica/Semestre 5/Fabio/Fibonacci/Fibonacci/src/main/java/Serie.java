
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
    Scanner numero = new Scanner(System.in);
        int x=0 ; 
        int y=1 ; 
        int n;
        int r;
        int aux;
        int val = 0;
                
        System.out.println ("Introduce un numero para hallar el Fibonacci: ");
        r = numero.nextInt();
        
        System.out.println("Tenemos");
        
        for (int i = 0; i < r ;i++){
            
            System.out.print(x);
            
            for (int j = 2; j < x; j++){
                
                    aux= x % j;

                    if (aux==0){
                    val=1;
                    }
                }

                if (val == 1){
                    System.out.println("no es primo");
                }
                else{
                    System.out.println(" no es primo");
                }
                
            n=x+y;
            x=y;
            y=n;
            val=0;
            }
    }      
            
}
