public class Bloque {
    String name;
    String parentId;

    public Bloque(String name, String parentId){
        this.name = name;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }
}
