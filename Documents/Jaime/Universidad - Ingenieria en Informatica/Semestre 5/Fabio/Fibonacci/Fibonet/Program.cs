using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fibonet
{
    // primera version 23/08/2021
    class Program  
    {
        static void Main(string[] args)
        {
            calcularSerieFinobacci(7);
            Console.ReadKey(true);
        }

        public static void calcularSerieFinobacci(int numero) //Metodo que me calcula la Serie 
        {
            int x = 0;  // Valor inicial de la serie
            int y = 1;  // Valor siguiente al inicial en la serie
            int n;      // Variable donde se almacenara el valor de la suma
            int r;
            //int aux;
            //int val = 0;

            r = numero; //llamado que discrimina si es primo o no
                        
            Console.WriteLine("Tenemos");

            for (int i = 0; i < r; i++)
            {

                bool esprimo = esPrimo(x);
                Console.WriteLine("El numero " + x + " es primo? " + esprimo + "\n");
                n = x + y;
                x = y;
                y = n;
                //val = 0;
            }
        } 

        public static bool esPrimo(int numero)  //Donde se establece si es primo y se almacena en la variable numero
        {

            if (numero == 1){
                return false;
            }

            if (numero == 0){
                return false;
            }

            else{
                
                for (int i = 2; i < numero; i++)
                {
                    if (numero % i == 0){
                        return false;
                    }
                }
                return true;
            }
        }

    }
}