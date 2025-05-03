package com.cognizant;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
  public static void main(String[] args) {
    /* Declare an array to store the grades of 10 students: */
    float[] grades = new float[10];
    
    /* Initialize a Scanner object to allow the user to input grades: */
    Scanner sc = new Scanner(System.in);
    
    /* Prompt the user for grades using the Scanner object and store them in the array: */
    System.out.println("WELCOME TO YOUR GRADING MANAGEMENT SYSTEM!\n");
    System.out.println("Please enter students' grades on a scale from 0 to 100 (decimals are allowed):");
    int idx = 0;
    while (idx<10) {
      System.out.print("Student #" + (idx+1) + ": ");
      float grade = sc.nextFloat();
      if (grade<0 || grade>100) {
        System.out.println("\n***** PLEASE ENTER A VALID GRADE *****\n");
        continue;
      }
      grades[idx] = grade;
      idx++;
    }
    System.out.println("\nThank you! Based on the data provided...\n");
    
    /* Calculate and print the average grade: */
    /* Find and print the highest and lowest grades: */
    float sum = 0;
    float max = -1;
    float min = -1;
    for (float e : grades) {
      max = max==-1? e : e>max? e : max;
      min = min==-1? e : e<min? e : min;
      sum+= e;
    }
    float average = Math.round(sum / grades.length);
    System.out.println("The average grade is: " + String.format("%.2f", average));
    System.out.println("The lowest grade is: " + min);
    System.out.println("The highest grade is: " + max);
    
    /* Display all the grades: */
    System.out.println("\nHere are all the grades entered:\n" + Arrays.toString(grades));
    
    
    
    
    
  }
}
