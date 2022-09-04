import java.util.Scanner;

public class EjercicioResuelto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int NI, PAT, ES;
        String nombres;
        
        System.out.print("Número de Inscripción : ");
        NI = sc.nextInt();
        String salto = sc.nextLine();
        System.out.print("Nombre : ");   
        nombres = sc.nextLine();
        System.out.print("Patrimonio : ");
        PAT = sc.nextInt();
        System.out.print("Estrato social : ");
        ES = sc.nextInt();
       
        double pagmat = 50000;
        
        if (PAT > 2000000 && ES > 3) {
            pagmat += 0.03 * PAT;
        }
        
        System.out.println("El estudiante con numero de inscripcion: " + NI + 
                           "\ny nombre; "+ nombres + ", Debe pagar = $" + pagmat);
    }
}