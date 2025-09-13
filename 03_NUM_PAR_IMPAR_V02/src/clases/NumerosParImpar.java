package clases;

public class NumerosParImpar {
    public static void valida(int numero){
        if(numero % 2 == 0){
            System.out.println("El número "+numero+" es par");
        } else {
            System.out.println("El número "+numero+" es impar");
        }
    }
}
