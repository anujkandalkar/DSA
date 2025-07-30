import java.util.Scanner;

public class Function {

    public static void TestFunction() {
        System.out.println("Hello World!");
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static int Multiply(int a , int b) {
        return a * b; 
    }

    public static void Factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }

    public static void main(String[] args) {
        TestFunction(); // calling the function
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Sum of a and b is: " + calculate(a, b)); // arguments
        Swap(a, b);
        System.out.println("Original a = " + a + ", b = " + b); 

        int product = Multiply(a, b);
        System.out.println("Product of a and b is: " + product);

        Factorial(a); // prints factorial inside the method
    }
}
