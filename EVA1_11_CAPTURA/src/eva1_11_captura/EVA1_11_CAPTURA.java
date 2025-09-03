
package eva1_11_captura;
import java.util.*;
public class EVA1_11_CAPTURA {
    public static void main(String[] args) {
        //Calculo de velocidad (M/S)
        //Declara variables y Scanner
        Scanner input = new Scanner(System.in);
        double vel_m,vel_km,time,dist ;
        //Solicitar datos
        System.out.println("Ingrese la distancia recorrida: (Ingresar en metros)");
        dist = input.nextDouble();
        System.out.println("Ingrese el tiempo que se tardo: (Ingresar en segundos");
        time = input.nextDouble();
        //Realizar calculos
        vel_m = dist/time;
        
        vel_km = (vel_m * 3600)/1000 ;
        //Mostrar resultados
        System.out.println("Tu velocidad es de: ");
        System.out.println(vel_m + " m/s o " + vel_km + " km/h");
        
        
        
        
    }
    
}
