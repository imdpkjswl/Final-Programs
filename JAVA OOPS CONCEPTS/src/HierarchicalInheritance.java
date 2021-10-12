class Animalss{
    void eat(){System.out.println("eating...");}
}
class Dogss extends Animalss{
    void bark(){System.out.println("barking...");}
}

class Cat extends Animalss{
    void meow(){System.out.println("meowing...");}
}

class HierarchicalInheritance {
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
        //c.bark();//C.T.Error
    }
}
