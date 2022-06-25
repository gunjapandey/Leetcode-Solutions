class Solution {
    public int myAtoi(String s) {
s = s.trim();
        
        if(s.length() == 0)
            return 0;
        int operation = 1;
        if(s.charAt(0) == '+')
            s = s.substring(1);
        else if(s.charAt(0) == '-'){
            operation = -1;
            s = s.substring(1);
        }
        String temp = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c))
                break;
            temp += Character.toString(c);
        }
        if(temp.length() == 0)
            return 0;
        double result = Double.parseDouble(temp);
        if(result > Integer.MAX_VALUE){
            if(operation == -1)
                return Integer.MAX_VALUE* operation -1;
            return Integer.MAX_VALUE * operation;
        }
        return (int) result * operation;
    }
}