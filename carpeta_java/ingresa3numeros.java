//importar la clase scanner 
import java.util.Scanner;

public class ingresa3numeros {
    public static void main(String[] args) {
        // definicion de el metodo scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese de numeros ysacar promedio");

        // declaracion de variables y guardado de datos
        //objeto te clado se guarda como variable numerica en num1, num2, num3
        System.out.println("Ingrese el primer numero: ");
        float num1 = teclado.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        float num2 = teclado.nextFloat();
        System.out.println("Ingrese el tercer numero: ");
        float num3 = teclado.nextFloat();

        // calcular promedio
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio es: " + promedio);

        teclado.close();

    }
}
