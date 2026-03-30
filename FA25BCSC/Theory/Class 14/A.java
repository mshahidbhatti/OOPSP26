
class A {
    String s;
    public static A obj=null;
    private A(String s){
        this.s=s;
        this.obj=obj;
    }

    public static A createObject(String s){
        if(A.obj==null ) {
            System.out.println("second instance");
            return new A(s);
        }
        else
            return A.obj;
    }
}

// Singleton class
