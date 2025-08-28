
package eva1_6_operaciones;
public class EVA1_6_OPERACIONES {

    
    public static void main(String[] args) {
        //Declaración de variables
        double area;
        double radio;
        double p;
        
        //Inicialización:
        radio = 5;
        p = 3.1416;
        area = p * radio * radio;
        
        //Imprimir
        System.out.println("El area de un circulo de radio = 5 es: ");
        System.out.println(area);
        
        //Nuevo circulo radio 100
        radio = 100;
        area = p * radio * radio;
        
        //Imprimir
        System.out.println("El area de un circulo de radio = 100 es: ");
        System.out.println(area);
        
       
    }
    
}
