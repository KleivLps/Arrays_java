import java.util.Scanner;

public class promediandoElementos {
    public static void main(String[] args) {
        Scanner elementos = new Scanner(System.in);

        int[] numeros = new int[4];

        int suma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Hola, ingresa el numero " +(i + 1) + ": ");
            if (elementos.hasNextInt()) {
                numeros[i] = elementos.nextInt();
                suma += numeros[i];
            } else {
                System.out.println("Entrada no valida. Por favor, ingresa un numero entero.");
                elementos.next();
                i--;
            }
        }
        double numeroPromedio = suma / 4.0;

        System.out.println("La suma de los elementos del array es: " +suma);
        System.out.println("El promedio de los elementos del array es: " +numeroPromedio);

        elementos.close();
    }
}
