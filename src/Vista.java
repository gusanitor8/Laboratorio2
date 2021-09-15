import java.util.Scanner;
import java.util.InputMismatchException;

public class Vista {
    private static Scanner input = new Scanner(System.in);

    public static int choseRAM(){
        System.out.println("Ingrese el tipo de RAM que va a usar: \n"+
                            "1. SDR\n" +
                            "2. DDR");

        int option = 0;
        try{
            System.out.println("Ingrese una opcion: ");
            option = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Por favor ingrese un numero entero");
            input.next();
        }
        return option;
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
            System.out.println("Por favor ingrese un numero   entero \n");
            input.next();
        }
        return option;
    }

    public static int choseSDR(){
        System.out.println("\t Elija un tamanio de memoria SDR: \n" +
                            "\t 1. 4gb\n"+
                            "\t 2. 8gb\n"+
                            "\t 3. 12gb\n" +
                            "\t 4. 16gb\n" +
                            "\t 5. 32gb\n" +
                            "\t 6. 64gb");

        int[] capacities = {4,8,12,16,32,64};
        int capacity = 0;

        try{
            capacity = capacities[input.nextInt() - 1 ];
        }catch(InputMismatchException e){
            System.out.println("Ingrese un numero entero");
            input.next();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("El numero que usted ingreso no esta dentro de las opciones");
            capacity = choseSDR();
        }
        //System.out.println("Usted eligio " + capacity + "gb");
        return capacity;
    }

    public static void viewBlocksAvailable(RAM ram){
        int blocksAvailable = 0;
        for(int i = 0; i < ram.getBlocks().length; i++){
            if(ram.getBlocks()[i]==null){
                blocksAvailable += 1;
            }
        }
        System.out.println("Hay " + blocksAvailable + " bloques de  memoria disponibles.");
    }

    public static void viewBlocksUsed(RAM ram){
        int blocksUsed = 0;
        for(int i = 0; i < ram.getBlocks().length; i++){
            if(ram.getBlocks()[i] != null){
                blocksUsed += 1;
            }
        }
        System.out.println("Hay " + blocksUsed + " bloques de  memoria en uso.");
    }

    public static void viewBlocks(RAM ram){
        System.out.println("La memoria RAM cuenta con " + ram.getBlocks().length + " bloques de memoria en total.");
    }

    public static void notAnOption(){
        System.out.println("Esta no es una opcion valida, intenta de nuevo");
    }
}
