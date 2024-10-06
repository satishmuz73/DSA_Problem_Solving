// Example 1:
// Input: sentence1 = "My name is Haley", sentence2 = "My Haley"
// Output: true
// Explanation:
// sentence2 can be turned to sentence1 by inserting "name is" between "My" and "Haley".

// Example 2:
// Input: sentence1 = "of", sentence2 = "A lot of words"
// Output: false
// Explanation:
// No single sentence can be inserted inside one of the sentences to make it equal to the other.

// Example 3:
// Input: sentence1 = "Eating right now", sentence2 = "Eating"
// Output: true
// Explanation:
// sentence2 can be turned to sentence1 by inserting "right now" at the end of the sentence.

class Solution {
    //tc N+M + Min(n,m)
    //sc n+m
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()>sentence2.length()){
            return areSentencesSimilar(sentence2, sentence1);
        }
        String smallerWords[] = sentence1.split(" ");
        String largerWords[] = sentence2.split(" ");
        int start=0;
        int end1=smallerWords.length-1;
        int end2=largerWords.length-1;
        //find prefix words
        while(start<=end1 && smallerWords[start].equals(largerWords[start])){
            start++;
        }
        //find suffix words
        while(start<=end1 && smallerWords[end1].equals(largerWords[end2])){
            end1--;
            end2--;
        }
        return (start>end1);
    }
}
