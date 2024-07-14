import java.util.Scanner;

public class parEntreNumeros {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[6];
    for (int i = 0 ; i < 6; i++) {
        System.out.println("Ingresa el numero " +(i+1) + ": ");
        if (scanner.hasNextInt()) {
            numeros[1] = scanner.nextInt();
        } else {
            System.out.println("Entrada no valida, por favor ingrese un numero entero. ");
            scanner.next();
            i--;
        }
    }

    int cuentaPares = 0;
    if(numeros[0] % 2 == 0) cuentaPares++;
    if(numeros[1] % 2 == 0) cuentaPares++;
    if(numeros[2] % 2 == 0) cuentaPares++;
    if(numeros[3] % 2 == 0) cuentaPares++;
    if(numeros[4] % 2 == 0) cuentaPares++;
    if(numeros[5] % 2 == 0) cuentaPares++;

    System.out.println("La cantidad de elementos pares en el array es:" +cuentaPares);
scanner.close();
    }
}
