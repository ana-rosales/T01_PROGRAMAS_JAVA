public class HolaMundo {
    public static void main(String[] a) {
        int numero = 5, temp = numero%2;

        if (a.length > 0) {
            numero = Integer.parseInt(a[0]);
            temp = numero % 2;
        }

        if(temp == 0){
            System.out.println("El número "+numero+" es par");
        } else {
            System.out.println("El número "+numero+" es impar");
        }
    }
}
