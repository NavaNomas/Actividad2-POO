import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del lado 1 del triángulo : ");
        float lado1 = sc.nextFloat();
        
        System.out.print("Ingrese el valor del lado 2 del triángulo : ");
        float lado2 = sc.nextFloat();
        
        System.out.print("Ingrese el valor del lado 3 del triángulo : ");
        float lado3 = sc.nextFloat();
        
        
        float perimetro = lado1 + lado2 + lado3;
        float semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro*(semiperimetro - lado1)*(semiperimetro - lado2)*(semiperimetro - lado3));
        
        System.out.println("Perimetro = "+perimetro+", Semiperimetro = "+semiperimetro+", Area = "+area);
        
    }
}
