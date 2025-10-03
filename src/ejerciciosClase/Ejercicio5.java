import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Declaración de las dos variables principales
        System.out.println("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Variables auxiliares para cada operación
        double auxSuma = num1 + num2;
        double auxResta = num1 - num2;
        double auxMultiplicacion = num1 * num2;
        double auxDivision = num1 / num2;
        
        // Mostrar resultados
        System.out.println("La suma es: " + auxSuma);
        System.out.println("La resta es: " + auxResta);
        System.out.println("La multiplicación es: " + auxMultiplicacion);
        System.out.println("La división es: " + auxDivision);
        
        scanner.close();
    }
}        
    
