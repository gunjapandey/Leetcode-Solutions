// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        StringBuilder st=new StringBuilder();
        int shortest=Integer.MAX_VALUE;
        for(String s:arr)
        {
            shortest=Math.min(s.length(),shortest);
        }
        for(int i=0;i<shortest;i++)
        {
            char ch=arr[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if(arr[j].charAt(i)!=ch)
                {
                    if(st.length()==0)
                    return "-1";
                    return st.toString();
                }
            }
            st.append(ch);
        }
        return st.toString();
    }
}