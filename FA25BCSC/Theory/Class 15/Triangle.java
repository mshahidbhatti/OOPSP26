class Triangle extends Shape2D {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(String color, double base, double height, double side1, double side2) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String getShapeType() {
        return "2D Shape - Triangle";
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return base + side1 + side2;
    }
}
