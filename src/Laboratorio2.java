public class Laboratorio2 {
    static RAM ram;

    public static void main(String[] args){
        init();

        boolean condition = true;
        while(condition){
            switch(Vista.menuDeOpciones()){
                case 1:
                    Programa programa = new Programa(Vista.newProgramStrings(), Vista.newProgramInts());
                    ProgramQueue.addProgram(programa);
                    queueToRAM();
                    break;
                case 2:
                    Vista.viewBlocks(ram.getBlocks().length);
                    break;
                case 3:
                    Vista.viewBlocksAvailable(ram.blocksAvailable());
                    break;
                case 4:
                    Vista.viewBlocksUsed(ram.blocksUsed());
                    break;
                case 5:
                    Vista.programsInUse(RAM.programsInUse());
                    break;
                case 6:
                    Vista.programsInQueue(ProgramQueue.programsInQueue());
                    break;
                case 7:
                    Vista.viewProgramInfo(RAM.usedByProgram(Vista.askProgramInfo()));
                    break;
                case 8:
                    Vista.viewBlocksAvailable(ram.blocksAvailable());
                    Vista.viewBlocksUsed(ram.blocksUsed());
                    break;
                case 9:
                    RAM.doClockCycle();
                    queueToRAM();
                    break;
                case 10:
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

    public static void queueToRAM(){
        if(ProgramQueue.queueIsFull()) {
            if (ProgramQueue.getBlocksNeeded() <= RAM.blocksAvailable()) {
                for (int i = 0; i < ProgramQueue.getBlocksNeeded(); i++) {
                    Bloque bloque = new Bloque(ProgramQueue.getParentName(), ProgramQueue.getParentid(), ProgramQueue.getClockCycles());
                    RAM.addBlock(bloque);
                }
                ProgramQueue.removeFromQueue();
            }
        }
    }
}
