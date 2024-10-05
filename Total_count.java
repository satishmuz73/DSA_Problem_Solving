// Input: k = 3, arr[] = [5, 8, 10, 13]
// Output: 14
// Explanation: Each number can be expressed as sum of different numbers less 
// than or equal to k as 5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1), 13 (3 + 3 + 3 + 3 + 1). 
// So, the sum of count of each element is (2+3+4+5)=14.
  
// Input: k = 4, arr[] = [10, 2, 3, 4, 7]
// Output: 8
// Explanation: Each number can be expressed as sum of different numbers less 
// than or equal to k as 10 (4 + 4 + 2), 2 (2), 3 (3), 4 (4) and 7 (4 + 3).
// So, the sum of count of each element is (3 + 1 + 1 + 1 + 2) = 8.


class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int count = 0;
        for(int i= 0; i<arr.length; i++){
            int n= arr[i];
            while(n>0){
                count++;
                n = n - k;
            }
        }
        return count;
    }
}
