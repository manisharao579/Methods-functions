package Methods;

public class MaxNumber
{
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        System.out.println("Max: " + findMax(10, 20, 30));
    }
}
