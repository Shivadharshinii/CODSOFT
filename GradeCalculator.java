import java.util.Scanner;
public class GradeCalculator{
      public static void main(String[] args)
      {
      float[] marks = new float[8];
      float sum=0, avg;
      int i;
      Scanner scan = new Scanner(System.in);
       System.out.print("Enter Marks Obtained in 8 Subjects: ");
       for(i=0; i<8; i++)
         marks[i] = scan.nextFloat();
       for(i=0; i<8; i++)
       sum = sum + marks[i];
       avg = sum/8;
       System.out.print("\nGrade = ");
      if(avg>=94)
         System.out.println("A");
      else if(avg>=90 && avg<94)
         System.out.println("A-");
      else if(avg>=87 && avg<90)
         System.out.println("B+");
      else if(avg>=83 && avg<87)
         System.out.println("B");
      else if(avg>=80 && avg<83)
         System.out.println("B-");
      else if(avg>=77 && avg<80)
         System.out.println("C+");
      else if(avg>=73 && avg<77)
         System.out.println("C");
      else if(avg>=70 && avg<73)
         System.out.println("C-");
      else if(avg>=67 && avg<70)
         System.out.println("D+");
      else if(avg>=63 && avg<67)
         System.out.println("D");
      else if(avg>=60 && avg<63)
         System.out.println("D-");
      else
         System.out.println("F");
   }
}
//alternate
import java.util.Scanner;
public class GradeCalculator {
public static void main(String[]args){
   float avg;
	float total;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the cloudcomputing mark:");
	int a=sc.nextInt();
	System.out.println("Enter the web programming mark:");
	int b=sc.nextInt();
	System.out.println("Enter the english mark:");
	int c=sc.nextInt();
	System.out.println("Enter the computerarchitecture mark:");
	int d=sc.nextInt();
	System.out.println("Enter the java programming mark:");
	int e=sc.nextInt();
	System.out.println("Enter the DBMS mark:");
	int f=sc.nextInt();
	total=a+b+c+d+e+f;
	System.out.println("Total:"+total);
	avg=total/6;
	System.out.println("Average mark:"+String.format("%.2f",avg));
	if(avg>90)
		System.out.println("Grade:O");
    else if(avg>80&&avg<=90)
    	System.out.println("Grade:A+");
    else if(avg>70&&avg<=80)
    	System.out.println("Grade:A");
    else if(avg>60&&avg<=70)
    	System.out.println("Grade:B+");
    else 
    	System.out.println("Grade:B");
}
}
