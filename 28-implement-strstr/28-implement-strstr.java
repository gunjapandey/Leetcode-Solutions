class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(haystack.length()==0)
            return -1;
        if(haystack.length()==1 && needle.length()==1)
            return haystack.charAt(0)==needle.charAt(0)?0:-1;
        int pos=0;
        for(int i=0;i<haystack.length()-needle.length()+1;i++)
        {
            String str=haystack.substring(pos,needle.length()+pos);
            if(str.equals(needle))
               return pos;
            pos++;
        }
        return -1;
    }
}