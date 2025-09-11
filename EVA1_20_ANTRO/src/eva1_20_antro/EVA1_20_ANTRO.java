package eva1_20_antro;
import java.util.*;

public class EVA1_20_ANTRO {
    final static byte AGE_CORRECT = 18 ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answare_cred;
        byte age;
        
        System.out.println("Introdusca su edad");
        age = Byte.parseByte(input.nextLine());
        
        if(age >= AGE_CORRECT){
            System.out.println("¿Tienes INE?\ns/n");
            answare_cred = input.nextLine().toLowerCase();
            if(answare_cred.equals("s") || answare_cred.equals("si")){
                System.out.println("Puedes entrar");
            }else{
                System.out.println("Necesitas demostrar tu edad");
            }
        }else{
            System.out.println("No tienes la edad permitida");
        } 
    }
}
