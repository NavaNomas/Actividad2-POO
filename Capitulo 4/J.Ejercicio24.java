import java.util.Scanner;

public class J.Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double pesoa, pesob, pesoc;
        
        System.out.print("Ingrese el peso A");
        pesoa = sc.nextDouble();
        System.out.print("Ingrese el peso B");
        pesob = sc.nextDouble();
        System.out.print("Ingrese el peso C");
        pesoc = sc.nextDouble();
        
        if (pesoa>pesob) {
            if (pesoa>pesoc) {
                System.out.println("El mayor es el peso A ." + pesoa);
            }
            else{
                System.out.println("El mayor es el peso C ." +pesoc);
            }
        }
        else{
            if (pesob>pesoc) {
                System.out.println("El mayor es el peso B ." +pesob);
            }
            else{
                System.out.println("El mayor es el peso C." + pesoc);
            }
        }
        //double mayor = Math.max(pesoa, Math.max(pesob, pesoc)); //Otra forma de encontrar el mayor usando java.math
    }
}
