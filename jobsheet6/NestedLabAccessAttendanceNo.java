import java.util.Scanner;

public class NestedLabAccessAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;

        System.out.print("Is the student active? (true/false): ");
        isActiveStudent = sc.nextBoolean();
        System.out.print("Is the student currently sanctioned? (true/false): ");
        isSanctioned = sc.nextBoolean();
        System.out.print("Does the student have lecturer permission? (true/false): ");
        hasLecturerPermit = sc.nextBoolean();
        System.out.print("Is the student a lab assistant? (true/false): ");
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirement");
        }
        sc.close();
    }
}
