import java.util.Scanner;
import java.util.InputMismatchException;

public class Vista {
    private static Scanner input = new Scanner(System.in);

    private static int choseRAM(){
        System.out.println("Ingrese el tipo de RAM que va a usar: \n"+
                            "1. SDR\n" +
                            "2. DDR");

        int option = 0;
        try{
            System.out.println("Ingrese una opcion: ");
            option = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Por favor ingrese un numero entero");
        }
    }

    public static int menuDeOpciones(){
        System.out.println("Elija una opcion \n"+
                            "1. Ingresar Programa\n"+
                            "2. Ver cantidad de RAM total\n" +
                            "3. Ver cantidad de memoria disponible\n" +
                            "4. Ver cantidad de memoria en uso \n" +
                            "5. Ver programas en ejecucucion\n" +
                            "6. Ver programas en cola\n" +
                            "7. Ver los espacios de un programa en particular \n" +
                            "8. Ver estado de la memoria \n" +
                            "9. Salir");

        int option = 0;
        try{
            System.out.println("Ingrese una opcion: ");
            option = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Por favor ingrese un numero entero \n");
        }
        return option;
    }
}
