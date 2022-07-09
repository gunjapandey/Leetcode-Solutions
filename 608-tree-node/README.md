<h2><a href="https://leetcode.com/problems/tree-node/">608. Tree Node</a></h2><h3>Medium</h3><hr><div class="sql-schema-wrapper__3VBi" style="user-select: auto;"><a class="sql-schema-link__3cEg" style="user-select: auto;">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2" style="user-select: auto;"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z" style="user-select: auto;"></path></svg></a></div><div style="user-select: auto;"><p style="user-select: auto;">Table: <code style="user-select: auto;">Tree</code></p>

<pre style="user-select: auto;">+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| p_id        | int  |
+-------------+------+
id is the primary key column for this table.
Each row of this table contains information about the id of a node and the id of its parent node in a tree.
The given structure is always a valid tree.
</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;">Each node in the tree can be one of three types:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><strong style="user-select: auto;">"Leaf"</strong>: if the node is a leaf node.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">"Root"</strong>: if the node is the root of the tree.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">"Inner"</strong>: If the node is neither a leaf node nor a root node.</li>
</ul>

<p style="user-select: auto;">Write an SQL query to report the type of each node in the tree.</p>

<p style="user-select: auto;">Return the result table <strong style="user-select: auto;">ordered</strong> by <code style="user-select: auto;">id</code> <strong style="user-select: auto;">in ascending order</strong>.</p>

<p style="user-select: auto;">The query result format is in the following example.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/10/22/tree1.jpg" style="width: 304px; height: 224px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
Tree table:
+----+------+
| id | p_id |
+----+------+
| 1  | null |
| 2  | 1    |
| 3  | 1    |
| 4  | 2    |
| 5  | 2    |
+----+------+
<strong style="user-select: auto;">Output:</strong> 
+----+-------+
| id | type  |
+----+-------+
| 1  | Root  |
| 2  | Inner |
| 3  | Leaf  |
| 4  | Leaf  |
| 5  | Leaf  |
+----+-------+
<strong style="user-select: auto;">Explanation:</strong> 
Node 1 is the root node because its parent node is null and it has child nodes 2 and 3.
Node 2 is an inner node because it has parent node 1 and child node 4 and 5.
Nodes 3, 4, and 5 are leaf nodes because they have parent nodes and they do not have child nodes.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/10/22/tree2.jpg" style="width: 64px; height: 65px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
Tree table:
+----+------+
| id | p_id |
+----+------+
| 1  | null |
+----+------+
<strong style="user-select: auto;">Output:</strong> 
+----+-------+
| id | type  |
+----+-------+
| 1  | Root  |
+----+-------+
<strong style="user-select: auto;">Explanation:</strong> If there is only one node on the tree, you only need to output its root attributes.
</pre>
</div>