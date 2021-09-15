public class RAM {
    private Bloque[] blocks;
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

    //borrame
    public int blocksAvailable(){
        int blocksAvailable = 0;
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i]==null){
                blocksAvailable += 1;
            }
        }

    return blocksAvailable;
    }

    public Bloque[] getBlocks() {
        return blocks;
    }
}
