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


