import java.util.Scanner;

public class ingrVactores {
    public static void main(String[] args) {
        int ancho = 3;
        Scanner teclado = new Scanner(System.in);
        String[] vcNombres = new String[ancho];
        double[] vcIngresoso = new double[ancho];
        double totalDeIngresos = 0;


        for (int i = 0; i < ancho; i++){
            System.out.println("ingrese el nombre ");
            vcNombres[i] = teclado.nextLine();

            System.out.println("ingrese el ingreso ");
            vcIngresoso[i] = teclado.nextDouble();
        }   
        System.out.println("NOMBRE      INGRESO");
        for (int i = 0; i < ancho; i++){
            System.out.println(vcNombres[i] + " " + vcIngresoso[i]);
            totalDeIngresos += vcIngresoso[i];
        }
        System.out.println("El total de ingresos es: " + totalDeIngresos);
        teclado.close();
    }
}
