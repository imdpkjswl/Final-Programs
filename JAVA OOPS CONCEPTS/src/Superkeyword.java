/**
 * Use super keyword in case of method overriding.
 * Parameterized super() call to invoke parameterized constructor of parent class.
 */
class Parentclass {
    //no-arg constructor - it called when super keyword to used in child class
    Parentclass(){
        System.out.println("no-arg constructor of parent class");
    }
    //arg or parameterized constructor
    Parentclass(String str){
        System.out.println("parameterized constructor of parent class");
    }

    void display(){
        System.out.println("Parent Method");
    }
}


class Superkeyword extends Parentclass {
    Superkeyword(){
        super("Hahaha");
        System.out.println("Constructor of child class");
    }
    void display(){
        super.display();
        System.out.println("Overridden Parent Method");
    }

    public static void main(String args[]){

        Superkeyword obj= new Superkeyword();
        obj.display();
    }
}

/*
Output:
parameterized constructor of parent class
Constructor of child class
Hello
 */



