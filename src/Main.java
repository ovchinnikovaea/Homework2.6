import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        printOddNumbers();
        System.out.println();
        printEvenNumbers();
        System.out.println();
        printUniqueWords();
        System.out.println();
        printNumbersOfDubles();
    }


    public static void printOddNumbers() {
        for (int number : nums) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void printEvenNumbers() {
        Collections.sort(nums);

        int uniqueNumbers = nums.get(0);
        for (int number : nums) {
            if (number % 2 == 0 && number != uniqueNumbers) {
                System.out.println(number);
                uniqueNumbers = number;
            }
        }
    }

    public static void printUniqueWords() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void printNumbersOfDubles() {
        Map<String, Integer> countDubles = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String uniqueWords = strings.get(i);
            if (!countDubles.containsKey(uniqueWords)) {
                countDubles.put(uniqueWords, 1);
            } else {
                countDubles.put(uniqueWords, countDubles.get(uniqueWords) + 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : countDubles.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue());
        }

    }

}