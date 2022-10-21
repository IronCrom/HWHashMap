import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        text = text.toLowerCase();
        Map<Character, Integer> mapLetterCounter = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (mapLetterCounter.containsKey(text.charAt(i))) {
                    int letterCounter = mapLetterCounter.get(text.charAt(i));
                    letterCounter++;
                    mapLetterCounter.put(text.charAt(i), letterCounter);
                } else {
                    mapLetterCounter.put(text.charAt(i), 1);
                }
            }

        }
        long maxLetterCounter = -1;
        char maxLetter = 0;
        long minLetterCounter = Integer.MAX_VALUE;
        char minLetter = 0;
        for (Map.Entry<Character, Integer> letter : mapLetterCounter.entrySet()) {
            if (letter.getValue() > maxLetterCounter) {
                maxLetterCounter = letter.getValue();
                maxLetter = letter.getKey();
            }
            if (letter.getValue() < minLetterCounter) {
                minLetterCounter = letter.getValue();
                minLetter = letter.getKey();
            }
        }
        System.out.println("Большего всего в данном тексте встречается буква " + "\"" + maxLetter + "\" - " + maxLetterCounter + " шт.");
        System.out.println("Меньше всего в данном тексте встречается буква   " + "\"" + minLetter + "\" - " + minLetterCounter + " шт.");
    }
}
