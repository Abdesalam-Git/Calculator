// Base Code: Calculator.java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error");
            return 0;
        }
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(2, 5));
        System.out.println(calculator.multiply(3, 7));
        System.out.println(calculator.divide(10, 5));
        System.out.println(calculator.divide(4, 7));
        System.out.println(calculator.modulus(13, 2));
        System.out.println(calculator.modulus(1, 9));
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
    }

}
