package package2;

public class Circle extends Shape2D{
    double radius;

    Circle(String name) {
        super(name);
    }

    public double calArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double calCircumference(){
        return 2* Math.PI*radius;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Radius :"+radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
