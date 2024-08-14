import java.util.Scanner;
public class IT24102131LAB4Q2
{   public static void main(String[]args);
   {   Scanner input = new Scanner(System.in);
     double exam_marks;
      double labsub_mark;
        double Final_marks;
    double per_lab;
        double per_exam;  
     System.out.print("Please enter exam marks(out of 100)");
     exam_marks= input.nextDouble();
     if (exam_marks>=0 && exam_marks<= 100)
      {System.out.print("Please enter lab submission marks");
       labsub_mark=input.nextDouble();}
       if   (labsub_mark>=0 && labsub_mark<=100)
            {System.out.print("Please enter the percentage given for exam");
            per_exam= input.nextDouble();
            System.out.print("Please enter the percentage given for lab");
            per_lab= input.nextDouble();}
           if (per_exam + per_lab == 100)
             
           { Final_marks= ((exam_marks*per_exam+ labsub_mark * per_lab)/2);
            System.out.print("Final Exam Mark is :"+ Final_marks);}
           else
       {the persentage must add up to 100. Terminating program.}
         else
        {System.out.print("Invalid input for lab marks.Terminating program.");}
        else
     {System.out.print("Invalid input for exam marks.Terminating program.");}

      }
}
 

       


     
    
