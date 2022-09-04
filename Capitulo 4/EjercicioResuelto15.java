import java.util.Scanner;

public class EjercicioResuelto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pea, peb, pec, ped;
        
        System.out.print("Ingrese peso de A : ");
        pea = sc.nextInt();
        System.out.print("Ingrese peso de B : ");
        peb = sc.nextInt();
        System.out.print("Ingrese peso de C : ");
        pec = sc.nextInt();
        System.out.print("Ingrese peso de D : ");
        ped = sc.nextInt();       
        
        if ((pea == peb) && (pea == pec)) {           
                System.out.println("La esfera D es la diferente y ");
                if (ped>pea) {
                    System.out.println("es de mayor peso");
                }
                else{
                    System.out.println("es de menor peso");
                }
        }
        else{
            if ((pea==peb) && (pea==ped)) {
                System.out.println("La esfera C es la diferente y ");
                if (pec>pea) {
                    System.out.println("Es de mayor peso");
                }
                else{
                    System.out.println("Es de menor peso");
                }
            }
            else{
                if ((pea == pec) && (pea==ped)) {
                    System.out.println("La esfera B es la diferente y");
                    if (peb > ped) {
                        System.out.println("es de mayor peso");
                    }
                    else{
                        System.out.println("es de menor peso");
                    }
                }
                else{
                    System.out.println("La esfera A es la diferente y ");
                    if (pea > peb) {
                        System.out.println("es de mayor peso");
                    }
                    else{
                        System.out.println("es de menor peso");
                    }
                }
       
            } 
        }
    }
}