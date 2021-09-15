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
        for(int i = 0; i  < blocks.length; i++){
            if(programsInUse.contains(blocks[i].getName())==false){
                programsInUse.add(blocks[i].getName());
            }
        }
        return programsInUse.toArray(new String[0]);
    }

}
