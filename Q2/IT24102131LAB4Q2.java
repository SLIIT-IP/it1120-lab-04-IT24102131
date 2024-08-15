import java.util.Scanner;
public class IT24102131LAB4Q2{
public static void main(String[]args)
{   /* exam marks=emarks, lab submission=labsub, exam persentage= perexam,lab persentage = perlab, final marks= fmarks*/
     double emarks,labsub,perexam,perlab,fmarks;
	 Scanner input= new Scanner(System.in);
	 System.out.print("Please enter exam marks(out of 100) :");
	 emarks=input.nextDouble();
	 if(emarks>=0 && emarks<=100)
	 {System.out.print("Please enter lab submission marks(out of 100) :");
	 labsub=input.nextDouble();
	 if (labsub>=0&&labsub<=100)
	 {System.out.print("Please enter the persentage given for the exam :");
	 perexam=input.nextDouble();
	 System.out.print("Please enter the persentage given for the lab submission :");
	 perlab=input.nextDouble();
	    if (perexam+perlab==100)
		{fmarks= ((emarks*perexam/100)+(labsub*perlab/100));
		System.out.print("Final Exam Mark is :" + fmarks);}
		else
		{System.out.print("the persentage must add up to 100.Terminating program");}
		}
		else
		{System.out.print("Invalid input for lab submission marks");}
		}
		else 
		{System.out.print("Invalid input for exam marks");}
		}
		}
		
		
	
		 
