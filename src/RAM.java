import java.util.ArrayList;

public class RAM {
    static private Bloque[] blocks;
    private int memory;
    private static int type;

    /**
     * metodo constructor de la clase RAM
     * @param memory entero que define l a memoria de la RAM
     * @param type define si se va a comportar como DDR o SDR
     */
    public RAM(int memory, int type){
        this.type = type;
        this.memory = memory;
        blocks = new Bloque[memory*16];
    }

    /**
     * metodo constructor
     */
    public RAM(){
        this.type = 2;
        this.memory = 4;
        blocks = new Bloque[memory * 16];
    }

     public static Bloque[] getBlocks() {
        return blocks;
    }

    public static int getType() {
        return type;
    }

    /**
     * verifica el numero de bloques de memoria disponibles en la RAM
     * @return devuelve el numero de bloques disponibles
     */
    public static int blocksAvailable(){
        int blocksAvailable = 0;
        for(int i =0; i < blocks.length; i++){
            if(blocks[i] == null){
                blocksAvailable++;
            }
        }
        return blocksAvailable;
    }


    /**
     * Verifica los bloques de memoria que estan siendo usados
     * @return devuelve el numero de bloques en uso por la RAM
     */
    public static int blocksUsed(){
        int blocksUsed = 0;
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i] != null){
                blocksUsed++;
            }
        }
        return blocksUsed;
    }

    /**
     * Indica que progrmas estan siendo procesados en la RAM
     * @return devuelve una lista de Strings con los programas siendo usados por la memoria
     */
    public static String[] programsInUse(){
        ArrayList<String> programsInUse = new ArrayList<String>();
        for(int i = 0; i < blocksUsed(); i++){
            if(programsInUse.contains(blocks[i].getName())==false){
                programsInUse.add(blocks[i].getName());
            }
        }
        return programsInUse.toArray(new String[0]);
    }

    /**
     * agrega un bloque de memoria a la RAM
     * @param bloque el bloque que se quiera introducir a la RAM
     */
    public static void addBlock(Bloque bloque){
        boolean condicion = true;
        int i = 0;
        while(condicion){
            if(blocks[i] == null){
                blocks[i] = bloque;
                condicion = false;
            }
            i++;
        }
    }

    /**
     * Indica cuantos bloques esta usando un programa
     * @param program El nombre del programa
     * @return Los bloques usados por ese programa
     */
    public static int usedByProgram(String program){
        int usedByProgram = 0;
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i]!=null){
                if(blocks[i].getName().equals(program)){
                    usedByProgram++;
                }
            }
        }
        return usedByProgram;
    }

    /**
     * Hace un ciclo de reloj
     * @param type define si se va a comportar como DDR o SDR
     */
    public static void doClockCycle(int type){
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i]!=null){
                if(blocks[i].getClockCycles()>0) {
                    blocks[i].setClockCycles(blocks[i].getClockCycles() - type);
                }else{
                    blocks[i] = null;
                }
            }
        }
    }
}
