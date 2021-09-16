public class Bloque {
    String name;
    String parentId;
    int clockCycles;

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
