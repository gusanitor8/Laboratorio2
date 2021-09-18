import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class ProgramQueue {
    private static Queue<Programa> queue = new LinkedList<Programa>();

    /**
     * Agrega programa a la cola
     * @param programa recibe un objeto de la clase Programa
     */
    public static void addProgram(Programa programa){
        queue.add(programa);
        //InstanceBlocks(programa,blocksToInstance(programa));
        System.out.println("El programa ha sido agregado");
    }

    /**
     * revisa si hay al menos un programa en la cola
     * @return devuelve true si hay al menos un programa en la cola
     */
    public static boolean queueIsFull(){
        boolean isFull = false;
        if (queue.peek() != null){
            isFull = true;
        }
        return isFull;
    }

    public static int getBlocksNeeded(){
        return queue.peek().blocksNeeded();
    }

    public static String getParentid(){
        return queue.peek().getId();
    }

    public static String getParentName(){
        return queue.peek().getName();
    }

    public static int getClockCycles(){
        return queue.peek().getClockCycles();
    }

    public static void removeFromQueue(){
        queue.poll();
    }

    /**
     * Indica los programas en la cola
     * @return devuelve un array con el nombre de los programas en la cola
     */
    public static String[] programsInQueue(){
        ArrayList<String> list = new ArrayList<String>();
        Queue<Programa> queue2 = new LinkedList<>(queue);

        for(int i = 0; i < queue.size(); i++){
            if(list.contains(queue2.peek().getName())==false){
                list.add(queue2.poll().getName());
            }
        }
        return list.toArray(new String[0]);
    }
}


