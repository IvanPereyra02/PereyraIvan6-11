package calcu;

public class Calculator {

    public int suma(int numero1,int numero2){
        return numero1 + numero2;

    }
    public int resta (int numero1, int numero2){
        return numero1 - numero2;

    }
    public int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }
    public int divicion (int numero1, int numero2){
        return numero1 / numero2;
    }
    public double [] cuadratica (int numero1, int numero2, int numero3){
        return (int) (- numero2  +- Math.sqrt(numero2 ^ 2 - 4*numero1*numero3) / 2 * numero1);

    }
}
