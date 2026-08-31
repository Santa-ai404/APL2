import java.util.*;

public class Sieve {
    
    public static List<Integer> generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        // Sieve process
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Collect primes
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
