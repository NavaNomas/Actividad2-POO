import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el codigo del empleado : ");
        int codigo = sc.nextInt();
        String sl = sc.nextLine(); //NextInt introduce ademas un /n, por lo que esta linea lo lee para evitar errores
        System.out.print("Ingrese el nombre del empleado : ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese numero de horas trabajadas : ");
        int horas = sc.nextInt();
        System.out.print("Ingrese el valor por hora : ");
        float valorhora = sc.nextFloat();
        System.out.print("Ingrese el valor de retencion de fuente (%) : ");
        float retencion = sc.nextFloat();
        
        float salariobruto = valorhora * horas;
        float retenciontotal = salariobruto * retencion /100;
        float salarioneto = salariobruto - retenciontotal;
        
        System.out.println("Empleado N°"+codigo +", " + nombre +". Salario bruto = " +salariobruto + ", Salario neto = "+salarioneto);
        
    }
    
}
