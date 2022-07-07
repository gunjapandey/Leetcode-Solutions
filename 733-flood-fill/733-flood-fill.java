class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int result[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++)
                result[i][j]=image[i][j];
        }
        dfs(image,result,sr,sc,newColor,image[sr][sc]);
        return result;
        
    }
    void dfs(int image[][],int result[][],int r,int c,int val,int old){
        if(r>=image.length||c>=image[0].length||r<0||c<0)
            return;
        if(image[r][c]==old){
        result[r][c]=val;
        image[r][c]=-10;
        dfs(image,result,r+1,c,val,old);
        dfs(image,result,r-1,c,val,old);
        dfs(image,result,r,c+1,val,old);
        dfs(image,result,r,c-1,val,old);
        }
        
    }
    
}