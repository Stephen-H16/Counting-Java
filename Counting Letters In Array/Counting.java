
import java.util.Scanner;

public class Counting {

    static String[] letters = new String[3];
    private static int count;

    public static void countElements() {
        for (int i = 0; i < letters.length; i++) {
            int count = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j].equalsIgnoreCase(letters[i])) {
                    count++;
                }
            }
            System.out.println("Letters = " + letters[i].toUpperCase() + " is repeted " + count + " times");
        }
    }

    public static void main(String[] args) {
        System.out.println("Add Three Letters To the Array Then Type -1");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        while (!("-1").equals(input)) {
            letters[count] = input;
            count++;
            input = scanner.next();
        }
        countElements();
    }
}
