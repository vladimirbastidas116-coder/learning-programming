import java.util.Scanner;

public class vehiculos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double totalRecaudo = 0;
        double mayorTiempo = 0;
        String placaMayor = "";
        double pago = 0;

        System.out.println("ingresa cuantos vehiculos vas aingresar: ");
        int numVehiculos = teclado.nextInt();

        String[] vcPlaca = new String[numVehiculos];
        double[] vcTipo = new double[numVehiculos];
        double[] vcHoras = new double[numVehiculos];
        int[] vcColor = new int[numVehiculos];
        String[] Color = new String[numVehiculos];
        
        for (int i = 0; i < numVehiculos; i++){

            System.out.println("=== VEHICULO " + (i + 1) + " === \n ");
            System.out.println("ingresa la placa del vehiculo " + (i + 1) + ": ");
            vcPlaca[i] = teclado.next();
            System.out.println("ingresa el tipo de vehiculo " + (i + 1) + ": ");
            while (vcTipo[i] < 1 || vcTipo[i] > 3){
                System.out.println("1. Pequeño, 2. Mediano, 3. Grande");
                teclado.nextLine();
                vcTipo[i] = teclado.nextInt();
                if (vcTipo[i] == 1 || vcTipo[i] == 2 || vcTipo[i] == 3){
                    break;
                }
                System.out.println("======= el tipo de vehiculo debe ser 1, 2 o 3 intenta de nuevo ======");

            }

            while (vcHoras[i] <= 0){
                System.out.println("ingresa las horas de estacionamiento del vaiculo " + (i + 1) + ": ");
                vcHoras[i] = teclado.nextDouble();
                if (vcHoras[i] > 0){
                    break;
                }else{
                    System.out.println("======= las horas de estacionamiento deben ser mayor a 0 intenta de nuevo ======");
                }
                
            }

            while (vcColor[i] < 1 || vcColor[i] > 4){
                System.out.println("ingresa el color del vehiculo " + (i + 1) + ": ");
                System.out.println("1. Blanco, \n2. Azul, \n3. Rojo, \n4. Otro");
                teclado.nextLine();
                vcColor[i] = teclado.nextInt();
                if (vcColor[i] == 1) {
                    Color[i] = "Blanco";

                }else if(vcColor[i] == 2){
                    Color[i] = "Azul";
                }else if(vcColor[i] == 3){
                    Color[i] = "Rojo";
                }else if (vcColor[i] == 4){
                    teclado.nextLine();
                    System.out.println("ingresa el color del vehiculo " + (i + 1) + ": ");
                    Color[i] = teclado.nextLine();
                }else
                System.out.println("======= el color del vehiculo debe ser 1, 2 o 3 intenta de nuevo ======");
            }
        }

        for (int i = 0; i < numVehiculos; i++){

            if (vcTipo[i] == 1){

                pago = 3000;
                if (vcHoras[i] > 1){
                    pago += (vcHoras[i] - 1)* 300;
                }
            } else if (vcTipo[i] == 2){
                pago = 5000;
                if (vcHoras[i] > 1){
                    pago += (vcHoras[i] - 1) * 500;
                } 

            } else if (vcTipo[i] == 3){

                pago = 7000;
                if (vcHoras[i] > 1){
                    pago += (vcHoras[i] - 1) * 700;
                }

            if (vcHoras[i] > mayorTiempo){

                mayorTiempo = vcHoras[i];
                placaMayor = vcPlaca[i];

                }

            }
            System.out.println("=== Pago del vehiculo " + (i + 1) + " ===");
            System.out.println("Placa: " + vcPlaca[i]);

            System.out.println("Tipo: " + vcTipo[i]);
            System.out.println("Horas: " + vcHoras[i]);
            System.out.println("Color (" + vcColor[i] + "): " + Color[i]);
            System.out.println("El pago del vehiculo " + (i + 1) + " es: $" + pago);
            totalRecaudo += pago;
        }

        double promedio = totalRecaudo / numVehiculos;

        System.out.println("=== Informacion de los vehiculos ===");
        System.out.println("Total recaudado de los vehiculos: " + totalRecaudo);
        System.out.println("Promedio de recaudo por vehiculo: " + promedio);
        System.out.println("=== Informacion del vehiculo con mayor tiempo ===");
        System.out.println("Placa: " + placaMayor);
        System.out.println("Tiempo estacionado: " + mayorTiempo + " horas");

        System.out.println("");
        System.out.println("===Lista de ingresos===");
        System.out.println("Placa | Tipo | Horas | Color | Pago");
        for (int i = 0; i < numVehiculos; i++){

            System.out.println(vcPlaca[i] + " | " + vcTipo[i] + " | " + vcHoras[i] + " | " + Color[i] + " | $" + pago);
        }

        
        
        System.out.println("Gracias por utilizar el servicio de estacionamiento");
        teclado.close();
    }
}
