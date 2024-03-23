import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> results = new HashMap<Character, Integer>();
        
        for (char c : chars) {
            if (results.containsKey(c)) {   // if already entry, increment entry
                results.put(c, results.get(c)+1);
            } else { // if no entry, create one
                results.put(c, 1);
            }
        }

        int maxOccurence = 1;
        char mostCommonChar = str.charAt(0);
        for (char c : results.keySet()) {
            if (results.get(c) > maxOccurence) {
                maxOccurence = results.get(c);
                mostCommonChar = c;
            }
        }
        return mostCommonChar;
       
    }
}
