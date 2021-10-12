class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void studentDetail(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student ob = new Student(10, "Deepak");
        ob.studentDetail();
    }
}
