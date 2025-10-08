import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class PracticeDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList numbers = new ArrayList();
        String userResponse;

        do {
            System.out.print("Enter an integer value: ");
            int value = sc.nextInt();
            numbers.add(value);
            
            // Clear the buffer
            sc.nextLine(); 

            System.out.print("Do you want to continue? (yes/no): ");
            userResponse = sc.nextLine().trim().toLowerCase();
        } while (!userResponse.equals("no"));

        TreeSet ts=new TreeSet(numbers);

        System.out.println("You entered: " + ts);
        sc.close();
    }
}
