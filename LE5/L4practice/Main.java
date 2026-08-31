import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit n: ");
        int n = sc.nextInt();

        List<Integer> primes = Sieve.generatePrimes(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);
    }
}
