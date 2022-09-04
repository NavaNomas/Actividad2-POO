import java.util.Scanner;

public class EjercicioResuelto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valorcompra;
        String color;
        double descuento;
        
        System.out.print("Ingrese el valor de la compra : ");
        valorcompra = sc.nextInt();
        String salto = sc.nextLine();
        System.out.print("Ingrese el color de la bolita : ");
        color = sc.nextLine();
        
        if (color.equals("blanco")) {
            descuento = 0;
        }
        else{
            if (color.equals("verde")) {
                descuento = 0.1;
            }
            else{
                if (color.equals("amarillo")) {
                    descuento = 0.25;
                }
                else{
                    if (color.equals("azul")) {
                        descuento = 0.5;
                    }
                    else{
                        descuento = 1;
                    } 
                }
            }
        }
        System.out.println("El cliente debe pagar :$ " +(valorcompra*(1-descuento)));
    }
}