import java.util.Scanner;


public class numeroMaximo {
    public static void main(String[] args) {
        Scanner maximo = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            if (maximo.hasNextInt()) {
                numeros[i] = maximo.nextInt();
            } else {
                System.out.println("Entrada no valida. Por favor, ingrese un numero entero");
                maximo.next();
                i--;
            }
        }
        int numMaximo = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > numMaximo) {
                numMaximo = numeros[i];
            }
        }

        System.out.println("El valor maximo de los elementos dentro del array es: " +numMaximo);

maximo.close();
    }
}
