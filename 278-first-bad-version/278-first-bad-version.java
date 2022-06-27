/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
       int head = 1;
        while (head < n) {
            int mid = (n - head) / 2 + head;
             if (!isBadVersion(mid)) {
                 head = mid + 1;
            } else {
                n = mid;
            }
    }
    return head;
    }
}