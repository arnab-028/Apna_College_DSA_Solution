import java.util.HashMap;
import java.util.Map;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If the lengths are different, they can't be anagrams
        }

        // Count occurrences of characters in string s
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement count for characters in string t
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // If a character in t is not in s, they can't be anagrams
            }
            int count = charCount.get(c);
            if (count == 1) {
                charCount.remove(c);
            } else {
                charCount.put(c, count - 1);
            }
        }

        return charCount.isEmpty(); // If charCount is empty, all characters have been matched
    }
}
