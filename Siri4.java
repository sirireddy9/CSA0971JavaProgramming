public class Siri4{
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 2;

            
            int sum = a + b;
            System.out.println("Sum: " + sum);
            int difference = a - b;
            System.out.println("Difference: " + difference);
            int product = a * b;
            System.out.println("Product: " + product);
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            int quotient = a / b;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
