package com.capgemini.sfdc;
import java.util.Scanner;

public class STUDENT_PROJECT {
		public static void main(String[]args)
		{
			
			
			System.out.print("Enter Number of Marks");
			System.out.println("\t"+"Enter Your Name");
			
			Scanner mar=new Scanner(System.in);
			int marks=mar.nextInt();
			
			String STUDENTNAME=mar.nextLine();
			if(marks>=90)
			{
				System.out.println("EXCELLENT MARKS,CONGRACTULATION"+STUDENTNAME+" YOUR MY STUIDENT");
			}
			else if(marks>=50)
			{
				System.out.println("GOOD MARKS,CONGRACTULATION"+STUDENTNAME+" TRY TO IMPROVE YOUR MARKS");
			}
			else
			{
				System.out.println("Don't woory my student,you Do not be embarrassed by your MARKS, learn from them and start again"+STUDENTNAME);
			}
		}
}
