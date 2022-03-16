class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack();
        int current = 0;
        for(int i = 0; i < pushed.length; i++)
        {
            st.add(pushed[i]); // push the elements from Pushed Sequence
            while(!st.empty() && st.peek() == popped[current]) //keep popping once the Top of the Stack from Pushed Sequence gets encountered in Popped Sequence
            {
                st.pop();
                current++; // keep moving to the next Elements in Popped Sequence
            }
        }
        return st.empty(); // will return False if any elements from Pushed sequence are left over
    }
}