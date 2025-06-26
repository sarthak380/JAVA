
public class Prime_no{
    public static void main(String[] args) {
        int num = 7; 
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(" is a prime number.");
        else
            System.out.println(" is not a prime number.");
    }
}
