package PruebaFigura;

public class Rombo {
    int diagonalmenor;
    int diagonalmayor;
    
    public Rombo(int diagonalmenor, int diagonalmayor){
        this.diagonalmenor = diagonalmenor;
        this.diagonalmayor = diagonalmayor;
    }
    double calcularArea() {
        return diagonalmenor*diagonalmayor / 2 ;
    }

    double calcularPerimetro() {
        return 2*Math.sqrt(diagonalmenor*diagonalmenor + diagonalmayor*diagonalmayor);
    }
}
