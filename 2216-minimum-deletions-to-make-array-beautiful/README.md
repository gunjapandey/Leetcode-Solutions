<h2><a href="https://leetcode.com/problems/minimum-deletions-to-make-array-beautiful/">2216. Minimum Deletions to Make Array Beautiful</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code>. The array <code style="user-select: auto;">nums</code> is <strong style="user-select: auto;">beautiful</strong> if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">nums.length</code> is even.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums[i] != nums[i + 1]</code> for all <code style="user-select: auto;">i % 2 == 0</code>.</li>
</ul>

<p style="user-select: auto;">Note that an empty array is considered beautiful.</p>

<p style="user-select: auto;">You can delete any number of elements from <code style="user-select: auto;">nums</code>. When you delete an element, all the elements to the right of the deleted element will be <strong style="user-select: auto;">shifted one unit to the left</strong> to fill the gap created and all the elements to the left of the deleted element will remain <strong style="user-select: auto;">unchanged</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of elements to delete from </em><code style="user-select: auto;">nums</code><em style="user-select: auto;"> to make it </em><em style="user-select: auto;">beautiful.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1,2,3,5]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> You can delete either <code style="user-select: auto;">nums[0]</code> or <code style="user-select: auto;">nums[1]</code> to make <code style="user-select: auto;">nums</code> = [1,2,3,5] which is beautiful. It can be proven you need at least 1 deletion to make <code style="user-select: auto;">nums</code> beautiful.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1,2,2,3,3]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> You can delete <code style="user-select: auto;">nums[0]</code> and <code style="user-select: auto;">nums[5]</code> to make nums = [1,2,2,3] which is beautiful. It can be proven you need at least 2 deletions to make nums beautiful.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>