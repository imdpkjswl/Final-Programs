import java.util.HashSet;
import java.util.Iterator;

public class basicHashSet {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> Number = new HashSet<>();

        // Using addAll() method. It also used as UNION of two sets.
        Number.addAll(evenNumber); // return true on success, false on fail
        Number.add(3);
        Number.add(5);
        System.out.println("New HashSet: " + Number);


        // Remove all items of evenNumber set
        boolean isRemoved = evenNumber.removeAll(evenNumber);
        System.out.println(isRemoved);

        System.out.println(evenNumber); // show empty set


        // Remove the item from Number set
        boolean isDeleted = Number.remove(5);
        System.out.println(isDeleted);


        // Calling iterator() method
        Iterator<Integer> itr = Number.iterator();

        // Accessing elements
        while(itr.hasNext()) {
            System.out.print(itr.next()+"  ");
        }

        // Check an item is avail or not
        boolean isAvail = Number.contains(3);
        System.out.println("\n"+isAvail);
        isAvail = Number.contains(5);
        System.out.println(isAvail);


    }

}
