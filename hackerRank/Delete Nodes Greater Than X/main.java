import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static <T> List<Integer> removeNodes(List<Integer> list, int intRemove) {
        List<Integer> elementsToRemove = new ArrayList<>();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            Integer element = iterator.next();
            if(element > intRemove){
                elementsToRemove.add(element);
            }
        }

        list.removeAll(elementsToRemove);
        return list;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new LinkedList<>();
        int sizeList = sc.nextInt();

        for(int i = 0; i < sizeList; i++){
            list.add(sc.nextInt());
        }

        
        removeNodes(list, sc.nextInt());
    
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);

        }    
    }

}
