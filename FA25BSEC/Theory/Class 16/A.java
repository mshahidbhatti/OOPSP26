public abstract class A {
    protected int valueA=10;
    static public int objectCount=0;

    A(){
        objectCount++;
    }
    void show(){
        System.out.println("Value in valueA :"+valueA);
    }

    void show(int x){
        System.out.println("Value in x :"+x);
    }

    static int getObjectCount(){
        return objectCount;
    }

    public abstract void display();


    public final void finalMethod(){

    }

    private void privateMethod(){

    }

    public static void staticMethod(){
        System.out.println("Static method of A");

    }

    public static class Helper{
        public static void show(){
            System.out.println("Show method of static inner class");
        }

        public static class Nested{

        }
    }

    class NonStaticHelper{
        int a;
    }



}
