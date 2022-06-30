<h2><a href="https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/">1022. Sum of Root To Leaf Binary Numbers</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">root</code> of a binary tree where each node has a value <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>. Each root-to-leaf path represents a binary number starting with the most significant bit.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, if the path is <code style="user-select: auto;">0 -&gt; 1 -&gt; 1 -&gt; 0 -&gt; 1</code>, then this could represent <code style="user-select: auto;">01101</code> in binary, which is <code style="user-select: auto;">13</code>.</li>
</ul>

<p style="user-select: auto;">For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return <em style="user-select: auto;">the sum of these numbers</em>.</p>

<p style="user-select: auto;">The test cases are generated so that the answer fits in a <strong style="user-select: auto;">32-bits</strong> integer.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/04/04/sum-of-root-to-leaf-binary-numbers.png" style="width: 400px; height: 263px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,0,1,0,1,0,1]
<strong style="user-select: auto;">Output:</strong> 22
<strong style="user-select: auto;">Explanation: </strong>(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [0]
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 1000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">Node.val</code> is <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>.</li>
</ul>
</div>