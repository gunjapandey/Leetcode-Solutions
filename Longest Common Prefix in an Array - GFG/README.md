# Longest Common Prefix in an Array
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a array of <strong style="user-select: auto;">N</strong> strings, find the longest common prefix among all strings present in the array.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
N = 4
arr[] = {geeksforgeeks, geeks, geek,
&nbsp;        geezer}
<strong style="user-select: auto;">Output:</strong> gee
<strong style="user-select: auto;">Explanation</strong>: "gee" is the longest common
prefix in all the given strings.</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
N = 2
arr[] = {hello, world}
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation</strong>: There's no common prefix
in the given strings.</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">longestCommonPrefix()&nbsp;</strong>which takes the string array <strong style="user-select: auto;">arr</strong>[] and its size <strong style="user-select: auto;">N</strong> as inputs and <strong style="user-select: auto;">returns</strong> the longest common prefix common in all the strings in the array. If there's no prefix common in all the strings, return "-1".</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N*max(|arr<sub style="user-select: auto;">i</sub>|)).<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(max(|arr<sub style="user-select: auto;">i</sub>|)) for result.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">3</sup><br style="user-select: auto;">
1 ≤ |arr<sub style="user-select: auto;">i</sub>| ≤ 10<sup style="user-select: auto;">3</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>