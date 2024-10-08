// Given a String str, reverse the string without reversing its individual words. Words are separated by dots.
// Note: The last character has not been '.'. 

// Examples :1
// Input: str = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i

// Examples :2
// Input: str = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole string , the input string becomes mno.pqr





class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] words = str.split("\\.");
        String rev = "";
        
        for(int i = words.length -1 ; i>=0; i--){
            rev += words[i];
            
            if(i != 0){
                rev += ".";
            }
        }
        return rev;
    }
}
