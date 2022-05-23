# Implement Queue using array
## Easy
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Implement a Queue using an Array. Queries in the Queue are of the following type:<br style="user-select: auto;">
<strong style="user-select: auto;">(i)</strong>&nbsp;1 x&nbsp; &nbsp;(a query of this type means&nbsp;&nbsp;pushing&nbsp;<strong style="user-select: auto;">'x'</strong>&nbsp;into the queue)<br style="user-select: auto;">
<strong style="user-select: auto;">(ii)</strong>&nbsp;2 &nbsp; &nbsp; (a query of this type means to pop&nbsp;element from queue and print the poped element)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>Q = 5
Queries = 1 2 1 3 2 1 4 2
<strong style="user-select: auto;">Output: </strong>2&nbsp;3<strong style="user-select: auto;">
Explanation:
</strong>In the first test case for query&nbsp;
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2 &nbsp; poped element will be 2 the 
    queue will be {3}
1 4 the queue will be {3 4}
2 &nbsp; poped element will be 3&nbsp;</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>Q = 4
Queries = 1 3 2 2 1 4 &nbsp; 
<strong style="user-select: auto;">Output: </strong>3 -1<strong style="user-select: auto;">
Explanation:
</strong>In the second testcase for query&nbsp;
1 3 the queue will be {3}
2&nbsp; &nbsp;poped element will be 3 the
&nbsp;   queue will be empty
2&nbsp; &nbsp;there is no element in the
&nbsp;   queue and hence -1
1 4 the queue will be {4}.&nbsp;</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task :</strong><br style="user-select: auto;">
You are required to complete the two methods&nbsp;<strong style="user-select: auto;">push()</strong>&nbsp;which take one argument an integer&nbsp;<strong style="user-select: auto;">'x'</strong>&nbsp;to be pushed into the queue&nbsp;and&nbsp;<strong style="user-select: auto;">pop()</strong>&nbsp;which <strong style="user-select: auto;">returns </strong>a <strong style="user-select: auto;">integer&nbsp;</strong>poped out from othe queue. If the queue is empty, it should return -1 on a pop operation.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(1) for both&nbsp;<strong style="user-select: auto;">push()&nbsp;</strong>and&nbsp;<strong style="user-select: auto;">pop()</strong>.<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1) for both&nbsp;<strong style="user-select: auto;">push()&nbsp;</strong>and&nbsp;<strong style="user-select: auto;">pop()</strong>.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ Q ≤ 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 ≤ x<strong style="user-select: auto;"> </strong>≤ 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>