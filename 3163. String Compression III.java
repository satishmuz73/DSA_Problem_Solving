// Example 1:
// Input: word = "abcde"
// Output: "1a1b1c1d1e"
// Explanation:
// Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
// For each prefix, append "1" followed by the character to comp.

// Example 2:
// Input: word = "aaaaaaaaaaaaaabb"
// Output: "9a5a2b"
// Explanation:
// Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.


class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder comp = new StringBuilder();
        int i=0;
        while(i < n){
            int count = 0;
            char ch = word.charAt(i);

            while(i < n && count < 9 && word.charAt(i) == ch){
                count ++;
                i++;
            }
            comp.append(count).append(ch);
        }
        return comp.toString();
    }
}
