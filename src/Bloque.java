public class Bloque {
    String name;
    String parentId;
    int clockCycles;

    /**
     * metodo constructor
     * @param name nombre del programa
     * @param parentId id del programa
     * @param clockCycles numero de ciclos de reloj necesarios
     */
    public Bloque(String name, String parentId, int clockCycles){
        this.name = name;
        this.parentId = parentId;
        this.clockCycles = clockCycles;
    }

    public int getClockCycles() {
        return clockCycles;
    }

    public void setClockCycles(int clockCycles) {
        this.clockCycles = clockCycles;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }
}
