class Solution {
    Integer memo[][][]=new Integer[100][100][21];
    int inf=999999999;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int res=findMinimumCost(houses,cost,target,0,0,0);
        if(res==inf)
            return -1;
        else return res;
    }
    
    int findMinimumCost(int[] houses, int[][] cost, int target,int currIn, int nhc, int phc){
        int newnhc,mincost=inf;
        if(currIn==houses.length)
            return nhc==target? 0:inf;
        if(nhc>target) return inf;
        if(memo[currIn][nhc][phc]!=null)
            return memo[currIn][nhc][phc];
        
        if(houses[currIn]!=0){
            newnhc=nhc+(houses[currIn]==phc?0:1);
            return memo[currIn][nhc][phc]=mincost=findMinimumCost(houses,cost,target,currIn+1, newnhc,houses[currIn]);
        }
        for(int i=1;i<=cost[0].length;i++){
            newnhc=nhc+(i!=phc?1:0);
            mincost=Math.min(mincost,cost[currIn][i-1]+findMinimumCost(houses,cost,target,currIn+1,newnhc,i));
        }
        return memo[currIn][nhc][phc]=mincost;
    }
}