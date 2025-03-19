## 1. binaryTree 01 - 144 Binary Tree Postorder Traversal (Easy)
### [Leetcode](https://leetcode.com/problems/binary-tree-preorder-traversal/) 

这道题是二叉树的前序遍历，节点顺序应该为中左右。所有前中后序的顺序是相对于中节点来说的。  
首先是递归法，创建一个递归方法，方法的传入值应该为二叉树TreeNode root和一个存放结果的集合。方法的返回值为空，递归的停止条件应该是root==null。  
接下来写递归方法体，前序遍历的话，先list.add(root.val)，再传入左节点，最后传入右节点。  
然后是迭代法求解，首先创建一个集合和一个栈，判断root是否为null，如果为null，直接返回集合，不为null将root放入栈中。建立一个while循环，循环条件为!stack.empty()，将stack.pop(),然后将val存入集合。  
由于顺序是中左右，根据栈的特性，先将右节点放入栈中，再将左节点放入，这样先出来的才是左节点。放入时先判断是否为null，最后返回list即可。


## 2. binaryTree 02 - 145 Binary Tree Postorder Traversal (Easy)
### [Leetcode](https://leetcode.com/problems/binary-tree-postorder-traversal/description/) 

这道题是二叉树的后序遍历，节点顺序应该为左右中。  
首先是递归法求解。创建一个递归方法，方法的传入值应该为二叉树TreeNode root和一个存放结果的集合。方法的返回值为空，递归的停止条件应该是root==null。  
接下来写递归方法体，后序遍历的话，先传入左节点，再传入右节点，最后list.add(root.val)。  
然后是迭代法求解。由于顺序是左右中，上面前序遍历迭代法求解时是中左右，所以将左右相对的代码调换位置，变为中右左，再reverse一下集合，便得到了左右中。

## 3. binaryTree 03 - 145 Binary Tree Inorder Traversal (Easy)
### [Leetcode](https://leetcode.com/problems/binary-tree-inorder-traversal/) 

这道题是二叉树的中序遍历，节点顺序为左中右。
首先是递归法求解。创建一个递归方法，方法的传入值应该为二叉树TreeNode root和一个存放结果的集合。方法的返回值为空，递归的停止条件应该是root==null。  
接下来写递归方法体，中序遍历的话，先传入左节点，再list.add(root.val)，最后传入右节点。