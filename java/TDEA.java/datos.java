import java.util.ArrayList;
import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // creacion de la tienda
        Tienda tienda = new Tienda("Tienda el TDEA");

        // creacion de producto fisico 
        System.out.println("Ingrese la ID del producto fisico: ");
        String idFicico = teclado.nextLine();
        
        System.out.println("Ingrese el nombre del producto fisico: ");
        String nombreFisico = teclado.nextLine();

        System.out.println("Ingrese el precio del producto fisico: ");
        double precioFisico = teclado.nextDouble();
        teclado.nextLine();

        Producto p1 = new ProductoFisico(idFicico, nombreFisico, precioFisico);
        tienda.agregarProducto(p1);

        // creacion de producto digital
        System.out.println("Ingrese la ID del producto digital: ");
        String idDigital = teclado.nextLine();
        
        System.out.println("Ingrese el nombre del producto digital: ");
        String nombreDigital = teclado.nextLine();

        System.out.println("Ingrese el precio del producto digital: ");
        double precioDigital = teclado.nextDouble();
        teclado.nextLine();

        Producto p2 = new ProductoDigital(idDigital, nombreDigital, precioDigital);
        tienda.agregarProducto(p2);

        // crear cliente 
        System.out.println("Ingrese el ID del cliente: ");
        String idCliente = teclado.nextLine();
        
        System.out.println("Ingrese la direccion del cliente: ");
        String direccion = teclado.nextLine();

        Cliente cliente = new Cliente(idCliente, direccion);
        tienda.agregarCliente(cliente);

        // crear la orden (AHORA CON ASOCIACION)
        System.out.println("Ingrese la fecha de la orden: ");
        String fecha = teclado.nextLine();

        Orden orden =  new Orden(fecha, cliente);

        // cantidad de productos
        System.out.println("Ingrese la cantidad de productos fisicos: ");
        int cantiFisico = teclado.nextInt();

        System.out.println("Ingrese la cantidad de productos digitales: ");
        int cantiDigital = teclado.nextInt();

        DetalleOrden detalleFisico = new DetalleOrden(p1, cantiFisico);
        DetalleOrden detalleDigital = new DetalleOrden(p2, cantiDigital);
        
        orden.agregarDetalle(detalleFisico);
        orden.agregarDetalle(detalleDigital);

        orden.calcularTotal();

        // ================= FACTURA =================
        System.out.println("\n================= FACTURA =================");
        System.out.println("Tienda: Tienda el TDEA");
        System.out.println("Fecha: " + fecha);
        System.out.println("-------------------------------------------");

        System.out.println("Cliente ID: " + cliente.getIdCliente());
        System.out.println("Direccion: " + cliente.getDireccion());
        System.out.println("-------------------------------------------");

        System.out.println(">>> PRODUCTO FISICO <<<");
        p1.mostrarInformacion();
        System.out.println("Cantidad: " + cantiFisico);
        System.out.println("Impuesto: $" + ((Vendible)p1).calcularImpuesto());
        System.out.println("Subtotal: $" + detalleFisico.calcularSubtotal());
        System.out.println("-------------------------------------------");

        System.out.println(">>> PRODUCTO DIGITAL <<<");
        p2.mostrarInformacion();
        System.out.println("Cantidad: " + cantiDigital);
        System.out.println("Impuesto: $" + ((Vendible)p2).calcularImpuesto());
        System.out.println("Subtotal: $" + detalleDigital.calcularSubtotal());
        System.out.println("-------------------------------------------");

        System.out.println("TOTAL A PAGAR: $" + orden.getTotal());
        System.out.println("===========================================\n");

        ServicioPago servicioPago = new ServicioPago();
        servicioPago.procesarPago(orden);

        teclado.close();
    }
}

abstract class Producto {
    private String id;
    private String nombre;
    private double precio; 

    public Producto() {}

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }


    public void setId(String id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }

    public abstract double calcularDescuento();

    public abstract void mostrarInformacion();
}

interface Vendible {
    void vender();
    double calcularImpuesto();
}

class ProductoFisico extends Producto implements Vendible {

    public ProductoFisico() {
        super();
    }

    public ProductoFisico(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    public double calcularDescuento() {
        return getPrecio() * 0.15;
    }

    public void vender(){
        System.out.println("El producto fisico " + getNombre() + " fue vendido.");
    }

    public double calcularImpuesto() {
        return getPrecio() * 0.19;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
    }
}

class ProductoDigital extends Producto implements Vendible {

    public ProductoDigital() {
        super();
    }

    public ProductoDigital(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    public double calcularDescuento() {
        return getPrecio() * 0.05;
    }

    public void vender(){
        System.out.println("El producto digital " + getNombre() + " fue vendido.");
    }

    public double calcularImpuesto() {
        return getPrecio() * 0.10;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
    }
}

class Cliente {
    private String idCliente;
    private String direccion; 

    public Cliente() {}

    public Cliente(String idCliente, String direccion) {
        this.idCliente = idCliente;
        this.direccion = direccion;
    }

    public String getIdCliente() { return idCliente; }
    public String getDireccion() { return direccion; }
}

class DetalleOrden{
    private Producto producto;
    private int cantidad;

    public DetalleOrden(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}

class Orden {
    private String fecha;
    private double total;
    private Cliente cliente; // ASOCIACION
    private ArrayList<DetalleOrden> detalles;

    public Orden(String fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = new ArrayList<DetalleOrden>();
    }

    public Orden(String fecha) { 
        this.fecha = fecha;
        this.detalles = new ArrayList<DetalleOrden>();
    }

    public void agregarDetalle(DetalleOrden detalle) {
        detalles.add(detalle);
    }

    public void calcularTotal() {
        total = 0;
        for (DetalleOrden detalle : detalles) {
            total += detalle.calcularSubtotal();
        }
    }

    public double getTotal() { return total; }
    public Cliente getCliente() { return cliente; }
}

class Tienda {
    private String nombre;
    private ArrayList<Producto> producto;
    private ArrayList<Cliente> clientes;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.producto = new ArrayList<Producto>();
        this.clientes = new ArrayList<Cliente>();
    }

    public void agregarProducto(Producto producto) {
        this.producto.add(producto);
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}

class ServicioPago {
    public void procesarPago(Orden orden) {
        System.out.println("Pago procesado por: $" + orden.getTotal());
    }
}