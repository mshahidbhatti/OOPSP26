public class Demo {
    public static void main(String[] args) {

        ///
        Shape2D c = new Circle("Red", 5);
        Shape2D c2 = new Circle("Red", 6);
        Shape2D r = new Rectangle("Blue", 4, 6);
        Shape2D t = new Triangle("Green", 3, 4, 5, 4);

        Shape3D s = new Sphere("Yellow", 3);
        Shape3D cb = new Cuboid("Black", 2, 3, 4);

        Shape [] shapes={cb,r,t,c,s,c2};


//        for(Shape tempShape: shapes)
//            if(tempShape instanceof Shape2D)
//                System.out.println(((Shape2D)tempShape).area());

//        for(Shape shapeTemp: shapes)
//            if(shapeTemp instanceof Shape3D)
//                System.out.println(((Shape3D)shapeTemp).volume());
        for(Shape shapeTemp: shapes)
            if(shapeTemp instanceof Circle)
                System.out.println(((Circle)shapeTemp).getRadius());


//
//        System.out.println(c.getShapeType());
//        c.displayColor();
//        System.out.println("Area: " + c.area());
//        System.out.println("Perimeter: " + c.perimeter());
//
//        System.out.println();
//
//        System.out.println(r.getShapeType());
//        r.displayColor();
//        System.out.println("Area: " + r.area());
//        System.out.println("Perimeter: " + r.perimeter());
//
//        System.out.println();
//
//        System.out.println(t.getShapeType());
//        t.displayColor();
//        System.out.println("Area: " + t.area());
//        System.out.println("Perimeter: " + t.perimeter());
//
//        System.out.println();
//
//        System.out.println(s.getShapeType());
//        s.displayColor();
//        System.out.println("Surface Area: " + s.surfaceArea());
//        System.out.println("Volume: " + s.volume());
//
//        System.out.println();
//
//        System.out.println(cb.getShapeType());
//        cb.displayColor();
//        System.out.println("Surface Area: " + cb.surfaceArea());
//        System.out.println("Volume: " + cb.volume());

    }
}
