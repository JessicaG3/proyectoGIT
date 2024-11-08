import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del alumno: ");
        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Calificación: Suspenso");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Calificación: Aprobado");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Calificación: Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Calificación: Sobresaliente");
        } else {
            System.out.println("Nota no válida.");
        }

        scanner.close();
    }
}
