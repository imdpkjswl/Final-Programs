class Student1{
    int id;
    String name;
    String gender;

    Student1(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student1(int id, String name, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    void studentBasicDetail(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
    }

    void studentFullDetail(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
    }
}

public class ConstructorOverLoading {
    public static void main(String[] args) {
        Student1 ob1 = new Student1(10, "Deepak");
        Student1 ob2 = new Student1(10,"Jaiswal", "Male");

        System.out.println("Basic details are:");
        ob1.studentBasicDetail();

        System.out.println("\nFull details are:");
        ob2.studentFullDetail();

    }
}



