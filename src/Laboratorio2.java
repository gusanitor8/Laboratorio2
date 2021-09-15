public class Laboratorio2 {
    static RAM ram;

    public static void main(String[] args){
        init();

        boolean condition = true;
        while(condition){
            switch(Vista.menuDeOpciones()){
                case 1:
                    System.out.println("Ingresaste la opcion 1 \n\n");
                    break;
                case 2:
                    Vista.viewBlocks(ram);
                    break;
                case 3:
                    Vista.viewBlocksAvailable(ram);
                    break;
                case 4:
                    Vista.viewBlocksUsed(ram);
                    break;
                case 9:
                    condition = false;
                    break;
                default:
                    Vista.notAnOption();
                    break;
            }
        }
    }

    public static void init(){
        boolean condicion = true;

        while(condicion){
            switch (Vista.choseRAM()){
                case 1:
                    ram = new RAM(Vista.choseSDR(), 1);
                    condicion = false;
                    break;
                case 2:
                    ram = new RAM();
                    condicion = false;
                    break;
                default:
                    Vista.notAnOption();
            }
        }
    }
}
