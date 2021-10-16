//Both the classes represent two separate entities.

class Car{
    String carName;
    int carId;
    Car(String cname, int cid) {
        this.carName = cname;
        this.carId = cid;
    }
}
class Driver extends Car{
    String driverName;
    Driver(String name, String cname, int cid){
        super(cname, cid); // super keyword refers to the objects of immediate parent class
        this.driverName=name;
    }
}

class Association {
    public static void main(String[] args) {
        Driver obj = new Driver("Ramesh", "Maruti", 1234);
        System.out.println(obj.driverName+" is driver of " +
                ""+obj.carName+" car Id: "+obj.carId);
    }
}
