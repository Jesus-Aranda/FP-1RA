package eva1_18_meses;
import java.util.*;

public class EVA1_18_MESES {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte month;
        
        System.out.println("Escribe el numero del mes: ");
        month = input.nextByte();
        
        if(month == 1){
            System.out.println("Es Enero");
        }else if(month == 2){
            System.out.println("Es Febrero");
        }else if(month == 3){
            System.out.println("Es Marzo");
        }else if(month == 4){
            System.out.println("Es Abril");
        }else if(month == 5){
            System.out.println("Es Mayo");
        }else if(month == 6){
            System.out.println("Es Junio");
        }else if(month == 7){
            System.out.println("Es Julio");
        }else if(month == 8){
            System.out.println("Es Agosto");
        }else if(month == 9){
            System.out.println("Es Septiembre");
        }else if(month == 10){
            System.out.println("Es Octubre");
        }else if(month == 11){
            System.out.println("Es Noviembre");
        }else if(month == 12){
            System.out.println("Es Diciembre");
        }else{
            System.out.println("No existe ese numero en meses");
        }       
    }
}
