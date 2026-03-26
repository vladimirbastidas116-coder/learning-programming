public class estudiantes {
    public static void main(String[] args) {

        String estudiante = "";
        double mayorNota = 0;
        double promedio = 0;
        int contAprobados = 0;
        int contReprobados = 0;
        
        String[] vcEstudiantes = {"Juan", "Luis", "Felipe", "Hugo", "Cristina", "Ana", "Pedro"};
        String[] vcMaterias = {"Excel", "Word", "Java", "Html", "Mantenimiento", "Matemáticas", "Sociales"};
        double[] vcDefinitiva ={4.2, 3.1, 2, 4.5, 3, 2.8, 1};

        for(int i = 0; i < 7; i++){

            System.out.println("=== Estudiante " + (i + 1) + " ===");

            System.out.println("El estudiante " + vcEstudiantes[i] + " tiene una definitiva de " + vcDefinitiva[i] + " en la materia de " + vcMaterias[i]);

            promedio += vcDefinitiva[i];

            if (vcDefinitiva[i] > mayorNota){

                mayorNota = vcDefinitiva[i];
                estudiante = vcEstudiantes[i];
            }

            if (vcDefinitiva[i] < 3.0){
                System.out.println("El estudiante: " + vcEstudiantes[i] + " ha reprobado la materia de: " + vcMaterias[i]);
                contReprobados++;
            }else{
                System.out.println("El estudiante: " + vcEstudiantes[i] + " ha aprobado la materia de: " + vcMaterias[i]);
                contAprobados++;
            }
        }
        System.out.println("=== Estudiante con mayor nota ===");
        System.out.println("El estudiante: " + estudiante + " tiene una nota Myor de: " + mayorNota);

        System.out.println("=== Estadisticas ===");
        System.out.println("El promedio de las notas es: " + promedio / 7);
        System.out.println("El numero de estudiantes aprobados es: " + contAprobados);
        System.out.println("El numero de estudiantes reprobados es: " + contReprobados);
    }
}
