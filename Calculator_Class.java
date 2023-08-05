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
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
int sum = calculator.add(1, 2);{
    System.out.println("Sum "+sum);
}
int difference = calculator.subtract(3, 1);{
    System.out.println("Difference "+difference);
}
int product = calculator.multiply(2, 3);{
    System.out.println("Product "+product);
}
int quotient = calculator.divide(6, 2);{
    System.out.println("Quotient "+quotient);
}
    }
}

