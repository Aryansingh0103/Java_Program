import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the list of numbers: ");
            String[] numbers = input.nextLine().split(" ");

            Map<String, Integer> occurrences = new HashMap<>();

            for (String number : numbers) {
                if (occurrences.containsKey(number)) {
                    occurrences.put(number, occurrences.get(number) + 1);
                } else {
                    occurrences.put(number, 1);
                }
            }

            System.out.println("Number\tOccurrence");
            for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        }
    }
}
