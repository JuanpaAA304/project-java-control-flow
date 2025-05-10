import java.util.Scanner;

public class FizzBuzzBoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los límites del rango
        System.out.print("Ingresa el número inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final: ");
        int fin = scanner.nextInt();

        // Validación básica del rango
        if (inicio > fin) {
            System.out.println("El número inicial debe ser menor o igual al número final.");
            return;
        }

        // Recorrer el rango
        for (int i = inicio; i <= fin; i++) {
            String output = "";

            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            if (i % 7 == 0) output += "Boom";

            // Si no es múltiplo de ninguno, imprimir el número
            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }

        scanner.close();
    }
}
