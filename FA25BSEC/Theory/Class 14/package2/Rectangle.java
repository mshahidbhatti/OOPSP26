package package2;

public class Rectangle extends Shape2D{
    double width;
    double length;

    Rectangle(String name) {
        super(name);
    }

    public double calArea(){
        return length*width;
    }
    public double calPerimeter(){
        return length+width*2;
    }
}
