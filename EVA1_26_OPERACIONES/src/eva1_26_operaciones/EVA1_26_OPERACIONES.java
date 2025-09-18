package eva1_26_operaciones;


public class EVA1_26_OPERACIONES {

    public static void main(String[] args) {
        //Divisiones
        int val1 = 7, val2 = 3;
        int resu;
        resu = val1/val2;
        System.out.println("1 / 3 = ");
        System.out.println(resu);
        
        double v1 = 7, v2 = 3;
        double res;
        res = v1/v2;
        System.out.println("1 / 3 = ");
        System.out.println(res);
        
        //Calcular residuo
        //Residuo = Modulo = %
        int num1 = 2024, num2 = 4;
        int resi;
        resi = num1 % num2;
        System.out.println("El residuo de 2024 / 4 = ");
        System.out.println(resi);
        if(resi == 0)
            System.out.println("Puede que sea biciesto");
   
    }
}
