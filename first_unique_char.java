import java.util.HashMap;

public class first_unique_char {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // Return -1 if no unique character found
    }
}
