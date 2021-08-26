using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fibonet
{
    class Program
    {
        static void Main(string[] args)
        {
            calcularSerieFinobacci(10);
            Console.ReadKey(true);
        }

        public static void calcularSerieFinobacci(int numero)
        {
            int x = 0;
            int y = 1;
            int n;
            int r;
            //int aux;
            //int val = 0;

            r = numero;
                        
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

        public static bool esPrimo(int numero)
        {

            if (numero == 1)
            {
                return false;
            }
            if (numero == 0)
            {
                return false;
            }
            else
            {
                for (int i = 2; i < numero; i++)
                {
                    if (numero % i == 0)
                    {
                        return false;
                    }
                }
                return true;
            }
        }

    }
}