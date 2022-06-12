class Solution {
    public int maximumUniqueSubarray(int[] nums) {
Set<Integer> set = new HashSet<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        int max = 0, curr = 0;

		for(int i=0; i<nums.length; i++) {
            int el = nums[i];
            if(set.contains(el)) {
                int qel = 0;
                while(q.size() > 0 && (qel = q.poll()) != el) {
                    curr -= qel;
                    set.remove(qel);
                }
                set.remove(qel);
                curr -= qel;
            }
            
            set.add(el);
            q.offer(el);
            curr += el;
            max = Math.max(max, curr);
        }
        
        return max;
    }
}