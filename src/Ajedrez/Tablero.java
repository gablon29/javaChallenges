package Ajedrez;


public class Tablero {
    private Casillas[][] casillas;

    public Tablero() {
        casillas = new Casillas[8][8];
        for (int rows = 0; rows < 8; rows++) {
            for (int columns = 0; columns < 8; columns++) {
                casillas[rows][columns] = new Casillas(rows, columns);
            }
        }
    }

    public void MoldearTablero() {
        for (int rows = 0; rows < 8; rows++) {
            for (int columns = 0; columns < 8; columns++) {
                System.out.print(casillas[rows][columns].getSymbols() + " ");
            }
            System.out.println();
        }
    }
}
