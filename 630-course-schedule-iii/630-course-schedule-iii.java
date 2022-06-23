class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b) -> a[1]-b[1]); // sorting the array based on lastdate of each course
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a); // for storing the max course duration till now
        
        int time=0; // to count total time spent before the current course 
        
        for(int course[]:courses){// going through each of the courses
            if(time+course[0] <= course[1]){// if total time till now plus current course duration is less than last date of current course
                maxHeap.offer(course[0]); // add duration to heap
                time+=course[0];// increment total time
            }
            else if(!maxHeap.isEmpty() && maxHeap.peek() >course[0]){ // if our current course duratrion is less than the maximum duration course we had before
                time+= course[0] - maxHeap.poll(); // replacing our max duration course with current course duration to reduce total time
                maxHeap.offer(course[0]);// adding current course duration to heap
            }
        }
        
        return maxHeap.size();// returning the final heap size.  i.e, maximum number of course we could fit into 
    }
}