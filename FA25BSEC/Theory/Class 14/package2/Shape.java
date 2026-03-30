package package2;

public class Shape {
    protected String name;
    Shape(String name){
        this.name=name;
    }

    // restiricted private
    // less restricted default
    // less restricted protected (within package+outside package if inheritenace exists
    //)
    // least restricted public



    public void displayInfo(){
        System.out.println("Name "+name);
    }
}
