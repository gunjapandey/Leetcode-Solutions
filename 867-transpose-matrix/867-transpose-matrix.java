class Solution {
    public int[][] transpose(int[][] matrix) {
        int mat[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                mat[i][j]=matrix[j][i];
            }
        }
        return mat;
    }
}

/*for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int x=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=x;
           }
        }
        return matrix;*/
