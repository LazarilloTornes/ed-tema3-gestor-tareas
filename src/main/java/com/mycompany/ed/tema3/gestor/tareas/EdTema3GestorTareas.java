import java.util.Scanner;
import java.util.InputMismatchException;


public class EdTema3GestorTareas {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        lecturaSegura(scr,"Introduce un valor: ");
        lecturaSegura(scr,"Introduce otro valor: ");
        
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
