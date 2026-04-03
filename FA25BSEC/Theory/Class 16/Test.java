public class Test {

    A obj=new B();
    B[] obj4=new B[8];


    public static void main(String[] args) {

        A a; // cannot create instance
        A.staticMethod();
        System.out.println(A.objectCount);

        // reference in a is updated
        a =new B();
      //  System.out.println(((B)a));

        a.show();

        A.Helper obj= new A.Helper(); // inner nested class
        A.Helper.Nested obj2=new A.Helper.Nested();

        A.Helper.show();
        D d=new D();
        System.out.println(d);

        D.staticMethod();

        B objB=new B();
        B.NonStatic obj3= objB.new NonStatic();

        System.out.println(" ====================");
        A temp=new D();
        temp=new B();
        temp.show();
        temp=new C();
        temp.show();
        temp=new E();
        temp.show();

        //WhatsApp whatsApp1=new WhatsApp();
        WhatsApp whatsApp= WhatsApp.getInstance();
        WhatsApp whatsApp1 = WhatsApp.getInstance();

    }
}
