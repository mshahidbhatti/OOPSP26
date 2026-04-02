public class Sphere extends Shape3D{
    private double radius;
    public Sphere(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getShapeType() {
        return "3D Shape - Sphere";
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

}
