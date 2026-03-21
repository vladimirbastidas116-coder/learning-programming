import java.util.Scanner;

public class productos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double totalDescuento = 0;
        double sumaDePago = 0;
        String bucle = "S";
        String nombreProducto = "";
        int cantidad = 0;
        int Masvendido = 0;
        double descueto = 0;

        double totalFinal = 0;
        double totalImpuesto = 0;
        double totalConDescuento = 0;

        while (bucle.toUpperCase().startsWith("S")) {
            System.out.println("Ingresa nombre del producto: ");
            String producto = teclado.nextLine();

            System.out.println("Ingresa precio del producto: ");
            double precio = teclado.nextDouble();
            teclado.nextLine();

            System.out.println("Ingresa cantidad de productos: ");
            cantidad = teclado.nextInt();

            double pagoNormal = precio * cantidad;

            sumaDePago += pagoNormal;

            if (cantidad > Masvendido) {
                Masvendido = cantidad;
                nombreProducto = producto;
            }

            System.out.println("===================|VALOR DE PRODUCTO|=======================");
            System.out.println("valor por unidad de " + producto + " es: " + precio);
            System.out.println("Valor total de " + producto + " es: " + pagoNormal);

            if (sumaDePago > 100000) {
                System.out.println("Su compra es superior a 100.000 su descuento es de 5%");
                totalDescuento = (pagoNormal - (pagoNormal * 0.05));
                descueto += totalDescuento;
            } else {
                System.out.println("Su compra no supera los 100.000 su descuento es de 3%");
                totalDescuento = (pagoNormal - (pagoNormal * 0.03));
                descueto += totalDescuento;
            }

            System.out.println("======================|DESCUENTO|======================");
            System.out.println("El valor del pago con descuento es: " + totalDescuento);
            System.out.println("==========================================");

            double impuesto = totalDescuento * 0.19;
            double totalAPagar = totalDescuento + impuesto;

            System.out.println("El total a pagar con impuesto es de: " + totalAPagar);

            totalConDescuento += totalDescuento;
            totalImpuesto += impuesto;
            totalFinal += totalAPagar;

            System.out.println("");
            teclado.nextLine();
            System.out.println("¿Desea agregar otro producto? S/N");
            bucle = teclado.nextLine();
        }

        System.out.println("=====================|PRODUCTO MAS VENDIDO|=======================");
        System.out.println("Nombre de producto mas vendido es: " + nombreProducto);
        System.out.println("Cantidad del producto mas vendido es: " + Masvendido);

        System.out.println("====================|RESUMEN DE COMPRA|====================");
        System.out.println("Total sin descuento: " + sumaDePago);
        System.out.println("Total con descuento: " + totalConDescuento);
        System.out.println("Total de impuestos: " + totalImpuesto);
        System.out.println("Total a pagar: " + totalFinal);

        System.out.println("==================|PAGO EN EFECTIVO|==========================");
        System.out.println("Ingrese el pago en efectivo: ");
        double pagoEfectivo = teclado.nextDouble();

        if (pagoEfectivo < totalFinal)
            System.out.println("El pago es insuficiente");
        else
            System.out.println("El cambio es de: " + (pagoEfectivo - totalFinal));

        teclado.close();
    }
}