class Solution {
    public int longestConsecutive(int[] arr) {
        TreeSet<Integer>set=new TreeSet<>();
        if(arr.length==0)
            return 0;
	    for(int i:arr)
	    {
	        set.add(i);
	    }
	    int count=1; //TEMPORARY SEQUENCE LENGTH
	    int max=-1;
	    for(Integer x:set)
	    {
	        if(set.contains(x+1))  
	        {
	            count++;
	        }
	        else
	        {
	            max=Math.max(count,max);
	            count=1;
	        }
	    }
	    return max;

    }
}