class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[i - 1]) {
                q.add(heights[i] - heights[i - 1]);
                if (q.size() > ladders) {
                    bricks -= q.poll();
                }
            }
            if (bricks < 0) return i - 1;
        }
        return heights.length - 1;
    }
}
