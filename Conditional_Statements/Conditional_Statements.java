import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. IF Statement: Check if age is a teenager
        int age = 15;
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }

        // 2. IF-ELSE Statement: Check voting eligibility
        age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // 3. IF-ELSE IF-ELSE Statement: Find larger value
        int a = 6;
        int b = 4;
        if (a > b) {
            System.out.println("a is greater");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("b is greater");
        }

        // 4. EVEN or ODD Check using IF-ELSE
        int num = -14;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 5. Finding the largest among three numbers
        int x = 0, y = 30, z = 30;
        if (x > y && x > z) {
            System.out.println("x is the largest");
        } else if (y > x && y > z) {
            System.out.println("y is the largest");
        } else if (z > x && z > y) {
            System.out.println("z is the largest");
        } else if (x == y && x > z) {
            System.out.println("x and y are equal and larger than z");
        } else if (y == z && y > x) {
            System.out.println("y and z are equal and larger than x");
        } else if (x == z && x > y) {
            System.out.println("x and z are equal and larger than y");
        } else {
            System.out.println("All are equal");
        }

        // 6. Ternary Operator Example
        int larger = (5 > 3) ? 5 : 3;
        System.out.println("Larger number is: " + larger);

        String type = (5 % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + type);

        int marks = 30;
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // 7. Switch Statement: Day of the week
        System.out.print("Enter day number (1 to 7): ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // 8. Calculator using Switch
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter choice:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed");
                } else {
                    System.out.println("Division: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operation choice");
        }

        // 9. Leap Year Check
        System.out.print("Enter a year to check: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
