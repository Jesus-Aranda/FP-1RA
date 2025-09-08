
package eva1_14_votar;
import java.util.*;
public class EVA1_14_VOTAR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short year;
        
        System.out.println("Indique su año de nacimiento: ");
        year = input.nextShort();
        
        if((2025 - year) >= 18){
            System.out.println("Felecidades, puedes votar");
        }else{
            System.out.println("Eres menor, no puedes votar");
        }
    }
    
}
