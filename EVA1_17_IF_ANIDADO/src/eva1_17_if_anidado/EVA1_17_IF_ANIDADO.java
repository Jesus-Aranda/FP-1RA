package eva1_17_if_anidado;
import java.util.*;

public class EVA1_17_IF_ANIDADO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte days;
        
        System.out.println("Numero del dia de la semana: ");
        days = input.nextByte();
        
        if(days == 1){
            System.out.println("Hoy es Domingo");
        }else if(days == 2){
            System.out.println("Hoy es Lunes");
        }else if(days == 3){
            System.out.println("Hoy es Martes");
        }else if(days == 4){
            System.out.println("Hoy es Miercoles");
        }else if(days == 5){
            System.out.println("Hoy es Jueves");
        }else if(days == 6){
            System.out.println("Hoy es Viernes");
        }else if(days == 7){
            System.out.println("Hoy es Sabado");
        }else{
            System.out.println("Ese numero no esta en la semana");
        }
    }
}
