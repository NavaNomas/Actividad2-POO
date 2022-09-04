import java.util.Scanner;

public class EjercicioResuelto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mayor;
        
        System.out.print("Ingrese N1: ");
        int a = sc.nextInt();
        System.out.print("Ingrese N2: ");
        int b = sc.nextInt();
        System.out.print("Ingrese N3: ");
        int c = sc.nextInt();
        
        if (a > b && a > c) {
            mayor = a;
        }
        else {
            if (b>c) {
                mayor = b;
            }
            else{
                mayor = c;
            }
        }
        System.out.println("El valor mayor entre "+a+ ", "+b+ ", Y "+ c+ ". Es : "+ mayor);
    }
}
