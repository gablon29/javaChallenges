import Ajedrez.Tablero;
import Libreria.Libros;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // creamos la instancia del array de libros y inicializamos
        Libros[] libros = new Libros[3];

        // creamos las instancias de los libros
        Libros libros1 = new Libros("harry potter", 45, 3);
        Libros libros2 = new Libros("Tortuga", 44, 3);
        Libros libros3 = new Libros("Carancho", 55, 2);

        libros[0] = libros1;
        libros[1] = libros2;
        libros[2] = libros3;

        for (int i = 0; i < libros.length; i++) {
            System.out.println("Libro de " +  libros[i].getTitle());
        }
    }
}