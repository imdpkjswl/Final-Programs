import java.util.HashMap;
import java.util.Map;

class basicHashMap {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<Integer, String> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // Add elements to a HashMap
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");

        // Access HashMap Elements, return null if not avail
        String value = numbers.get(3);
        System.out.println(value);
        System.out.println("HashMap after put(): " + numbers);

        // Different views of map
        System.out.println("View of keys:  "+numbers.keySet());
        System.out.println("View of values:  "+numbers.values());
        System.out.println("View of key/value pairs:  "+numbers.entrySet());

        //Change HashMap Value using key
        numbers.replace(3, "THREE");
        System.out.println(numbers);

        //Remove HashMap Elements
        // removing element associated with key 3
        String val = numbers.remove(3);
        System.out.println("Removed value: " + val);
        System.out.println(numbers);


        System.out.println("/** Iterate through a HashMap */");

        // iterate through keys only
        System.out.print("Keys: ");
        for (Integer key : numbers.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (String values : numbers.values()) {
            System.out.print(values);
            System.out.print(", ");
        }

        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }


        System.out.println("\n\nCloning HashMap from Other Maps:");
        // clone numbers hashmap
        HashMap<String, Integer> cloneNumbers = (HashMap<String, Integer>)numbers.clone();
        cloneNumbers.put("Three", 3);
        System.out.println("HashMap: " + cloneNumbers);


    }
}
