import java.util.ArrayList;

public class RAM {
    static private Bloque[] blocks;
    private int memory;
    private int type;

    public RAM(int memory, int type){
        this.type = type;
        this.memory = memory;
        blocks = new Bloque[memory*16];
    }

    public RAM(){
        this.type = 2;
        this.memory = 4;
        blocks = new Bloque[memory * 16];
    }

     public static Bloque[] getBlocks() {
        return blocks;
    }

    public static int blocksAvailable(){
        int blocksAvailable = 0;
        for(int i =0; i < blocks.length; i++){
            if(blocks[i] == null){
                blocksAvailable++;
            }
        }
        return blocksAvailable;
    }

    public static int blocksUsed(){
        int blocksUsed = 0;
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i] != null){
                blocksUsed++;
            }
        }
        return blocksUsed;
    }

    public static String[] programsInUse(){
        ArrayList<String> programsInUse = new ArrayList<String>();
        for(int i = 0; i < blocksUsed(); i++){
            if(programsInUse.contains(blocks[i].getName())==false){
                programsInUse.add(blocks[i].getName());
            }
        }
        return programsInUse.toArray(new String[0]);
    }

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

    public static void doClockCycle(){
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i]!=null){
                if(blocks[i].getClockCycles()>0) {
                    blocks[i].setClockCycles(blocks[i].getClockCycles() - 1);
                }else{
                    blocks[i] = null;
                }
            }
        }
    }
}
