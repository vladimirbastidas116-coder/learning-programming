import java.util.Scanner;

public class notaEstudiante3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("lanota subida solo puede ser comprendida ente 1 y 5");
        System.out.println("ingrese la materia a evaliuar: ");
        String materia = teclado.nextLine();
        
        
        //crea un objeto Scanner para leer la entrada del usuario
        //ingresa el nombre del estudiante 
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();

        //ingresa las notas del estudiante
        System.out.println("Ingrese la nota del primera nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Ingrese la nota del segunda nota: ");
        float nota2 = teclado.nextFloat();

        if ( nota1 > 5.0f || nota2 > 5.0f ) {
            System.out.println("Error: alguna de las notas no esta entre 1 y 5.");
        } else {
            //calcular el promedio de las notas
            float promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio de las notas de  "+ nombre + " es: " + promedio);
            if (promedio >= 3.0f) {
                System.out.println("EL estudiante tien un nota final de: " + promedio);
                System.out.println("_---------felicidades aprobaste la materia de " + materia + "-------__");
            } else if (promedio > 4.7f){
                System.out.println ("el estudiante tiene un anota final de: " + promedio);
                System.out.println("Por su buen desempeño su nota final es: 5");
                System.out.println ("_---------felicidades aprobaste la materia de " + materia + "-------__");
            }else if (promedio == 4.0f){
                System.out.println ("el estudiante tiene un anota final de: " + promedio);
                System.out.println("Por su desempeño su nota final es: 4.5");
                System.out.println ("_---------felicidades aprobaste la materia de " + materia + "-------__");
            }
            else {
                System.out.println("EL estudiante tien un nota final de: " + promedio);
                System.out.println("_---------lo siento reprobaste la materia de " + materia + "-------__");
            }        
        }

        teclado.close();


    }
}
