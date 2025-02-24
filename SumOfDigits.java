package Methods;

public class SumOfDigits
{
    public static int sumDigits(int num) {
        if (num == 0) return 0;
        return num % 10 + sumDigits(num / 10);
    }
    public static void main(String[] args) {
        System.out.println("Sum of digits: " + sumDigits(1234));
    }
}
