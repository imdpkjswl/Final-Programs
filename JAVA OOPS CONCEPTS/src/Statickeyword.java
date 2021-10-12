public class Statickeyword {
    // Class(static) variable
    static String var1 = "dj";
    static String var2;

    //Static class
    static class MyNestedClass {
        //non-static method
        public void disp() {

            /* If you make the str variable of outer class
             * non-static then you will get compilation error
             * because: a nested static class cannot access non-
             * static members of the outer class.
             */
            System.out.println("Static class method called!!!");
        }
    }

    //First Static block
    static{
        System.out.println("Static Block 1");
        var2 = "Block1";
    }
    //Second static block
    static{
        System.out.println("Static Block 2");
        var2 = "Block2";
    }


    // This is a static method
    static void myMethod() {
        System.out.println("Static myMethod");
        System.out.println("static variable: "+var1+" and "+var2);
    }

    public static void main(String[] args) {
        /* You can see that we are calling this method without
            creating any object.  */
        myMethod();

        /* To create instance of nested class we didn't need the outer
         * class instance but for a regular nested class you would need
         * to create an instance of outer class first
         */
        Statickeyword.MyNestedClass obj = new MyNestedClass();
        obj.disp();

    }
}
