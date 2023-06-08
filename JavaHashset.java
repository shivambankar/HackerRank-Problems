import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        // Create a HashSet to store unique pairs
        Set<String> pairs = new HashSet<>();

        // Iterate through the input pairs
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            pairs.add(pair);
            System.out.println(pairs.size());
        }

        scanner.close();
    }
}
