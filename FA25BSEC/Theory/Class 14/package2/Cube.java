package package2;

public class Cube extends Shape3D{

    double side;

    Cube(String name) {
        super(name);
    }


    public double volume(){
        return Math.pow(side,3);
    }

}
