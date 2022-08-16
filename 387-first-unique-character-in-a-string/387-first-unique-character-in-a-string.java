class Solution {
    public int firstUniqChar(String s) {
      HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
                map.put(ch,map.get(ch)+1);   
        }
        for(char i:s.toCharArray())
        {
            if(map.get(i)==1)
                return s.indexOf(i);
        }
        return -1;
    }
}