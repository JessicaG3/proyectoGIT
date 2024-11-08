import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Elige una operación:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.print("Introduce el número de la operación: ");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
