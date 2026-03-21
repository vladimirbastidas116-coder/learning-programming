// Clase principal (EjecutaVehiculo)
public class EjecutaVehiculo {

    public static void main(String[] args) {

        System.out.println("======== AUTOMOVIL ========");
        Automovil a1 = new Automovil();
        a1.setMarcaModelo("Toyota Corolla");
        a1.setPrecioDia(120000);
        a1.setNumLlantas(4);
        a1.setNumAsientos(5);
        a1.setNumPuertas(4);
        a1.mostrarDatos();
        a1.pruebaDelMotor();

        System.out.println("\n======== MOTOCICLETA ========");
        Motocicleta m1 = new Motocicleta();
        m1.setMarcaModelo("Yamaha FZ");
        m1.setPrecioDia(60000);
        m1.setNumLlantas(2);
        m1.setNumAsientos(2);
        m1.mostrarDatos();
        m1.pruebaDelMotor();

        System.out.println("\n======== AUTOBUS ========");
        Autobus b1 = new Autobus();
        b1.setMarcaModelo("Mercedes Benz");
        b1.setPrecioDia(300000);
        b1.setNumLlantas(6);
        b1.setNumAsientos(40);
        b1.setNumPuertas(2);
        b1.setNumVentilas(10);
        b1.mostrarDatos();
        b1.pruebaDelMotor();
    }
}

// =================== CLASE PADRE ===================
class Vehiculo {

    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo() {
    }

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca/Modelo: " + marcaModelo);
        System.out.println("Precio por día: " + precioDia);
        System.out.println("Número de llantas: " + numLlantas);
    }

    public void encenderMotor() {
        System.out.println("Motor encendido...");
    }

    public void apagarMotor() {
        System.out.println("Motor apagado...");
    }

    public void funciona() {
        System.out.println("El vehículo está funcionando correctamente.");
    }
}

// =================== AUTOMOVIL ===================
class Automovil extends Vehiculo {

    private int numAsientos;
    private int numPuertas;

    public Automovil() {}

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
    }

    public void pruebaDelMotor() {
        encenderMotor();
        funciona();
        apagarMotor();
    }
}

// =================== MOTOCICLETA ===================
class Motocicleta extends Vehiculo {

    private int numAsientos;

    public Motocicleta() {}

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Asientos: " + numAsientos);
    }

    public void pruebaDelMotor() {
        encenderMotor();
        funciona();
        apagarMotor();
    }
}

// =================== AUTOBUS ===================
class Autobus extends Vehiculo {

    private int numAsientos;
    private int numPuertas;
    private int numVentilas;

    public Autobus() {}

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumVentilas() {
        return numVentilas;
    }

    public void setNumVentilas(int numVentilas) {
        this.numVentilas = numVentilas;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
        System.out.println("Ventilas: " + numVentilas);
    }

    public void pruebaDelMotor() {
        encenderMotor();
        funciona();
        apagarMotor();
    }
}
