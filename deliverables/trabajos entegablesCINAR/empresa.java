import java.util.Scanner;

public class empresa {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int ancho = 9;
        int contFue = 0;
        int contRang = 0;
        double nominTotal = 0;
        
        String[] vcEmpleados = new String[ancho];
        double[] vcSueldos = new double[ancho];
        double[] vcRetencion = new double[ancho];  
        double[] vcIncentivo = new double[ancho];
        double[] vcTotal = new double[ancho];
        

        for(int i = 0; i < ancho; i++){
            System.out.println("===Empleado " + (i + 1) + " ===");
            System.out.println("ingresa el nombre del empleado " + (i + 1) + ": ");
            vcEmpleados[i] = teclado.nextLine();
            
            System.out.println("ingresa el sueldo del empleado " + (i + 1) + ": ");
            vcSueldos[i] = teclado.nextDouble();
            
            
            System.out.println("Ingrese la retencion de sueldo del empleado " + (i + 1) + ": ");
            vcRetencion[i] = teclado.nextDouble();
            
            System.out.println("Ingrese el incentivo del empleado " + (i + 1) + ": ");
            vcIncentivo[i] = teclado.nextDouble();
            teclado.nextLine();
        }

        for(int i = 0; i < ancho; i++){
            vcTotal[i] = vcSueldos[i] - vcRetencion[i] + vcIncentivo[i];
            
            if (vcTotal[i] > 700000 && vcTotal[i] < 2000000){
                System.out.println("=============================================");
                System.out.println("El empleado se encuentra en el rango de 700000 a 2000000, con un sueldo total de: " + vcTotal[i]);
                contRang++;
            }else{
                System.out.println("=============================================");
                System.out.println("El empleado no se encuentra en el rango de 700000 a 2000000, con un sueldo total de: " + vcTotal[i]);
                contFue++;
            }
            nominTotal += vcTotal[i];

            System.out.println("=== EMPLEADO " + (i + 1) + " ===");
            System.out.println("El empleado " + vcEmpleados[i] + " tiene un sueldo total de: " + vcTotal[i]);

        }

        System.out.println("=============================================");
        System.out.println("El total de empleados que se encuentran en el rango de 700000 a 2000000 es de: " + contRang);
        System.out.println("El total de empleados que no se encuentran en el rango: " + contFue);
        System.out.println("El total de empleados es de: " + ancho);
        System.out.println("El total de sueldos es de: " + nominTotal);

    teclado.close();
    }
}
