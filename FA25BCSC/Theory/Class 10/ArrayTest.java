public class ArrayTest {
    public static void main(String[] args) {
        int a[]; // array decalaration
        a=new int[40]; // inititialation

        double d[]=new double[100];

        System.out.println(d.length);
//        for(int i=0;i<d.length;i++)
//            System.out.println(d[i]);

        int[] arra1, array2, array3=new int[3];
        arra1=new int[4];
        array2=new int[6];
        int c,f[],e;

        int temp[]={1,2,3,4,5,5};


        char ch[]=new char[435243];

        Temp temp1[]=new Temp[20];
//        Temp obj=new Temp();
//        temp1[0]=new Temp();
        temp1[1]=new Temp(1);
        for(int i=0;i<temp1.length;i++)
            temp1[i]=new Temp(i);

        System.out.println(temp1[4]);
        System.out.println(temp1[5]);

        if(temp1[6].equals(temp1[7]))
            System.out.println("equal");
        else
            System.out.println("Not equal");









    }
}

class Temp{
    int data;
    Temp(int data){
        this.data=data;
    }

    public boolean equals(Temp o){

        return this.data==o.data?true:false;
    }
    @Override
    public String toString() {
        return ""+data;
    }
}
