import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take marks obtained in each subject (out of 100)
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            
            // Validate input for individual subject marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input for marks. Marks should be between 0 and 100.");
                return; // Exit the program
            }
            
            totalMarks += marks;
            
        }
        
        // Calculate Total Marks
        System.out.println("Total Marks: " + totalMarks);
        
        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        System.out.println("Average Percentage: " + averagePercentage + "%");
        
        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " +grade);
        
    }
}