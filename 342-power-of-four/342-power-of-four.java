class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        
        if(n%4==0 ||n==1) 
        {
            if(n>4)
                return isPowerOfFour(n/4);
            else
                return true;
        } 
        else
            return false;
    }
}