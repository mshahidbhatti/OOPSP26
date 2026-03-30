package anynymous;

public class D extends B{
    int d=20;

    D(int a, int b, int d)
    {
        super(a,b);
        this.d=d;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Vaue in D "+d);
    }

}
