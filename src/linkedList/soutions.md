## 1. linkedList 01 - 203. Remove Linked List Elements
### [Leetcode](https://leetcode.com/problems/remove-linked-list-elements/description/) 

这道题是链表中删除节点的题目，这里提供两种解法。

第一种是创建一个虚拟头节点 dummyHead ，它的 next 指向 head ，然后从 dummyHead.next 开始循环判断，注意循环条件为 dummyhead.next != null。注意最终返回的是 dummyhead.next。  
第二种是在原链表上进行操作，这时候就要对头节点和其他节点分别进行判断，但要注意的是对头节点要循环判断。

要主要非空的判断是对于下面语句中要操作的元素。

## 2. linkedList 02 - 707. Design Linked List (Med)
### [Leetcode](https://leetcode.com/problems/design-linked-list/description/)

这道题目是设计链表，是一道综合题目，可以多加练习，熟悉链表。

解题思路还是使用虚拟头节点，题目要求创建一个类，包含查找，添加，删除等方法，索引由0开始。

需要注意的是，dummy head不计入真正链表的节点，index指的就是索引，注意边界条件的判断。

## 3. linkedList 03 - Reverse Linked List (Easy)
### [Leetcode](https://leetcode.com/problems/reverse-linked-list/)

这道题是经典的反转链表的题目，要求把所给链表反转。求解思路是利用 **双指针** 。  
需要定义一个新节点 pre ，每次将 current 指向 pre 。关键点在于在移动指向之前需要把 current.next 暂存于 temp 指针。操作完成后就得到了反转后的链表，需要注意的是此时我们return的必须是pre，即新链表的头节点。


