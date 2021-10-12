/**
 * Here, GrandFather and Father are in SINGLE inheritance.
 * Father, Son and Daughter are in Hierarchy inheritance.
 * Combination of all these above are in Hybrid Inheritance.
 */
class GrandFather{
    void speakHindi(){System.out.println("Hindi speaking...");}
}
class Father extends GrandFather{
    void speakEnglish(){System.out.println("English speaking...");}
}

class Son extends Father{
    void speakKannada(){System.out.println("Kannada speaking...");}
}

class Daughter extends Father{
    void speakTelugu(){System.out.println("Telugu speaking...");}
}

class HybridInheritance {
    public static void main(String args[]){
        System.out.println("Daughter can speak:");
    Daughter s1 = new Daughter();
    s1.speakHindi();
    s1.speakEnglish();
    s1.speakTelugu();

        System.out.println("\n\nSon can speak:");
    Son s2 = new Son();
    s2.speakHindi();
    s2.speakEnglish();
    s2.speakKannada();

    }
}

