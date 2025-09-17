package eva1_24_califas;
import java.util.*;

public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte calif_mex;
        String calif_eu;
        
        System.out.println("Introduce tu calificación");
        calif_mex = Byte.parseByte(input.nextLine());

        if(calif_mex >= 0 && calif_mex <= 59){
            System.out.println("Tu calificacion es F");
        }else if(calif_mex <= 69 && calif_mex > 59){
            System.out.println("Tu calificacion es D");
        }else if(calif_mex <= 79 && calif_mex > 69){
            System.out.println("Tu calificacion es C");
        }else if(calif_mex <= 89 && calif_mex > 79){
            System.out.println("Tu calificacion es B");
        }else if(calif_mex <= 100 && calif_mex > 89){
            System.out.println("Tu calificacion es A");
        }else{
            System.out.println("Numero no calificable");
        }
    }
}
