import java.util.Scanner;

public class sumarPosicionesPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0 ; i < 5; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numeros[i] = scanner.nextInt();
            } else {
                System.out.println("Entrada no valida, por favor ingrese un numero entero.");
                scanner.next();
                i--;
            }
        }

        int suma = numeros[0] + numeros[2] + numeros[4];

        System.out.println("La suma de los numeros pares es: " +suma);

        scanner.close();
    }
}
