import java.util.LinkedList;
import java.util.Queue;

public class ProgramQueue {
    private static Queue<Programa> queue = new LinkedList<Programa>();

    public static void addProgram(Programa programa){
        queue.add(programa);
        //InstanceBlocks(programa,blocksToInstance(programa));
        System.out.println("El programa ha sido agregado");
    }

    public static boolean isFull(){
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

public static void removeFromQueue(){
        queue.poll();
    }
}


