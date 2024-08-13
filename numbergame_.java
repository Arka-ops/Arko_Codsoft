import java.util.*;
import java.lang.Math;


public class numbergame_{

    public static void main(String[] args) {
        int c, s = 100,b1=0;
        Scanner sc = new Scanner(System.in);
        double a = Math.random();
        double k = a * 100;
        int b = (int) k;
        System.out.println("Enter your choice\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("How many attempts do you wants to guess the number\n");
                int attempts = sc.nextInt();

                for (int i = 1; i <=attempts; i++) {
                    System.out.println("Enter your preferable number in between 1 to 100\n");
                    c = sc.nextInt();
                    if (b == c) {
                        System.out.print("Congrats! you choose the  correct number" );
                        b1=c;

                        break;
                    
                    }
                    else if (b > c) {
                        System.out.print("The guessed number is too low\n");
                    }
                    else if (b < c) {
                        System.out.println("The guessed number is too high\n");

                    }
                    
                    s = s - 5;
                    System.out.print("Try another attempt\n");
                }
              if(b==b1){
                  System.out.println("Your score is:"+s);
              }
              else{
                        System.out.println("Sorry,you can't score anything");
                    }
                   
               

                break;
            	case 2:
                int j = 0, p = 100;
                while (1 > 0) {
                    System.out.println("Enter your preferable number in between 1 to 100\n" );
                    c = sc.nextInt();

                    // p=p-2;
                    if (b == c) {
                        System.out.println("Congrats! you give the  correct number and your score is: \n"+p);
                        break;
                    
                    }
                    else if (b > c) {
                        System.out.print("The guessed number is too low\n");
                    }
                    else if (b < c) {
                        System.out.println("The guessed number is too high\n");

                    }
                    else{
                        System.out.println("Sorry,you can't score anything");
                    }
                    p = p - 2;
                }
                break;
                

        }
    }
    }
