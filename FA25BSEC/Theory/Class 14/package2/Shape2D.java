package package2;

public class Shape2D extends Shape{
    int x;
    int y;

    Shape2D(String name) {
        super(name);
    }

//    public double calArea(){
//        return 0;
//    }

    // overriding

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("X "+x);
        System.out.println("Y"+y);
    }

}
