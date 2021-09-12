public class Laboratorio2 {
    public static void main(String[] args){
        init();

        boolean condition = true;
        while(condition){
            switch(Vista.menuDeOpciones()){
                case 1:
                    System.out.println("Ingresaste la opcion 1 \n\n");
                    break;
                case 9:
                    condition = false;
                    break;
                default:
                    System.out.println("Esa opcion no es valida intenta de nuevo");
                    break;
            }
        }
    }

    public static void init(){
        boolean condicion = true;

        while(condicion){
            switch (Vista.choseRAM()){
                case 1:
                    System.out.println("eligio " + Vista.choseSDR() + "gb");
                    condicion = false;
                    break;
                case 2:
                    condicion = false;
                    break;
                default:
                    System.out.println("Por favor elija una  de las opciones");
            }
        }
    }
}
