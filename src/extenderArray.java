import java.util.Scanner;


public class extenderArray {
    public static void main(String[] args) {
        Scanner extender = new Scanner(System.in);

        int[] numeroOriginal = {1, 2, 3};

        int[] numeroExtendido = new int[5];
        numeroExtendido[0] = numeroOriginal[0];
        numeroExtendido[1] = numeroOriginal[1];
        numeroExtendido[2] = numeroOriginal[2];

        System.out.println("Ingresa el cuarto numero: ");
        if (extender.hasNextInt()) {
            numeroExtendido[3] = extender.nextInt();
        } else {
            System.out.println("Entrada no valida, ingrese un numero entero.");
            extender.next();
            System.out.println("Ingrese el cuarto numero: ");
            numeroExtendido[3] = extender.nextInt();
        }

        System.out.println("Ingresa el quinto numero: ");
        if (extender.hasNextInt()) {
            numeroExtendido[4] = extender.nextInt();
        } else {
            System.out.println("Entrada no valida, ingrese un numero entero.");
            extender.next();
            System.out.println("Ingrese el quinto numero: ");
            numeroExtendido[4] = extender.nextInt();
        }
        System.out.println("El contenido del nuevo array es: ");
        System.out.println(numeroExtendido[0]);
        System.out.println(numeroExtendido[1]);
        System.out.println(numeroExtendido[2]);
        System.out.println(numeroExtendido[3]);
        System.out.println(numeroExtendido[4]);

        extender.close();
    }
}
