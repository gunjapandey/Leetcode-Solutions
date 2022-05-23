# Implement two stacks in an array
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your task is to implement&nbsp;&nbsp;2 stacks in one array efficiently.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>push1(2)
push1(3)
push2(4)
pop1()
pop2()<strong style="user-select: auto;">
</strong>pop2()

<strong style="user-select: auto;">Output:
</strong>3 4 -1<strong style="user-select: auto;">

Explanation:
</strong>push1(2) the stack1&nbsp;will be {2}
push1(3) the stack1&nbsp;will be {2,3}
push2(4) the stack2 will be {4}
pop1() &nbsp; the&nbsp;poped element will be 3&nbsp;
from stack1 and stack1 will be {2}
pop2() &nbsp; the poped element will be 4&nbsp;
from stack2 and now stack2 is empty
pop2()&nbsp;  the stack2 is now empty hence -1 .</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything.&nbsp;You are required to complete the 4&nbsp;methods&nbsp;<strong style="user-select: auto;">push1,&nbsp;push2&nbsp;</strong>which takes one argument an integer<strong style="user-select: auto;"> 'x' </strong>to be pushed into stack one and two<strong style="user-select: auto;">&nbsp;</strong>and&nbsp;<strong style="user-select: auto;">pop1, pop2</strong>&nbsp;which returns the integer&nbsp;poped out from stack one and two. If no integer is present in the array return -1.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(1) for all the four methods.<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:&nbsp;</strong>O(1) for all the four methods.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;=<strong style="user-select: auto;"> </strong>Number of queries &lt;= 100<br style="user-select: auto;">
1 &lt;= value in the stack&nbsp;&lt;= 100</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">The sum of elements in both the stacks &lt; size of the given array</span></p>
 <p style="user-select: auto;"></p>
            </div>