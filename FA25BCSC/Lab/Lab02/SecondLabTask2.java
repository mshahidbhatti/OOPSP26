public class SecondLabTask2{

	// System.out.println();
	// System.out.print();
	// System.out.printf(); // formated printer
	
	public static void main(String args[]){
	
	//String name="Shahid";

	System.out.println("Print demonstration example.");
	System.out.println(); // print empty row
	//System.out.println("Name :"+name); // print empty row
	System.out.print("Print demonstration example.");

	int a=100;
	byte b=20;
	short s=30;
	long l=400;

	double d=30000.0;
	float f=10000.0f;

	char c='c';
	boolean flag=true;

	System.out.println("===============");
	System.out.printf("Value in int %d\n", a);
	System.out.printf("Value in byte %d\n", b);
	System.out.printf("Value in short %d\n", s);
	System.out.printf("Value in long %d\n", l);

	System.out.printf("Value in double %,.2f\n", d);
	System.out.printf("Value in float %,.3f\n", f);


	System.out.printf("Value in char %c\n", c);
	System.out.printf("Value in boolean %b\n", flag);


	System.out.println("String formater");

	int id=1;
	String name="Wireless Keyboard";
	double price = 500.0;
	int qty=2;

	System.out.printf("%-5s %-10s %7s %3s \n", "ID","Name","Price","Qty");
	System.out.printf("%-30s \n", "-".repeat(20));
	for(int i=0;i<10;i++)
	System.out.printf("%04d %10s   %,8.2f %d \n",id++,name.substring(0,10),price*i,qty);







	}





}