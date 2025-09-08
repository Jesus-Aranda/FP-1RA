
package eva1_15_descuento;
import java.util.*;
public class EVA1_15_DESCUENTO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monto;
        
        System.out.println("Introdusca monto: ");
        monto = input.nextDouble();
        
        if(monto > 1000){
            monto = monto - (monto * .15);
            System.out.println("Tienes descuento del 15%");
            
        }else{
            System.out.println("No tienes descuento");
        }
        
        System.out.println("Tu precio final es: " + monto);
    }
    
}
