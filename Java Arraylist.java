import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Create an ArrayList of ArrayLists to store the lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Read each line and store the integers in an ArrayList
        for (int i = 0; i < n; i++) {
            int lineSize = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < lineSize; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
        
        int numQueries = scanner.nextInt();
        
        // Process each query
        for (int i = 0; i < numQueries; i++) {
            int lineIndex = scanner.nextInt();
            int position = scanner.nextInt();
            
            // Check if the line exists
            if (lineIndex >= 1 && lineIndex <= lines.size()) {
                ArrayList<Integer> line = lines.get(lineIndex - 1);
                
                // Check if the position is within the line's range
                if (position >= 1 && position <= line.size()) {
                    System.out.println(line.get(position - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scanner.close();
    }
}
