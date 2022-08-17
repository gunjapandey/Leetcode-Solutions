class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] v = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();
        for(String i:words){
            StringBuilder temp = new StringBuilder();
            int j=0;
            while(j<i.length()){
                temp.append(v[i.charAt(j)-'a']);
                j++;
            }
            set.add(temp.toString());
        }
        return set.size();
    }
}