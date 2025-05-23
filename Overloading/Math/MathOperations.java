public class MathOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) throw new ArithmeticException("Division by zero");
        return num1 / num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0.0) throw new ArithmeticException("Division by zero");
        return num1 / num2;
    }

    public float divide(float num1, float num2) {
        if (num2 == 0.0f) throw new ArithmeticException("Division by zero");
        return num1 / num2;
    }

    public long divide(long num1, long num2) {
        if (num2 == 0) throw new ArithmeticException("Division by zero");
        return num1 / num2;
    }
}