import java.util.*;

class Solution {
    public static void main(String[] args) {
        // Create a new HashMap to store the phone book entries
        Map<String, Integer> phoneBook = new HashMap<>();

        // Read the number of entries from the user
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read each entry and add it to the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            phoneBook.put(name, phone);
        }

        // Process queries and print the results
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            Integer phone = phoneBook.get(query);
            if (phone != null) {
                System.out.println(query + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
