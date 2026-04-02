public abstract class Shape3D extends Shape{

    public Shape3D(String color) {
        super(color);
    }

    public abstract double surfaceArea();
    public abstract double volume();
}
