public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
    // concrete function

    public abstract String getShapeType();
}
