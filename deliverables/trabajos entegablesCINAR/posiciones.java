import java.util.Scanner;

public class posiciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int ancho = 8;
        int suma = 0;
        
        int[] vcNum = new int[ancho];
        
        for (int i = 0; i < ancho; i++ ){
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            vcNum[i] = teclado.nextInt();
        }

        for (int i = 0; i < ancho; i++){
            suma += vcNum[i];
        }

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio es: " + ((double)suma / ancho));

        teclado.close();
    }
}