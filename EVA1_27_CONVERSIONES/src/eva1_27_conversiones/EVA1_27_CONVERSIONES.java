package eva1_27_conversiones;

public class EVA1_27_CONVERSIONES {

    public static void main(String[] args) {
        int temp;
        double tempDec = 25.7;
        
        temp = (int)tempDec; //casting
        
        System.out.println(temp);
        
        double tempDec2;
        tempDec2 = temp;
        System.out.println(temp);
        
        String cade,mensaje;
        cade = "La temperatura es ";
        mensaje = cade + temp; //Concatenacion
        
        System.out.println(mensaje);
    }
}
