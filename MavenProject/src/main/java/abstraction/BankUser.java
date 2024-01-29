package abstraction;

import java.util.Scanner;

class BankUser extends Bank {
    // Implementation of setPin method
    @Override
    public void setPin()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        pin = scanner.nextInt();
    }

    // Implementation of validatePin method
    @Override
    public boolean validatePin() {
        for (int validPin : VALID_PINS) {
            if (pin == validPin) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // Create an instance of BankUser
        BankUser bankUser = new BankUser();

        // Set and validate PIN
        bankUser.setPin();

        if (bankUser.validatePin()) {
            System.out.println("PIN set successfully!");
        } else {
            System.out.println("Invalid PIN. Please use a valid PIN.");
        }
    }
}