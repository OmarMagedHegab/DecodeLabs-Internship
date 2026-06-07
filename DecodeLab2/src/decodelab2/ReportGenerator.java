/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decodelab2;

/**
 *
 * @author engom
 */
public class ReportGenerator {
  public void printReport(int totalMark, double average, char grade){
      System.out.println("============================");
      System.out.println("STUDENT GRADE REPORT: ");
      System.out.println("============================");
      System.out.println("Total Marks: "+ totalMark);
      System.out.printf("Average: %.2f%%\n", average);
      System.out.println("Final Grade: "+ grade);
      System.out.println("============================");
  }  
}
