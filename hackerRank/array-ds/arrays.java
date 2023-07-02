import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

/*
 * Reverse array class
 */


public class arrays {

    /*
     * Reverse operation without changing the original content.
     * @param array
     */
    public static List<Integer> reverseArray(List<Integer> array) {
        
        // create array for make update
        List<Integer> reverse = array;
        
        Collections.reverse(reverse);

        return reverse;
    }


    /*
     * Print all elements of a generic ArrayList.
     * @param array
     */
    public static <T> void printArrayList(List<T> array){
        Iterator<T> iterator = array.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " "); 
        
        System.out.print("\n");
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int sizeArray = sc.nextInt();
        List<Integer> initialArray = new ArrayList<>(sizeArray);
        
        // populate initialList
        for(int i = 0; i < sizeArray; i++){
            initialArray.add(sc.nextInt());
        }
        
        List<Integer> reverseArray = reverseArray(initialArray);

        printArrayList(reverseArray);

    }
}
