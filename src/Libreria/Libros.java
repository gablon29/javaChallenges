package Libreria;

public class Libros {
    String title;
    int price;
    int valueStock;

    public Libros(String title, int price, int valueStock) {
        this.title = title;
        this.price = price;
        this.valueStock = valueStock;
    }

    public String getTitle() {
        return title;
    }
}
