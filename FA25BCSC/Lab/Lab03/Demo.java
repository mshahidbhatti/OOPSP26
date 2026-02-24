import java.util.Scanner;

public class Demo{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		String name="";
		//name= sc.next();  // reads single word without any space

		//System.out.print("Enter Name:");
		//name=sc.nextLine(); // reads characters untill enter is pressed

		
		//double cgpa=sc.nextDouble(); //reads double from keyboard


		//int count = sc.nextInt();

		System.out.print("Enter Name:");
		name = sc.nextLine();


		sc.next().charAt(0);

		Student st1=new Student(name);

		System.out.println(st1);
	}

}