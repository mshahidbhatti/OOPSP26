public class PrintFTest {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int i=0;
        byte b=0;
        short s=0;
        long l=0;


        float f=100.0f;
        double d=100.0;

        char c='c';

        boolean binary=true;

        // byte, short, long , int
        System.out.printf("%03d", i);

        System.out.printf("%,10.2f",f);


    }


    public static void printSomething(String text){
        System.out.println(text);

    }
}
