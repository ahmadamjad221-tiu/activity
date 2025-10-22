package WatchActivity;

import java.util.Scanner;

public class WatchMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Use correct class name: Watch (capital W)
        Watch T1 = new Watch();
        Watch T2 = new Watch(12, 3);
        Watch T3 = new Watch(12, 10, 2);
        Watch T4 = new Watch(12);

        System.out.println("The times:");
        T1.display();
        T2.display();
        T3.display();
        T4.display();

        System.out.println("\nDo you want to update the time for the second clock (T2)? yes/no");
        String ans = scan.next();

        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("Enter the new time (hour minute second):");
            int hour = scan.nextInt();
            int minute = scan.nextInt();
            int second = scan.nextInt();

            // Update only T2
            T2.setHour(hour);
            T2.setMinute(minute);
            T2.setSecond(second);

            System.out.println("The updated time for T2 is:");
            T2.display();
        } else {
            System.out.println("No changes made.");
        }

        scan.close();
    }
}
