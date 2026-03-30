package anynymous;

public class B extends A{
    int b=15;
    B(int a, int b){
        super(a);
        this.b=b;
    }

    public void display(){
        super.display();
        System.out.println("Value in B "+b);
    }

}
