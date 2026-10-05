/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i*i <= n; i++) {
            if (prime[i]) {
                System.out.println("Marking multiples of " + i);
                for (int j = i*i; j <= n; j += i) {
                    prime[j] = false;
                    System.out.println("  -> " + j + " marked as composite");
                }
                System.out.println("Current sieve state:");
                for (int k = 2; k <= n; k++) {
                    System.out.print((prime[k] ? k : "X") + " ");
                }
                System.out.println("\n");
            }
        }
        System.out.println("Final primes up to " + n + ":");
        for (int i = 2; i <= n; i++)
            if (prime[i]) System.out.print(i + " ");
    }
}
