import java.util.Scanner;

public class J.Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int salariohora, horas, sal;
        
        System.out.print("Ingrese el nombre del empleado : ");
        nombre = sc.nextLine();
        System.out.print("Ingrese salario por hora : ");
        salariohora = sc.nextInt();
        System.out.print("Ingrese horas trabajadas : ");
        horas = sc.nextInt();    
        
        sal = salariohora * horas;
        
        if (sal >450000) {
            System.out.println("Nombre del empleado : " +nombre + ", salario mensual = "+sal);
        }
        else{
            System.out.println("Nombre del empleado : "+ nombre);
        } 
    }
}