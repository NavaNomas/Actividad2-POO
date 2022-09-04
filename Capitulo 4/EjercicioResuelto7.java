import java.util.Scanner;

public class EjercicioResuelto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de A : ");
        float a = sc.nextFloat();
        
        System.out.print("Ingrese el valor de B : ");
        float b = sc.nextFloat();
        
        if (a>b) {
            System.out.println("A es mayor a B");
        }
        else {
            if (a==b) {
            System.out.println("A es igual a B");
            }
            else {
            System.out.println("A es menor a B");
            }
        }
    }
}