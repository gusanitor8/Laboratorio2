import java.util.NoSuchElementException;
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
                            "9. Hacer ciclo de reloj \n" +
                            "10. Salir");

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
        return capacity;
    }

    public static void viewBlocksAvailable(int blocksAvailable){
        System.out.println("Hay " + blocksAvailable + " bloques de  memoria disponibles.");
    }

    public static void viewBlocksUsed(int blocksUsed){
        System.out.println("Hay " + blocksUsed + " bloques de  memoria en uso.");
    }

    public static void viewBlocks(int ramLength){
        System.out.println("La memoria RAM cuenta con " + ramLength + " bloques de memoria en total.");
    }

    public static int[] newProgramInts(){
        int[] integers = new int[2];

        try{
            System.out.println("Ingrese los ciclos de reloj necesarios para completar el proceso: ");
            integers[0] = input.nextInt();
            input.nextLine();
            System.out.println("Ingrese la memoria ocupada por el proceso (en MB): ");
            integers[1] = input.nextInt();
            input.nextLine();

        }catch(InputMismatchException e){
            System.out.println("El dato que usted ingreso no es un numero entero \n Intente de nuevo\n");
            input.next();
        }
        return integers;
    }

    public static String newProgramStrings(){
        String strings = null;
        try{
            System.out.println("Ingrese el nombre del programa: ");
            input.nextLine();
            strings = input.nextLine();

        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        return strings;
    }

    public static void notAnOption(){
        System.out.println("Esta no es una opcion valida, intenta de nuevo");
    }

    public static void programsInUse(String[] programsInUse){
        System.out.println("Los programas en ejecucion son: ");
        for(int i = 0; i < programsInUse.length; i++){
            System.out.println((i+1) + ". " +programsInUse[i]);
        }
        System.out.println("\n");
    }

    public static void programsInQueue(String[] programsInQueue){
        System.out.println("Los programas en la cola son: ");
        for(int i = 0; i < programsInQueue.length; i++){
            System.out.println((i+1)+ ". " + programsInQueue[i]);
        }
        System.out.println("\n");
    }

    public static String askProgramInfo(){
        String program = null;
        try{
            input.nextLine();
            program = input.nextLine();
            System.out.println("El programa es: " + program);
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }catch(IllegalStateException e){
            e.printStackTrace();
        }
        return program;
    }

    public static void viewProgramInfo(int blocksUsed){
        System.out.println("El programa esta usando "+ blocksUsed + "bloques de memoria. \n");
    }


}
