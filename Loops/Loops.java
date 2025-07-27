import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // input from user
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // print "Hello World" 10 times using while loop
        int count1 = 0;
        while (count1 < 10) {
            System.out.println("Hello World");
            count1++;
        }

        // print numbers from 1 to num using while loop
        int count2 = 0;
        while (count2 < num) {
            System.out.println(count2 + 1);
            count2++;
        }

        // sum of numbers from 1 to num using while loop
        int count3 = 1;
        int sum = 0;
        while (count3 <= num) {
            sum = sum + count3;
            count3++;
        }
        System.out.println("Sum: " + sum);

        // print numbers from 0 to num using for loop
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        // print 4 rows of stars
        for (int i = 1; i < 5; i++) {
            System.out.println("* * * *");
        }

        // reverse a number
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp = temp / 10;
        }
        System.out.println("Reversed number: " + reverse);

        // do-while loop to print "Hello World" 10 times
        int count4 = 0;
        do {
            System.out.println("Hello World");
            count4++;
        } while (count4 < 10);

        // break on negative input
        do {
            System.out.println("Enter a number");
            int x = sc.nextInt();
            if (x < 0) {
                System.out.println("Negative number entered, exiting loop.");
                break;
            }
            System.out.println(x);
        } while (true);

        // continue if number is divisible by 10
        do {
            System.out.println("Enter a number");
            int y = sc.nextInt();
            if (y < 0) {
                System.out.println("Negative number entered, exiting loop.");
                break;
            } else {
                if (y % 10 == 0) {
                    continue;
                }
            }
            System.out.println(y);
        } while (true);

        // prime number check
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
