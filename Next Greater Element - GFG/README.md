# Next Greater Element
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array <strong style="user-select: auto;">arr[ ]</strong> of size <strong style="user-select: auto;">N</strong> having distinct elements, the&nbsp;task is to find the next greater element for each element of the array in order of their appearance in the array.<br style="user-select: auto;">
Next greater element of an element in the array is the nearest element on the right which is greater than the current element.<br style="user-select: auto;">
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
N = 4, arr[] = [1 3 2 4]
<strong style="user-select: auto;">Output</strong>:
3 4 4 -1
<strong style="user-select: auto;">Explanation</strong>:
In the array, the next larger element 
to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
since it doesn't exist, it is -1.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: 
N = 5, arr[] [6 8 0 1 3]
<strong style="user-select: auto;">Output</strong>:
8 -1 1 3 -1
<strong style="user-select: auto;">Explanation</strong>:
In the array, the next larger element to 
6 is 8, for 8 there is no larger elements 
hence it is -1, for 0 it is 1 , for 1 it 
is 3 and then for 3 there is no larger 
element on right and hence -1.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
This is a <strong style="user-select: auto;">function </strong>problem. You only need to complete the function <strong style="user-select: auto;">nextLargerElement()&nbsp;</strong>that takes list of integers&nbsp;<strong style="user-select: auto;">arr[ ] </strong>and<strong style="user-select: auto;">&nbsp;N</strong>&nbsp;as input parameters<strong style="user-select: auto;"> </strong>and returns list of integers&nbsp;of length N&nbsp;denoting the next greater elements for all the corresponding elements in the input array.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong> : O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space</strong> : O(N)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N ≤&nbsp;10<sup style="user-select: auto;">6</sup><br style="user-select: auto;">
1 ≤&nbsp;A<sub style="user-select: auto;">i</sub> ≤&nbsp;10<sup style="user-select: auto;">18</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>