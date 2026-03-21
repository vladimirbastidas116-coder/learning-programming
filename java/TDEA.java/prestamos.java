public class prestamos {
    public static void main(String[] args) {

        Material libro1 = new Libro("123", "El senor de los anillos", "JRR Tolkien", 50000, 400);
        Material cd1 = new CD("456", "The Beatles", "The Beatles", 10000, "Rock", "Si");

        libro1.calcularPrestamo();
        System.out.println("============================================");
        cd1.calcularPrestamo();

    }
}

abstract class Material {

    private String codigo;
    private String titulo;
    private String autor;
    private double alquiler;

    public Material(String codigo, String titulo, String autor, double alquiler) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.alquiler = alquiler;
    }

    abstract public double calcularInteres();
    abstract public void calcularPrestamo();

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getAlquiler() {
        return alquiler;
    }

    public void mostrar() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo + " Autor: " + autor);
        System.out.println("Alquiler base: $" + alquiler);
    }
}

class Libro extends Material {

    private int numPaginas;

    public Libro(String codigo, String titulo, String autor, double alquiler, int numPaginas) {
        super(codigo, titulo, autor, alquiler);
        this.numPaginas = numPaginas;
    }

    @Override
    public double calcularInteres() {
        if (numPaginas > 100) {
            return getAlquiler() * 0.80; 
        }
        return getAlquiler();
    }

    @Override
    public void calcularPrestamo() {
        System.out.println("Prestamo calculado para libro.");
        mostrar();  
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Numero de paginas: " + numPaginas);
        System.out.println("Valor final del alquiler: $" + calcularInteres());
    }
}

class CD extends Material {

    private String tipDisc;
    private String musical;

    public CD(String codigo, String titulo, String autor, double alquiler, String tipDisc, String musical) {
        super(codigo, titulo, autor, alquiler);
        this.tipDisc = tipDisc;
        this.musical = musical;
    }

    @Override
    public double calcularInteres() {
        if (musical.equalsIgnoreCase("si")) {  
            return getAlquiler() * 0.90;
        }
        return getAlquiler();
    }

    @Override
    public void calcularPrestamo() {
        System.out.println("Prestamo calculado para CD.");
        mostrar(); 
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo de disco: " + tipDisc);
        System.out.println("Valor final del alquiler: $" + calcularInteres());
    }
}