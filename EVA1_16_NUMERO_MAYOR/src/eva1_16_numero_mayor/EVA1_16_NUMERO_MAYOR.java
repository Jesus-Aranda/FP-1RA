
package eva1_16_numero_mayor;
import java.util.*;
public class EVA1_16_NUMERO_MAYOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number_1,number_2;
        
        System.out.println("Introdusca el primer numero: ");
        number_1 = input.nextDouble();
        System.out.println("Introdusca el segundo numero: ");
        number_2 = input.nextDouble();
        
        if(number_1 > number_2){
            System.out.println("El numero uno es mayor que el numero dos");
            System.out.println(number_1 + " > " + number_2);
        }else{
            System.out.println("El numero dos es mayor que el numero uno");
            System.out.println(number_2 + " > " + number_1);
        }
        
    }
    
}
