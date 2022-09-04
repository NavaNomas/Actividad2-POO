import java.util.Scanner;

public class J.Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, x1, x2;
        
        System.out.print("Ingrese el valor de A : ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor de B : ");
        b = sc.nextDouble();
        System.out.print("Ingrese el valor de C : ");
        c = sc.nextDouble();
        
        double discriminante = b*b - 4*a*c;
        if (discriminante >= 0) {
            x1 = (-b + Math.sqrt(discriminante) / 2*a);
            x2 = (-b - Math.sqrt(discriminante) / 2*a);
            System.out.println("X1 : " + x1);
            System.out.println("X2 : " + x2);
        }
        else{
            System.out.println("No existen soluciones reales");
        }
        
    }
}
