// Example 1:
// Input:
// N = 5
// Output:
// 120
// Explanation:
// 5*4*3*2*1 = 120
  
// Example 2:
// Input:
// N = 4
// Output:
// 24
// Explanation:
// 4*3*2*1 = 24


class Solution{
    static long factorial(int N){
        // code here
        long fact = 1;
        for(int i=1; i<=N; i++){
            fact = fact*i;
        }
        return fact;
    }
}
