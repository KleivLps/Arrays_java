import java.util.Scanner;



public class buscarArray {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.println("Ingrese el primer numero: ");
        if (array.hasNextInt()) {
            numeros[0] = array.nextInt();
        } else {
            System.out.println("Entrada no valida. Por favor, ingrese un numero entero. ");
            array.next();
            System.out.println("Ingrese el primer numero: ");
            numeros[0] = array.nextInt();
        }

        System.out.println("Ingrese el segundo numero: ");
        if (array.hasNextInt()) {
            numeros[1] = array.nextInt();
        } else {
            System.out.println("Entrada no valida. Por favor, ingrese un numero entero. ");
            array.next();
            System.out.println("Ingrese el segundo numero: ");
            numeros[1] = array.nextInt();
        }

        System.out.println("Ingrese el tercer numero: ");
        if (array.hasNextInt()) {
            numeros[2] = array.nextInt();
        } else {
            System.out.println("Entrada no valida. Por favorm ingrese un numero entero. ");
            array.next();
            System.out.println("Ingrese el tercer numero: ");
            numeros[2] = array.nextInt();
        }

        System.out.println("Ingrese el numero a buscar: ");
        int numeroABuscar = array.nextInt();

        if (numeroABuscar == numeros[0] || numeroABuscar == numeros[1] || numeroABuscar == numeros[2]) {
            System.out.println("El numero " +numeroABuscar+ " esta presente en el array. ");
        } else {
            System.out.println("El numero " +numeroABuscar+ " no esta presente en el array. ");
        }

        array.close();
    }


}
