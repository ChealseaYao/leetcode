package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        //解法一：递归遍历
//        List<Integer> result = new ArrayList<>();
//        preOrder(root, result);
//        return result;

        //解法二:非递归遍历-迭代遍历
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return list;

    }

    //解法一：递归遍历
    public static void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    //解法二：非递归遍历
}
