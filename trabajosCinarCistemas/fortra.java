import java.util.Scanner;

public class fortra {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numCont = 5;
        int numMayor = 0;
        
        System.out.println("encontremos el numero mayor");

        for (int i = 0; i < numCont; i++){


            System.out.println("ingresa un numero: ");
            int num = teclado.nextInt();
            System.out.println("numero = " + num);

            if (num > numMayor){

                numMayor = num;

            }
        }


        System.out.println("=== el numero mayor es: " + numMayor + " ===");
        teclado.close();
    }

}
