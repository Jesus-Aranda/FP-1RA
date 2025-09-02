package eva1_9_captura;
import java.util.*;

public class EVA1_9_CAPTURA {
    public static void main(String[] args) {
        String name;
        byte age;
        double avarage;
        //Como capturar en Java:
        Scanner input = new Scanner(System.in); //Creamos el Scanner
        
        System.out.println("Introduce el nombre completo: ");
        name = input.nextLine(); //nextLine() --> Captura Texto
        
        System.out.println("Introduce la edad: ");
        age = input.nextByte(); //nextLine() --> Captura Numero/Completo
        
        System.out.println("Introduce el promedio: ");
        avarage = input.nextDouble(); //nextLine() --> Captura Numero/Decimal
        
        System.out.println("El nombre capturado es: ");
        System.out.println(name);
        System.out.println("La edad es: ");
        System.out.println(age);
        System.out.println("El promedio es: ");
        System.out.println(avarage);
        
        
        
    }
    
}
