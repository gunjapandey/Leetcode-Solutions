class Solution {
    public boolean isPalindrome(String s){
        int c=0,k=s.length()-1;
        while(c<k){
            if(s.charAt(c)!=s.charAt(k)) return false;
            c++;
            k--;
        }
        return true;
    }
    public int removePalindromeSub(String s) {

        if(isPalindrome(s)) return 1;
         return 2;
        
    }
}