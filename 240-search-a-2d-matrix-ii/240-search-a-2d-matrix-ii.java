class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        int n=matrix[0].length;
        int m=matrix.length;
        while(i<m && i>-1 && j<n && j>-1)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }    
            else if(matrix[i][j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}