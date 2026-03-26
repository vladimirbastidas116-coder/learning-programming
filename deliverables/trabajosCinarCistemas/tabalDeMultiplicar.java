import java.util.Scanner;

public class tabalDeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Tabla de multiplicar ===");
        System.out.println("ingres la tabla en la que quieres comenzar;");
        int inicio = teclado.nextInt();
        System.out.println("ingres la tabla en la que quieres terminar;");
        int fin = teclado.nextInt();

        if (inicio <= 0 || fin <= 0 || inicio > fin) {
            System.out.println("Error: los valores ingresados no son válidos.");
        } else {
            if (inicio < fin){

                for (int i = inicio; i <= fin; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j));
                    }
                }
            } else{
                System.out.println("Error: el valor final debe ser mayor al valor inicial.");

            }

        }
    teclado.close();
    }
}
