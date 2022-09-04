import java.util.Scanner;

public class EjercicioResuelto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vd1, vd2, vd3, sal;
        double sald1, sald2, sald3;
        
        System.out.print("Ingrese ventas del departamento 1 : ");
        vd1 = sc.nextInt();
        System.out.print("Ingrese ventas del departamento 2 : ");
        vd2 = sc.nextInt();
        System.out.print("Ingrese ventas del departamento 3 : ");
        vd3 = sc.nextInt();
        System.out.print("Ingrese salario de los empleados : ");
        sal = sc.nextInt();
        
        int totalven = vd1 + vd2 + vd3;
        double porcenven = totalven * 0.33;
        System.out.println(porcenven);
        if (vd1 > porcenven) {
            sald1 = sal * 1.2;
        }
        else{
            sald1 = sal;
        }
        if (vd2 > porcenven) {
            sald2 = sal * 1.2;
        }
        else{
            sald2 = sal;
        }
        if (vd3 > porcenven) {
            sald3 = sal * 1.2;
        }
        else{
            sald3 = sal;
        }
        
        System.out.println("Salario vendedores depto. 1, $"+sald1+"\nSalario vendedores depto. 2, $"+ sald2+ 
                           "\nSalario vendedores depto. 3, $" +sald3);
    }
}