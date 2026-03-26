import java.util.Scanner;

public class estudianteNotas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la primera nota: ");
        float nota1 = leer.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        float nota2 = leer.nextFloat();

        if (nota1 > 5.0f || nota2 <0.0f || nota2 > 5.0f || nota1 < 0.0f){
            System.out.println("Error: alguna de las notas no esta entre 1 y 5.");
        }else{
            System.out.println("ingresa el porcentaje de la nota 1: ");
            float por1 = leer.nextFloat();
            System.out.println("porcentaje de la nota 1");
            System.out.println(por1 + " %");
            float porcentaje1 = por1 / 100;
            System.out.println("porcentaje de la nota 2");
            float por2 = 100 - por1;
            System.out.println(por2 + " %");
            float porcentaje2 = por2 / 100;
            float promedio = (nota1 * porcentaje1) + (nota2 * porcentaje2);
            if (promedio >= 2.6f && promedio <= 2.9f ){
                System.out.println("EL estudiante " + nombre + " tien un nota final de: " + promedio);
                System.out.println("su nota esta avil para suvir su nota a 3.0");
                System.out.println("_---------felicidades aprobaste la materia-------__");
            }else if (promedio >= 3.2f && promedio <= 3.9f ){
                System.out.println("EL estudiante " + nombre + " tien un nota final de: " + promedio);
                System.out.println("su nota queda en: " + (promedio + 0.3f));
                System.out.println("_---------felicidades aprobaste la materia-------__");
            }else if (promedio >= 4.6f && promedio <= 4.9f ){ 
                System.out.println("EL estudiante " + nombre + " tien un nota final de: " + promedio);
                System.out.println("por su buen conportamiento y desempeño su nota final es: 5.0");
                System.out.println("_---------felicidades aprobaste la materia-------__");
            }else if (promedio > 4.6f){
                System.out.println("EL estudiante " + nombre + " tien un nota final de: " + promedio);
                System.out.println("por su gran desenpeño su nota final es: 5.0");
                System.out.println("_---------felicidades aprobaste la materia exelente desempeño-------__");
            }else {
                System.out.println("EL estudiante " + nombre + " tien un nota final de: " + promedio);
                System.out.println("la nota del estudiante esta pordebajo de 2.6");
                System.out.println("_---------As perdiodp la materia-------__");
            }
        }
    leer.close();
    }
}
