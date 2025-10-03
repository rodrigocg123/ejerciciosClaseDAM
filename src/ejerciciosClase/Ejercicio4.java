public class Ejercicio4 {
    public static void main(String[] args) {
        int A = 2, B = 4, C = 5, D = 6;
        System.out.println("Al principio el valor de A es: " + A + "\n" + " el valor original de B es: " + B + "\n"
                + " el valor original de C es: " + C + "\n" + " el valor original de D es: " + D + "\n");
        int tempB = B;
        int tempC = C;
        int tempA = A;

        D = tempB; 
        B = tempC; 
        C = tempA; 
        A = D;

        System.out.println("El valor nuevo de B es: " + B);
        System.out.println("El valor nuevo de C es: " + C);
        System.out.println("El valor nuevo de A es: " + A);
        System.out.println("El valor nuevo de D es: " + D);
    }
}
