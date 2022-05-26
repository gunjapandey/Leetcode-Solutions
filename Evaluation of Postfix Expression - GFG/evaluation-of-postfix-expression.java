// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                st.push(S.charAt(i)-'0');
            }
            else
            {
                int op2=st.peek();
                st.pop();
                int op1=st.peek();
                st.pop();
                
                switch(S.charAt(i))
                {
                    case '+':
                        st.push(op1+op2);
                        break;
                    case '-':
                        st.push(op1-op2);
                        break;
                    case '*':
                        st.push(op1*op2);
                        break;
                    case '/':
                        st.push(op1/op2);
                        break;
                    //case '^':
                    //    st.push(Math.pow(op1,op2));
                    //   break;
                    default:
                        break;
                }
            }
        }
        return st.peek();
    }
}