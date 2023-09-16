import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class leftRotation{
    
    public static <T> void oneRotation(Queue<T> queue){
        queue.add(queue.peek());
        queue.poll();
    }


    public static <T> void printArrayList(Queue<T> queue){
        Iterator<T> iterator = queue.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " "); 
        
        System.out.print("\n");
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queue<Integer> queue = new LinkedList<Integer>();

        int sizeArray = sc.nextInt();
        int numberRotations = sc.nextInt();

        // populate queue
        for(int i = 0; i < sizeArray; i++)
            queue.add(sc.nextInt());

        // rotate queue
        for(int i = 0; i < numberRotations; i++)
            oneRotation(queue);

        printArrayList(queue);
        
    }
}