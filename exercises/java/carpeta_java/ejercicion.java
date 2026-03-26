import java.util.Scanner;

public class ejercicion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int a, b ;

        
        System.out.println("digite el balor de a: ");
        a = leer.nextInt();
        System.out.println("digite el valor de b:");
        b = leer.nextInt();
        //suma = a + b;

        sumar(a , b);
        System.out.println("la suma de a + b es: " + sumaa(a, b));

        resta(a, b);
        System.out.println("la resta de a - b es: " + (restaaa(a, b)) );
        multiplicacion(a, b);

        System.out.println("la division de a / b es: " + dividir(a, b) );

    leer.close();

    }

    public static void sumar (int a, int b) {
        System.out.println("la suma de a + b es: " + (a + b));

    }
    public static int sumaa (int a, int b) {
        return a + b;

    }  

    public static void resta (int a, int b) {
        System.out.println("la resta de a - b es: " + (a - b) );
    }

    public static int restaaa (int a, int b) {
        return a - b;
    }

    public static void multiplicacion (int a, int b) {
        System.out.println("la multiplicacion de a * b es: " + (a * b) );
    }

    public static float dividir (float a, float b) {
        return a / b;
        

    }

}
