import java.util.Scanner;

public class empresacl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String repetir = "s";
        int edad = 0;
        int exp = 0;
        String curso = "s";
        int cont = 0;

        System.out.println("Convocatoria de trabajo empresa (Nintendo)");
        
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        
        while (repetir.toLowerCase().startsWith("s")) {
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            if (edad >= 18) {
                repetir = "n";
                cont += 1;
            } else {
                System.out.println("Lo sentimos pero la edad ingresada no cumple el requisito");
                System.out.println("_--¿Deseas volver a ingresar tu edad? si(s) no(n)--_");
                repetir = teclado.nextLine();
            }
        }

        repetir = "s";

        while (repetir.toLowerCase().startsWith("s")) {
            System.out.println("Ingrese su experiencia laboral: ");
            exp = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            if (exp > 2) {
                cont += 1;
                repetir = "n";
            } else {
                System.out.println("Lo sentimos pero la experiencia laboral no cumple el requisito");
                System.out.println("_--¿Deseas volver a ingresar tu experiencia laboral? si(s) no(n)--_");
                repetir = teclado.nextLine();
            }
        }

        repetir = "s";

        System.out.println("Ingrese su estado civil: ");
        System.out.println("soltero/a, casado/a, viudo/a, divorciado/a, separado/a");
        String civil = teclado.nextLine();
        cont += 1;

        repetir = "s";

        while (repetir.toLowerCase().startsWith("s")) {
            System.out.println("¿Ha cursado algún tipo de programa de sistemas? Si(s) No(n): ");
            curso = teclado.nextLine();

            if (curso.toLowerCase().startsWith("s")) {
                repetir = "n";
                cont += 1;
            } else {
                System.out.println("Lo sentimos pero necesita haber estudiado sistemas");
                System.out.println("_--¿Deseas volver a ingresar este dato? si(s) no(n)--_");
                repetir = teclado.nextLine();
            }
        }

        System.out.println("Ingrese su genero: ");
        System.out.println("Masculino(m) Femenino(f)");
        String genero = teclado.nextLine();
        cont += 1;

        System.out.println("__----datos ingresados-----___");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su experiencia laboral es de: " + exp + " años");
        System.out.println("Estado civil: " + civil);
        System.out.println("Programa cursado: " + curso);
        System.out.println("Genero: " + genero);

        if (cont == 5) {
            System.out.println("=== Felicidades tienes todos los requisitos para aplicar ===");
        } else {
            System.out.println("=== Lo sentimos no cumples con algunos requisitos ===");
        }

        teclado.close();
    }
}
