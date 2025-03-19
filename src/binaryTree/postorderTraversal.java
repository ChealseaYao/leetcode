package binaryTree;

import java.util.*;

public class postorderTraversal {
    public List<Integer> postOrderTraversal(TreeNode root) {
        //解法一：递归遍历
//        List<Integer> result = new ArrayList<>();
//        postOrder(root, result);
//        return result;
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }

        }
        Collections.reverse(list);
        return list;


    }

    //解法一：递归遍历
    public void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);

    }
}
