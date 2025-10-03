import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el dividendo: ");
        int num1 = scanner.nextInt();

        if (num1 == 0) {
            System.out.println("El numero no puede ser 0");
            
        }

        System.out.println("Introduce el divisor: ");
        int num2 = scanner.nextInt();
        
        int resto = num1 % num2;

        if (resto == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        scanner.close();
    }
}
