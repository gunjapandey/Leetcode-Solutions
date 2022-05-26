# Evaluation of Postfix Expression
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given string <strong style="user-select: auto;">S</strong>&nbsp;representing a&nbsp;postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like <strong style="user-select: auto;">*, /, + and -</strong>.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: S = "231*+9-"
<strong style="user-select: auto;">Output</strong>: -4
<strong style="user-select: auto;">Explanation</strong>:
After solving the given expression, 
we have -4 as result.
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: S = "123+*8-"
<strong style="user-select: auto;">Output</strong>: -3
<strong style="user-select: auto;">Explanation</strong>:
After solving the given postfix 
expression, we have -3 as result.</span>
</pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your Task:</span></strong><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">You do not need to read input or print anything. Complete the function<strong style="user-select: auto;"> evaluatePostfixExpression()&nbsp;</strong>that takes the string S denoting the expression as input parameter and&nbsp;returns<strong style="user-select: auto;"> </strong>the evaluated value.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity</strong>: O(|S|)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auixilliary Space</strong>: O(|S|)</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ |S| ≤ 10<sup style="user-select: auto;">5</sup></span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">0 ≤ |S<sub style="user-select: auto;">i</sub>|≤ 9 (And given operators)</span></p>
 <p style="user-select: auto;"></p>
            </div>