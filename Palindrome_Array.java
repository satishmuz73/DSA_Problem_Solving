// Examples:

// Input: arr = [1, 2, 3, 2, 1]
// Output: true
// Explanation: Here we can see we have [1, 2, 3, 2, 1] if we 
// reverse it we can find [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.
// Input: arr = [1, 2, 3, 4, 5]
// Output: false
// Explanation: Here we can see we have [1, 2, 3, 4, 5] if we 
// reverse it we find [5, 4, 3, 2, 1] which is the not same as before. So, the answer false.


class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int left = 0, right = arr.length-1;
        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
