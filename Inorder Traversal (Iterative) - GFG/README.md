# Inorder Traversal (Iterative)
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a binary tree. Find the inorder traversal of the tree <strong style="user-select: auto;">without using recursion</strong>.</span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:</span></strong>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">           </span></strong><span style="font-size: 18px; user-select: auto;">1</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">         /    \</strong></span>
<span style="font-size: 18px; user-select: auto;">       2       3</span>
   <span style="font-size: 18px; user-select: auto;">   /   \</span>
<span style="font-size: 18px; user-select: auto;">    4     5</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Output: </span></strong><span style="font-size: 18px; user-select: auto;">4 2 5 1 3</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explanation:</span></strong>
<span style="font-size: 18px; user-select: auto;">Inorder traversal (Left-&gt;Root-&gt;Right) of </span>
<span style="font-size: 18px; user-select: auto;">the tree is 4 2 5 1 3.</span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2</span></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Input:</span></strong>
<span style="font-size: 18px; user-select: auto;">            8</span>
<span style="font-size: 18px; user-select: auto;">          /   \</span>
            <span style="font-size: 18px; user-select: auto;">1      5</span>
             <span style="font-size: 18px; user-select: auto;">\    /  \</span>
             <span style="font-size: 18px; user-select: auto;">7   10   6</span>
          <span style="font-size: 18px; user-select: auto;">   \  /
&nbsp;         </span><span style="font-size: 18px; user-select: auto;">10 6</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Output: </span></strong><span style="font-size: 18px; user-select: auto;">1 7 10 8 6 10 5 6</span>
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Explanation:</span></strong>
<span style="font-size: 18px; user-select: auto;">Inorder traversal (Left-&gt;Root-&gt;Right) 
of </span><span style="font-size: 18px; user-select: auto;">the tree is 1 7 10 8 6 10 5 6.</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<div style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Your task:</span></strong></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">inOrder() </strong>which takes the root of the tree as input and returns a list containing the inorder traversal of the tree, calculated</span><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"> without using recursion.</span></strong></div>

<p style="user-select: auto;"><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Expected time complexity: </span></strong><span style="font-size: 18px; user-select: auto;">O(N)</span><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Expected auxiliary space: </span></strong><span style="font-size: 18px; user-select: auto;">O(N)</span></p>

<div style="user-select: auto;"><br style="user-select: auto;">
<strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Constraints:</span></strong></div>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= Number of nodes &lt;= 10<sup style="user-select: auto;">5</sup><br style="user-select: auto;">
1 &lt;= Data of a node &lt;= 10<sup style="user-select: auto;">5</sup></span></div>
 <p style="user-select: auto;"></p>
            </div>