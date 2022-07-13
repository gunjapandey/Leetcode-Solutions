// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
           // add your code here
       HashMap<Integer,Integer>m=new HashMap<>();
       int res=0,sum=0;
       int temp[]=new int[n];
       for(int i=0;i<n;i++)
       {
           if(arr[i]==0)
               temp[i]=-1;
           else
               temp[i]=1;
       }
       for(int i=0;i<n;i++)
       {
           sum+=temp[i];
           if(sum==0)
               res++;
           if(m.containsKey(sum))
           {
               res+=m.get(sum);
               m.put(sum,m.get(sum)+1);
               
           }
           else
           {
               m.put(sum,1);
           }
       }
       return res;
    }
}


