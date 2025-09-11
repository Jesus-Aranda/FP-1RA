package eva1_22_acceso_tablas;
import java.util.*;


public class EVA1_22_ACCESO_TABLAS {
    final static String USER_1 = "admin";
    final static String PASSWORD_1 = "123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user,password;
        
        System.out.println("----------Control de Acceso----------");
        System.out.println("Introduce tu usuario");
        user = input.nextLine();
        System.out.println("Introduce tu contraseña");
        password = input.nextLine();
        
        if(USER_1.equals(user) && PASSWORD_1.equals(password)){
                System.out.println("Acceso Concedido"); 
        }else{
            System.out.println("Usuario y/o contraseña incorrectas");
        }
        
    }
}
