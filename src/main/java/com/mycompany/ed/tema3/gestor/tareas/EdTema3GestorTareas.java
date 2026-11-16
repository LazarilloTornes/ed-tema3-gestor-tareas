import java.util.Scanner;
import java.util.InputMismatchException;


public class EdTema3GestorTareas {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int opt = 1;
        double num1 =0, num2 = 0;
        while(opt != 0){
            menu();
            System.out.print("Introduce la opcion: ");
            opt = scr.nextInt();
            switch (opt) {
                case 1:
                    num1 = lecturaSegura(scr,"Introduce un valor: ");
                    num2 = lecturaSegura(scr,"Introduce otro valor: ");
                    System.out.println("Resultado: "+num1+" + "+num2+" = " + (num1+num2));
                    break;
                case 2:
                    num1 = lecturaSegura(scr,"Introduce un valor: ");
                    num2 = lecturaSegura(scr,"Introduce otro valor: ");
                    System.out.println("Resultado: "+num1+" - "+num2+" = " + (num1-num2));
                    break;
                case 3:
                    num1 = lecturaSegura(scr,"Introduce un valor: ");
                    num2 = lecturaSegura(scr,"Introduce otro valor: ");
                    System.out.println("Resultado: "+num1+" * "+num2+" = " + (num1*num2));
                    break;
                case 4:
                    num1 = lecturaSegura(scr,"Introduce un valor: ");
                    num2 = lecturaSegura(scr,"Introduce otro valor: ");
                    if(num2 != 0){
                    System.out.println("Resultado: "+num1+" / "+num2+" = " + (num1/num2));
                    }
                    else{
                        System.out.println("Error el segundo digito es 0");
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta, introduce la opcion otra vez");
                    break;   
            }
        }    
    }
    public static void menu(){
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("0. Salida");
    }
    public static double lecturaSegura(Scanner scr,String msg) {
        double lcr = 0;
        boolean valid = false;
            while(!valid){
                try{
                System.out.print(msg);
                lcr = scr.nextDouble();
                valid = true;
                } catch (InputMismatchException e){
                    System.out.println("Introduzca un valor válido");
                    scr.next();
                }
            }
            return lcr;
    }
}
