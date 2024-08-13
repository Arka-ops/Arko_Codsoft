import java.util.*;

abstract class account {
    int temp;

    void suf_bal(int a) {
        temp = a;

    }

    public void accountbalance() {
        System.out.println("your  balance is :-" + temp);

    }

    public void updatebal(int x) {
        if (temp < x) {
            System.out.println("you have  no sufficient balance");

        } else {
            if (temp - x >= 100) {
                System.out.println("you have successfully withdrawl:-" + x);
                temp = temp - x;
                System.out.println("Now your balance is"+temp);
            } else {
                System.out.println(" ........you should maintain minimum balance......... ");
                System.out.println("Available balance is:-" + temp);
                System.out.println("you maximum withdrawl amount:-" + (temp - 100));
            }
        }
    }

    public void deposit_1(int x) {
        temp = temp + x;
        System.out.println("your account has been crebited by" + x);
        System.out.println("Available balance is:-" + temp);
    }

}

class atm extends account {
    
     public void initialbal(int x) {
        super.suf_bal(x);
    }
    public void withdraw(int amount) {
        super.updatebal(amount);

    }

   
    public void checkBalance() {
        super.accountbalance();

    }

   

    public void deposit(int p) {
        super.deposit_1(p);

    }
}

public class atm_inter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin, init_bal, choice, wit, repin, n, repin1, depo, otp;
        double temps = Math.random();
        double temp1 = temps * 1000;
        int ran = (int) temp1;
        boolean con;

        System.out.println("               .......welcome to -STATE BANK OF INDIA........");
        System.out.println("Enter your account pin:-");
        pin = sc.nextInt();
        System.out.println("               ........Your account is successfully open..........");

        atm obj = new atm();
        init_bal= 1000;
        obj.initialbal(init_bal);

        System.out.println("your available balance is :-" + init_bal);
        for (int i = 1; i <= 100; i++) {
            System.out.println("Enter your pin again for security:-");
            repin = sc.nextInt();
            if (pin == repin) {
                System.out.println("Enter how many transaction you will do:-");
                n = sc.nextInt();
                for (int j = 1; j <= n; j++) {
                    System.out.print("\n1 for check balance\n2 for deposit\n3 for withdrawl\n4 for pin change\n");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            obj.checkBalance();
                            break;
                        case 2:
                            System.out.println("Enter deposit balance:-");
                            depo = sc.nextInt();
                            obj.deposit(depo);
                            break;

                        case 3:
                            System.out.print("Enter your withdrawl amount:-");
                            wit = sc.nextInt();
                            System.out.println("enter your pin:-");
                            repin1 = sc.nextInt();
                            if (pin == repin1) {
                                obj.withdraw(wit);
                            } else {
                                System.out.println(
                                        "         .......warning!!............        \nyour pin is wrong!!\n Retype your pin");
                            }
                            break;
                        case 4:
                            System.out.println(
                                    "your otp is " + ran + " dont share this with others -STATE BANK OF INDIA");
                            System.out.println("enter otp which is send to your mobile:-");
                            otp = sc.nextInt();
                            if (ran == otp) {
                                System.out.println("...otp matched...");
                                System.out.println("enter your new pin:-");
                                pin = sc.nextInt();
                                repin = pin;
                                repin1 = pin;
                                System.out.println("your pin is successfully changed -STATE  BANK OF INDIA");
                                break;
                            }
                        default:
                            System.out.println("Enter valid details");
                    }
                }
            } else {
                System.out.println(
                        "                .....warning!!.....             \nyour pin is wrong, please insert your card again");
            }
        }
    }
}
 