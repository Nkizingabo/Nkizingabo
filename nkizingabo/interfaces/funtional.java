public class finterface{
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3)); // Outputs "Addition: 8"
    }
}
interface MathOperation {
    int operate(int a, int b);
}
