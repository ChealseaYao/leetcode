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
需要定义一个新节点 pre，每次将 current 指向 pre。关键点在于在移动指向之前需要把 current.next 暂存于 temp 指针。操作完成后就得到了反转后的链表，需要注意的是此时我们return的必须是pre，即新链表的头节点。

## 4. linkedList 04 - 24. Swap Nodes in Pairs (Med)
### [Leetcode](https://leetcode.com/problems/swap-nodes-in-pairs/description/)

这道题目要求将链表中的相邻节点两两交换，注意是节点的交换而不是数值的交换。  
解题思路还是使用虚拟头节点，这里就需要注意我们进行交换的条件，一定是接下来的两个节点都不为null才可以交换，所以在进行求解是，我们current节点必须是交换前的节点，令current = dummyHead.  
我们需要暂存三个节点的值，交换的第一个节点，第二个节点和第二个节点后面的节点，这里也是关键，这三个值都在未操作之前全部暂存。之后进行交换操作，每交换一次将current向后移两位。  
最后返回的必须是头节点，也就是虚拟头节点后面的节点。

## 5. linkedList 05 - 19. Remove Nth Node From End of List (Med)
### [Leetcode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)

这道题要求删掉从列表末尾开始数的第n个元素，使用 **双指针--快慢指针** 来解题。  
只需要让 fast 指针直接 slow 指针有n个数即可，也就是 fast 指针比 slow 多走 n+1 步，这样当 fast 指针到达末尾的时候，slow 指针正好在要删除元素的前一位，因为如果要删除一个元素，必须要让指针停留在它的前一位才可。  
然后开始循环判断，直到 fast 指针为 null ，删掉 slow 指针下一个，注意也要判断 slow.next!=null 才可，避免空指针异常。

## 6. linkedList 06 - 142. Linked List Cycle (Med)
### [Leetcode](https://leetcode.com/problems/linked-list-cycle-ii/description/)

这道题要求判断一个链表中有没有环，如果有的话，找到环的入口。  
首先链表有没有环的判断使用 **快慢指针** 来判断，让fast指针一次走两步，slow指针一次走一步，如果这两个指针最终相遇，就说明有环。  
环的入口的判断，根据数学推理可知，**fast指针和slow指针相遇的点到环的入口的距离等于链表head到环入口的距离**，所以要求入口的话，只需要将fast指针从相遇点往后移，同时将head往后移，head和fast相遇的地方就是环的入口。



