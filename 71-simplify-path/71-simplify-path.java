class Solution {
    public String simplifyPath(String path) {
        Stack<String> q = new Stack();
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        for(String dir : path.split("/")){
            if(dir.equals("..") && !q.isEmpty())    q.pop();
            else if(!skip.contains(dir)) q.push(dir);
        }
        return "/" + String.join("/", q);
    }
}