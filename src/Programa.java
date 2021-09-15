public class Programa {
    private int clockCycles;
    private int memory;
    private String name;
    private String id;

    public Programa(String strings,int[] integers ){
        clockCycles = integers[0];
        memory = integers[1];
        name = strings;
        id = this.toString();
    }

    public int getClockCycles() {
        return clockCycles;
    }

    public int getMemory() {
        return memory;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int blocksNeeded(){
        int blocksNeeded = (int) memory/64;
        if(memory%64 != 0){
            blocksNeeded++;
        }
        return blocksNeeded;
    }
}
