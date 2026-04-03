public class B extends A{
    public int valueB=5;
    // static int objectCount=2;

    B(){
        System.out.println("Constructor of B");
    }

    @Override
    public void display() {
        System.out.println(" Value in valueA :"+valueA);
        System.out.println(" Value in valueB :"+valueB);
    }

    @Override
    void show(){
        System.out.println("Show of class B");
    }
    public void compare(){
        System.out.println("Compare method of B");
    }

    public static void staticMethod(){
        System.out.println("static method of B");
    }



    public class NonStatic{

    }



}
