// Input: arr[] = [1, 2, 3]
// Output: 7
// Explanation: 7 is the smallest positive number for which no subset is there with sum 7.
// Input: arr[] = [3, 6, 9, 10, 20, 28]
// Output: 1
// Explanation: 1 is the smallest positive number for which no subset is there with sum 1.


class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long sum = 1;
        for(int num : arr) {
            if(num > sum) break;
            sum += num;
        }
        return sum;
    }
}
