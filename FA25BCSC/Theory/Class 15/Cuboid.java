public class Cuboid extends Shape3D{
    private double length;
    private double width;
    private double height;

    public Cuboid(String color, double length, double width, double height) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeType() {
        return "3D Shape - Cuboid";
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + width * height + length * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }

}
