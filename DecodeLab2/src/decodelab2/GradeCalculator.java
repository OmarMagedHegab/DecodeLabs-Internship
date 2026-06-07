/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decodelab2;

/**
 *
 * @author engom
 */
public class GradeCalculator {
   public int calculateTotal(int[] marks){
       int sum=0;
       for(int i=0;i<marks.length;i++){
           sum+= marks[i];
       }
       return sum;
   } 
   public double calculateAverage(int totalMarks, int[] marks){
       if(marks.length==0)
           return 0.0;
       double average= (double)totalMarks/marks.length;
       return average;
   }
   public char determineGrade(double average){
       if(average>= 90)
           return 'A';
       else if (average>= 80)
           return 'B';
       else if (average>= 70)
           return 'C';
       else if (average>=60)
           return 'D';
       else
           return 'F';                
   }
}
