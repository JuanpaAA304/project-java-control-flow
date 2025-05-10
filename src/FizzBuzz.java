public class FizzBuzz {
    public static void main(String[] args) {
        // Recorremos los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificamos si el número es múltiplo de 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Verificamos si es múltiplo solo de 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Verificamos si es múltiplo solo de 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Si no cumple ninguna condición, imprimimos el número
            else {
                System.out.println(i);
            }
        }
    }
}

