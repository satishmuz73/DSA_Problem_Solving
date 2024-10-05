// Examples:

// Input: arr[] = [111, 222, 333, 444, 555]
// Output: true
// Explanation:
// arr[0] = 111, which is a palindrome number.
// arr[1] = 222, which is a palindrome number.
// arr[2] = 333, which is a palindrome number.
// arr[3] = 444, which is a palindrome number.
// arr[4] = 555, which is a palindrome number.
// As all numbers are palindrome so This will return true.

// Input: arr[] = [121, 131, 20]
// Output: false
// Explanation: 20 is not a palindrome hence the output is false.


class Solution {
    public static boolean palinArray(int[] arr) {
        // add code here.
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int rev = 0;
            
            while(temp != 0){
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp /10;
            }
            
            if(arr[i] != rev){
                return false;
            }
        }
        return true;
    }
}
