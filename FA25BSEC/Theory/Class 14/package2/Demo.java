package package2;

public class Demo {
    public static void main(String[] args) {
        Shape2D temp2d=new Circle("");
        Circle c1=new Circle("");
        Shape s=new Circle("");


//        Shape shape1=new Shape();
//        Shape shape2=new Shape();
       Shape shapes[]=new Shape[10];
       Rectangle rectangles[]=new Rectangle[10];
       Circle circles[]=new Circle[10];

//        for(Shape shape:shapes)
//            System.out.println(shape);
//
//        for(Circle circle:circles)
//            System.out.println(circle);

        // suppertype can hold reference of child type
        Shape[] shapes2=new Shape[30];

        for(int i=0;i<10;i++)
            shapes2[i]=new Circle("Circle"); // upcasting is implicit
        for(int i=10;i<20;i++)
            shapes2[i]=new Rectangle("Rectangle");
        for(int i=20;i<30;i++)
            shapes2[i]=new Cube("Cube");


      //  shapes2[0]=new A();


       // Shape2D temp2D= new Circle();

        //Shape2D temp3=(Student)new Demo();


//        System.out.println();
//        for(Shape temp: shapes2)
//            temp.displayInfo();




//        int counter=0;
//        for(Shape temp: shapes2)
//            if(temp instanceof Circle)
//                counter++;
//        System.out.println(counter);

        System.out.println();
        for(Shape temp: shapes2)
            if(temp instanceof  Circle)
             ((Circle) temp).radius=1;

        System.out.println();
        for(Shape temp: shapes2)
            if(temp instanceof  Circle) {
             //   temp.displayInfo();
                ((Circle) temp).setRadius(((Circle) temp).getRadius()+12);
            }

        // reference of child class is assigned to parent class
        // reference 










    }
}
