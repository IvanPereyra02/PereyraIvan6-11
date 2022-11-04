package calcu;

public class Calculator {

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;

    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;

    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2) {
        return numero1 / numero2;

    }
<<<<<<< HEAD
=======
       float [] Cuadratica (float numero1, float numero2, float numero3){
     float cuadrado = numero2 * numero2;
     float raiz = (float) Math.sqrt( cuadrado-4* numero1* numero3);
     float cuenta =(float) raiz;
     float verificacion = cuenta;
     if (verificacion% 2 == 0);{
         float F1 = ((-numero2)+cuenta/(2*numero1));
         float F2 = ((-numero2)-cuenta/(2*numero1));
         float [] Resultado ={F1 , F2};

         return  Resultado;

        }
    }
}
>>>>>>> aeabc68e547e96793e090e45cdfdf6a6a494e415


        public double[] cuadratica(double a, double b, double c) {
            if (a != 0) {
                double bb = b * b;
                double raiz = (double) Math.sqrt((bb) - (4 * a * (c)));
                double cuaR = ((-b) - (raiz)) / (2 * a);
                double cuaS = ((-b) + (raiz)) / (2 * a);

                return new double[]{cuaS, cuaR};
            }
            System.out.print("capo eso no es una cuadratica me caes muy mal");
            return new double[]{0};
        }
    }

