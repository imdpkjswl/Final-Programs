class House {
    // State of class
    String address = "Bangalore";
    String color = "White";
    double pin = 560064;

    // Behaviour of class
    void openDoor() {
        System.out.println("Open door");
        //Write code here
    }

    void closeDoor() {
        System.out.println("Close door");
        //Write code here
    }

}

public class ObjectAndClass {
    public static void main(String[] args) {
        // Create an instance of House class
        House object = new House();

        object.openDoor();
        object.closeDoor();
    }
}
