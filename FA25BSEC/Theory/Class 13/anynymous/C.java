package anynymous;

public class C extends B{
    int c=20;
    C(int a, int b, int c){
        super(a,b);
        this.c=c;

    }

    @Override
    public void display(){
        super.display();
        System.out.println("Value in C"+c);
    }


}
