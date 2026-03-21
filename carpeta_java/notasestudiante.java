import java.util.Scanner;

public class notasestudiante {
    public static void main(String[] args) {
        System.out.println("lqnota subida solo puede ser comprendida ente 1 y 5");
        
        
        //crea un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        //ingresa el nombre del estudiante 
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();

        //ingresa las notas del estudiante
        System.out.println("Ingrese la nota del primera nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Ingrese la nota del segunda nota: ");
        float nota2 = teclado.nextFloat();

        if (nota1 <= 0.0f || nota1 >= 6.0f || nota2 <= 0.0f || nota2 >= 6.0f) {
            System.out.println("Error: alguna de las notas no esta entre 1 y 5.");
        } else {
            //calcular el promedio de las notas
            float promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio de las notas de  "+ nombre + " es: " + promedio);
        }
        teclado.close();

    }
}
