# Maximum Index
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">Arr[]</strong> of <strong style="user-select: auto;">N</strong> positive integers. The task is to&nbsp;find the maximum of <strong style="user-select: auto;">j - i</strong> subjected to the constraint of <strong style="user-select: auto;">Arr[i] &lt;= Arr[j]</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 9
Arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> In the given array Arr[1] &lt;
Arr[7]  satisfying the required condition
(Arr[i] &lt;= Arr[j])  thus giving the
maximum difference of j - i which is
6(7-1).
</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete the function <strong style="user-select: auto;">maxIndexDiff()</strong>&nbsp;which takes array <strong style="user-select: auto;">arr</strong> and size&nbsp;<strong style="user-select: auto;">n</strong>,&nbsp;as input parameters&nbsp;and returns an integer representing the answer.&nbsp;You don't to print answer or take inputs.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤ 10<sup style="user-select: auto;">3</sup><br style="user-select: auto;">
0 ≤ Arr[i] ≤ 10<sup style="user-select: auto;">18</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
 <p style="user-select: auto;"></p>
            </div>