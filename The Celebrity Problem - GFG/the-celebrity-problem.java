// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> stack = new Stack();
       
       for(int i=0;i<n;i++)
           stack.push(i);
       
       while(stack.size()>=2)
       {
           int person1 = stack.pop();
           int person2 = stack.pop();
           
           if(M[person1][person2]==1)
           {
               stack.push(person2);
           }
           else
           {
               stack.push(person1);
           }
       }
       
       int celebrityPerson = stack.pop();
       
       for(int i=0;i<n;i++)
       {
           if(i!=celebrityPerson)
           {
               if(M[celebrityPerson][i]==1 || M[i][celebrityPerson]==0 )
                   return -1;
           }
       }
       return celebrityPerson;
    }
}