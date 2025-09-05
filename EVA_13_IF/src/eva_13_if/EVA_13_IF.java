package eva_13_if;
import java.util.*;
public class EVA_13_IF {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner input = new Scanner(System.in);
        double calif;
        
        //Captura
        System.out.println("Escribe tu calificacion: ");
        calif = input.nextDouble();
        
        //Estructura de control If - Then - Else
        //If solo evalua Verdadero (true) o Falso (false)
        if(calif >= 70){
            //Aqui va lo que corresponede a verdadero
            System.out.println("Felicidades, acreditaste!!");
        }else{
            System.out.println("AZOTES!!");
        }
        
    }
    
}
