import java.util.Scanner;

public class GradeAssigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 0) {
            grade = "F";
        } else {
            grade = "Invalid score";
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}
