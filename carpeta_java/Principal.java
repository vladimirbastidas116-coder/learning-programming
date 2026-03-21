import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Perro p1 = new Perro("Manchas", 9, "Pastor Aleman");
        Animal g1 = new Gato("Micifu", 9, "Negro");

        p1.mostrar();
        System.out.println(p1.sonido());
        p1.entrenamiento();
        p1.vacunas();

        System.out.println("===========================================");

        g1.mostrar();
        g1.entrenamiento();
        g1.vacunas();
        System.out.println(g1.sonido());

        System.out.println("===========================================");

        Animal v1 = new Vaca("Lola", 5, 350.5);
        v1.mostrar();
        System.out.println(v1.sonido());
        v1.entrenamiento();
        v1.vacunas();
    }
}

interface Ianimal {
    void entrenamiento();
    void vacunas();
}

abstract class Animal implements Ianimal {

    protected String nombre;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }

    public abstract String sonido();
}

class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Raza: " + raza);
    }

    @Override
    public String sonido() {
        return "Soy perro y ladro";
    }

    @Override
    public void vacunas() {
        System.out.println("Perro vacunado");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Perro entrenado");
    }
}

class Gato extends Animal {

    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Color: " + color);
    }

    @Override
    public String sonido() {
        return "Soy gato y maullo";
    }

    @Override
    public void entrenamiento() {
        System.out.println("Gato entrenado");
    }

    @Override
    public void vacunas() {
        System.out.println("Gato vacunado");
    }
}

class Vaca extends Animal {

    private double peso;

    public Vaca(String nombre, int edad, double peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Peso: " + peso + " kg");
    }

    @Override
    public String sonido() {
        return "Soy vaca y mujo";
    }

    @Override
    public void entrenamiento() {
        System.out.println("Vaca entrenada");
    }

    @Override
    public void vacunas() {
        System.out.println("Vaca vacunada");
    }
}