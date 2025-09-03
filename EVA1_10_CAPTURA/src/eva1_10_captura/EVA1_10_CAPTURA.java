package eva1_10_captura;
import java.util.*;

public class EVA1_10_CAPTURA {
    public static void main(String[] args) {
        //Solicitar temperatura en farenheit
        Scanner input = new Scanner(System.in);
        double temp_C,temp_F;
        //Captura
        System.out.println("Temperatura en grados Farenheits: ");
        temp_F = input.nextDouble();
        //Darle la temperatura en grados centigrados
        temp_C = ((5*(temp_F - 32))/9);
        System.out.println("La temperatura es: ");
        System.out.println(temp_C);
        
        
    }
    
}
