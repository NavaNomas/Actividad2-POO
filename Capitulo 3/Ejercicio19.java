import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del triangulo : ");
        float lado = sc.nextFloat();
        
        float perimetro = 3*lado; 
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
        double altura = (Math.sqrt(3) / 2) * lado;
        
        System.out.println("Perimetro = "+ perimetro);
        System.out.println("Area = "+ area);
        System.out.println("Altura = "+ altura);
        
        
        
    }
    
}
