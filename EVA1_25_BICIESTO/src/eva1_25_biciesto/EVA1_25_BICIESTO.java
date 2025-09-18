package eva1_25_biciesto;
import java.util.*;

public class EVA1_25_BICIESTO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double user_num,operation_1,operation_2;
        System.out.println("Ingresa un año");
        user_num = Double.parseDouble(input.nextLine());
        
        operation_1 = user_num % 4;
        
        if(operation_1 == 0){
            operation_1 = user_num % 100;
            operation_2 = user_num % 400;
            if(operation_1 == 0 && operation_2 == 0){
                System.out.println("Es biciesto"); 
            }else if(operation_1 == 0){
                System.out.println("No es biciesto");
            }else{
                System.out.println("Es biciesto");
            }
        }else{
            System.out.println("No es biciesto");
        }
        
        
        
        
    }
}
