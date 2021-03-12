import controller.Bank;
import entity.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        var name= input.nextLine();

        User user = new User("LV55HABA345345",100, name, "F");
        Bank bank = new Bank ();

        bank.setActiveUser(user);
        bank.getUserBalance();

        System.out.println("Welcome to bank " + name);

        while (true) {

            System.out.println("What do you want to do " + name + " :\n" +
                    "-See the balance (press letter 'B');\n" +
                    "-Take a credit (press letter 'C');\n" +
                    "-Put money on deposit (press letter 'D');\n" +
                    "-End session (press any key).");

            var yourChoice = input.nextLine();
            yourChoice =  yourChoice.toUpperCase();

            if (yourChoice.equals("B")) {
                System.out.println("Current balance " + bank.getUserBalance() +
                        "\n");

            } else if (yourChoice.equals("C")) {
                System.out.println("How much credit do you want to take: ");
                var credit = input.nextFloat();
                System.out.println(bank.creditUser(credit) +
                        "\n Your account balance is :" + bank.getUserBalance() +
                        "\n");

                input.nextLine();

            } else if (yourChoice.equals("D")) {
                System.out.println("How much money do you want to put on deposit: ");
                var debet = input.nextFloat();
                System.out.println(bank.debetUser(debet));
                System.out.println("Your balance " + bank.getUserBalance()+
                        "\n");

                input.nextLine();

            } else {
                System.out.println("Good bye!");
                break;
            }
        }
    }
}
