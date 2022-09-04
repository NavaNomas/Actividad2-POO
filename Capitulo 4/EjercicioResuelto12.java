import java.util.Scanner;

public class EjercicioResuelto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombres;
        int numerohoras, valorhora, salario;
        
        System.out.print("Ingrese nombre del trabajador : ");
        nombres = sc.nextLine();
        System.out.print("Ingrese numero de horas trabajadas : ");
        numerohoras = sc.nextInt();
        System.out.print("Ingrese el valor de hora normal : ");
        valorhora = sc.nextInt();
        
        
        if (numerohoras > 40 ) {
            if (numerohoras-40 > 8) {
                salario = 40*valorhora + 16*valorhora + (numerohoras-40-8)*3*valorhora;
            }
            else{
                salario = 40*valorhora + (numerohoras-40)*2*valorhora;
            }
        }
        else{
            salario = numerohoras * valorhora;
        
        }        
        System.out.println("El trabajador "+ nombres +" devengo $" +salario);
    }
}