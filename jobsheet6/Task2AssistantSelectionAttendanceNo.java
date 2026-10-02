import java.util.Scanner;

public class Task2AssistantSelectionAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the student active? (true/false): ");
        boolean isActiveStudent = sc.nextBoolean();
        System.out.print("Is the student under academic sanction? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            // Stage 1 passed: check programming requirement
            System.out.print("Enter Basic Programming grade: ");
            int grade = sc.nextInt();
            System.out.print("Does the student have a programming competency certificate? (true/false): ");
            boolean hasCertificate = sc.nextBoolean();

            if (grade >= 80 || hasCertificate) {
                // Stage 2 passed: interview
                System.out.print("Enter interview score: ");
                int interviewScore = sc.nextInt();

                if (interviewScore >= 75) {
                    System.out.println("Accepted! The student is accepted as a lab assistant");
                } else {
                    System.out.println("Failed! Interview score is below 75");
                }
            } else {
                System.out.println("Failed! Basic Programming grade is below 80 and no competency certificate");
            }
        } else if (!isActiveStudent) {
            System.out.println("Failed! The student is not active");
        } else {
            System.out.println("Failed! The student is currently under academic sanction");
        }
        sc.close();
    }
}
