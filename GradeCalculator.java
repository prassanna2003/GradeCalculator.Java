import java.util.Scanner;

public class GradeCalculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected capitalization
        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Please enter a valid number of subjects.");
            return;
        }

        int totalObtainedMarks = 0; // More descriptive variable name
        int maxMarksPerSubject = 100;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > maxMarksPerSubject) { // Use a while loop for input validation
                System.out.println("Marks should be in the range of 0 to 100. Please enter valid marks: ");
                marks = sc.nextInt();
            }

            totalObtainedMarks += marks;
        }

        double averagePercentage = (double) totalObtainedMarks / (numSubjects * maxMarksPerSubject) * 100;
        System.out.println("Total Marks: " + totalObtainedMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
    }

    
}
