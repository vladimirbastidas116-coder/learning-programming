import java.util.Scanner;
// lleer un numero y calcular la suma desde el uno asta el numnero leido 
public class whileee {
    public static void main(String[] args) {
        int num = 0;
        int cont = 0;
        int suma = 0;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = numero.nextInt();

        while (cont < num ) {
            cont++;
            System.out.println("El numero es: " + cont);
            suma += cont;
        }
        System.out.println("La suma es: " + suma );
        numero.close();    
    }
}
