package eva1_23_compras;
import java.util.*;


public class EVA1_23_COMPRAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String answear_ef,answear_cred;
        
        System.out.println("¿Usted tiene efectivo?\ns/n");
        answear_ef = input.nextLine().toLowerCase();
        System.out.println("¿Tiene credito?\ns/n");
        answear_cred = input.nextLine().toLowerCase();
        
        if(answear_ef.equals("si") || answear_cred.equals("si")){
            System.out.println("Puedes comprar");
        }else if(answear_ef.equals("s") || answear_cred.equals("s")){
             System.out.println("Puedes comprar");
        }else{
            System.out.println("No puedes comprar");
        }
        
    }
}
