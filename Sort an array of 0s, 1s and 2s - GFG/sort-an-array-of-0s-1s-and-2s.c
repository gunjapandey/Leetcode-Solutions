// { Driver Code Starts
//Initial Template for C

#include <stdio.h>


 // } Driver Code Ends
//User function Template for C

void sort012(int a[], int n)
{
        int b=0,c=0,d=0;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
                b++;
            else if(a[i]==1)
                c++;
            else if(a[i]==2)
                d++;
        }
        for(int i=0;i<n;i++){
           if(i<b){
               a[i]=0;
           }
           else if(i>=b&&i<b+c){
               a[i]=1;
           }
           else{
               a[i]=2;
           }
    }
}

// { Driver Code Starts.

int main() {

    int t;
    scanf("%d", &t);

    while(t--){
        int n;
        scanf("%d", &n);
        int arr[n];
        for(int i=0;i<n;i++){
            scanf("%d", &arr[i]);
        }

        sort012(arr, n);

        for (int i = 0; i < n; i++)
            printf("%d ", arr[i]);
        printf("\n");
    }
    return 0;
}
  // } Driver Code Ends