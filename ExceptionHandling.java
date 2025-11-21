public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } finally {
            System.out.println("Program Completed");
        }
    }
}
