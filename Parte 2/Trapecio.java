package PruebaFigura;

public class Trapecio {
    int basemenor;
    int basemayor;
    int altura;
    int lado1;
    int lado2;
    
    public Trapecio(int basemenor, int basemayor, int altura, int lado1, int lado2){
        this.basemenor = basemenor;
        this.basemayor = basemayor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
     double calcularArea() {
         return (basemenor + basemayor) * altura / 2;
    }

    double calcularPerimetro() {
        return lado1 + lado2 + basemenor + basemayor;
    }
}
