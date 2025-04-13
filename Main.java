import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int userNumber;
        int computerNumber;
        int choice;
        boolean isHeads;

        System.out.println("""
                Which game would you like to play?\n
                Press 1 for number war\n
                Press 2 to flip a coin
                """);
        choice = sc.nextInt();
        isHeads = random.nextBoolean();
        if (choice==1) {
        computerNumber = random.nextInt(1,10+1);
        System.out.print("Enter your desired number (1-10): ");
        userNumber = sc.nextInt();

        if(userNumber < 1 || userNumber > 10) {
            System.out.println("Please enter a valid number.");
        }
        else {
            if (userNumber == computerNumber) {
                System.out.println("You chose "+userNumber+" and the computer chose "+computerNumber);
                System.out.println("Draw.");
            }
            else if(userNumber > computerNumber) {
                System.out.println("Your number was "+userNumber+" and the computer's number was "+computerNumber);
                System.out.println("You won!");
            }
            else {
                System.out.println("Your number was "+userNumber+" and the computer's number was "+computerNumber);
                System.out.println("You lost.");
            }

        }
        }
        else if(choice < 1 || choice > 2) {
            System.out.println("Please enter a valid choice.");
        }
        else {
            if(isHeads) {
                System.out.println("The coin landed on Heads!");
            }
            else {
                System.out.println("The coin landed on Tails!");
            }
        }
        sc.close();
    }
}