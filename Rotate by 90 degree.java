// Given a square mat[][]. The task is to rotate it by 90 degrees in clockwise direction without using any extra space.
// Examples:

// Input: mat[][] = [[1 2 3], [4 5 6], [7 8 9]]
// Output:
// 7 4 1 
// 8 5 2
// 9 6 3
  
// Input: mat[][] = [1 2], [3 4]
// Output:
// 3 1 
// 4 2
  
// Input: mat[][] = [[1]]
// Output:
// 1

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int i,j,n=mat.length,temp;
        for(i=0;i<n/2;i++)
        {
            for(j=i;j<n-1-i;j++)
            {
                temp=mat[i][j];
                mat[i][j]=mat[n-1-j][i];
                mat[n-1-j][i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=temp;
            }
        }
    }
}
