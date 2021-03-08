import java.util.HashSet;

public class unionOperation {
    public static void main(String[] args) {
        HashSet<Integer> number1 = new HashSet<>();
        number1.add(2);
        number1.add(4);
        number1.add(3);
        System.out.println("HashSet1: " + number1);

        HashSet<Integer> number2 = new HashSet<>();
        number2.add(1);
        number2.add(3);
        number2.add(5);
        System.out.println("HashSet2: " + number2);

        System.out.print("Union of " + number1 + " and " + number2 + " is:  ");
        // Union of two set
        number1.addAll(number2);
        System.out.println(number1);

    }
}
