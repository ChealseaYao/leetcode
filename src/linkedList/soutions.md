## linkedList 01 - 203. Remove Linked List Elements
### [Leetcode](https://leetcode.com/problems/remove-linked-list-elements/description/) 

这道题是链表中删除节点的题目，这里提供两种解法。

第一种是创建一个虚拟头节点 dummyHead ，它的 next 指向 head ，然后从 dummyHead.next 开始循环判断，注意循环条件为 dummyhead.next != null。注意最终返回的是 dummyhead.next。  
第二种是在原链表上进行操作，这时候就要对头节点和其他节点分别进行判断，但要注意的是对头节点要循环判断。

要主要非空的判断是对于下面语句中要操作的元素。

