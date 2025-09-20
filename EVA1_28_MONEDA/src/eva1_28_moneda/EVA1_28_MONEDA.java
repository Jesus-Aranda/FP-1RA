package eva1_28_moneda;
import java.util.*;

public class EVA1_28_MONEDA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte user;
        double machine;
        
        System.out.println("Elige aguila o sello (1/0)");
        user = Byte.parseByte(input.nextLine());
        //Como lanzamos una moneda
        machine = Math.random();
        if(user == 0 || user == 1){
            if(machine > .5 ){
                System.out.println("Es aguila");
                if(user == 1){
                    System.out.println("Ganaste");
                }else{
                    System.out.println("Perdiste");}
                
            }else if(machine < .5){
                System.out.println("Es sello");
                if(user == 0){
                    System.out.println("Ganaste");
                }else{
                    System.out.println("Perdiste");
                }  
            }
            
        }else{
            System.out.println("Favor de escoger 1/0");
        }
    }
}
