package Methods;

public class method_to_check_number_even_or_odd
{
    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(7)); // Output: Odd
    }
}
