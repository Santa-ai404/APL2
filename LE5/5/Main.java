import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        HashMap<Integer, List<String>> map = new HashMap<>();
        int limit = (int)Math.cbrt(N);

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int sum = a*a*a + b*b*b;
                if (sum <= N) {
                    map.putIfAbsent(sum, new ArrayList<>());
                    map.get(sum).add("(" + a + "," + b + ")");
                }
            }
        }

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                System.out.print(entry.getKey() + " = ");
                for (String pair : entry.getValue()) {
                    System.out.print(pair + " ");
                }
                System.out.println();
            }
        }
    }
}
