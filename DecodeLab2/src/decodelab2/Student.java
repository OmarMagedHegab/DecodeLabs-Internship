/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decodelab2;
import java.util.*;
/**
 *
 * @author engom
 */
public class Student {
private int[] marks;

    public Student(int subjects) {
        this.marks = new int[subjects];
    }


public void collectMarks(){
    Scanner scan= new Scanner(System.in);
    int mark=0;
    for(int i=0;i<marks.length;i++){
        System.out.println("Enter the mark of subject "+ (i+1)+":");
        try{
            mark= scan.nextInt();      
        }catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter a whole number");
                scan.nextLine();
                i--;
                continue;
        }
        if(mark<0 || mark>100){
            System.out.println("Please enter a mark between 0 and 100!");
            scan.nextLine();
            i--;
            continue;     
        }
        else{
            marks[i]=mark;
        }
    }
}
    public int[] getMarks() {
        return marks;
    }
 
}
