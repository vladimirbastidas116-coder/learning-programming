// Clase principal donde se ejecuta el programa
public class Main {
    public static void main(String[] args) {

        // Crear el objeto
        Persona p1 = new Persona();

        p1.setNombre("Dario");
        p1.setEdad(50);
        p1.setCedula("1234567890");

        System.out.println("Nombre: " + p1.getNombre());
        p1.mostrar();
        System.out.println("---______________________________________________----\n ");
        Conductor l1 = new Conductor();
        l1.setNombre("Maria");
        l1.setEdad(30);
        l1.setLicencia("ABC123");
        l1.mostrar();
        System.out.println("---______________________________________________----\n ");
        Estudiante e1 = new Estudiante();
        e1.setNombre("Juan");
        e1.setEdad(20);
        e1.setCedula("0987654321");
        e1.setCarrera("Ingeniería en Sofware");
        e1.mostrar();
    }
}

// Clase Persona
class Persona {

    private String nombre;
    private int edad;
    private String cedula;

    // Constructor vacío
    public Persona() {
    }

    // Constructor correcto (solo 3 parámetros)
    public Persona(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad <= 60)
            this.edad = edad;
        else
            System.out.println("Edad no válida");
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre +
                            " Edad: " + edad +
                            "\n Cedula: " + cedula);
    }
}

class Conductor extends Persona {

    private String licencia;

    public Conductor() {}

    public Conductor(String licencia) {
        this.licencia = licencia;
    }

    public Conductor(String nombre, int edad, String cedula, String licencia) {
        super(nombre, edad, cedula); // corregido
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Licencia: " + licencia);
    }
}   // ← cierre correcto de Conductor

class Estudiante extends Persona {

    private String carrera;

    public Estudiante() {}

    public Estudiante(String carrera){
        this.carrera = carrera;
    }

    public Estudiante(String nombre, int edad, String cedula, String carrera) {
        super(nombre, edad, cedula); // corregido
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Carrera: " + carrera);
    }
}
