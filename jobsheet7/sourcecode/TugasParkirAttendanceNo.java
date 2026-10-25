import java.util.Scanner;

public class TugasParkirAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = 0, duration = 0, total = 0;

        do {
            System.out.print("Enter vehicle type (1 = Car, 2 = Motorcycle, 0 = Exit): ");
            type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter duration (hours): ");
                duration = sc.nextInt();

                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            }
        } while (type != 0);

        System.out.println("Total parking fee: Rp " + total);
    }
}
