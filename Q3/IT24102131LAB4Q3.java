import java.util.Scanner;
public class IT24102131LAB4Q3{
public static void main(String[]args){
     int num;
	 Scanner input=new Scanner(System.in);
	 System.out.print("enter a number :");
	 num= input.nextInt();
	 String res = (num==0)? "number is zero" :(num>0)?"number is positive" : "number is negative ";
	 System.out.print(res);
	 
}
}	 