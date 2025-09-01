
package eva1_81.pkg82.pkg83_temperatura;
public class EVA1_818283_TEMPERATURA {
    public static void main(String[] args) {
        double temp_C,temp_F,temp_K;
        
        temp_C = 26;
        
        temp_F = ((9 * temp_C)/5) + 32;
        
        System.out.println("La temperatura de 26 grados centigrados en grados Farenheit es de: ");
        System.out.println(temp_F);
        
        temp_F = 78.8;
        
        temp_C = ((5*(temp_F - 32))/9);
        
        temp_K = temp_C + 273.15;
        
        System.out.println("La temperatura de 78.8 grados farenheit en grados Centigrados es de:");
        System.out.println(temp_C);
        
        System.out.println("La temperatura de 26 grados centigrados en grados Kelvin es de:");
        System.out.println(temp_K);
    }
    
}
