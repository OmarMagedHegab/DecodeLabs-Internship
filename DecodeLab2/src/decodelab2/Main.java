package decodelab2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num=0;
        while(true){
        System.out.println("Enter the number of subjects: ");
        try{
             num= scan.nextInt();
             break;
        }catch(InputMismatchException e){
            System.out.println("Please enter a whole number!");
            scan.nextLine();
        }
        }
        Student student = new Student(num);
        student.collectMarks();

        GradeCalculator calc = new GradeCalculator();
        
        
        int finalTotal = calc.calculateTotal(student.getMarks());
        double finalAverage = calc.calculateAverage(finalTotal, student.getMarks());
        char finalGrade = calc.determineGrade(finalAverage);

        ReportGenerator report = new ReportGenerator();
        report.printReport(finalTotal, finalAverage, finalGrade);
    }
}