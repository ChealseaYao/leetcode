## 1. Stack and Queue 01 - 225. Implement Queue using Stacks
### [Leetcode](https://leetcode.com/problems/implement-queue-using-stacks/description/) 

这道题要求使用栈来实现队列。一个栈用来存放入队列的元素，一个栈用来存放要出队列的元素。  
将添加元素都放入stackIn栈中，当要pop元素时，将stackIn中的元素依次放入stackOut中，这样在stackOut中的元素就可以实现队列的先进先出。最后检查empty时需要检测两个stack是否都为空。
注意在pop时先检查stackOut是否为空，如果不为空，直接pop，为空再将stackIn的元素放入。

## 2. Stack and Queue 02 - 225. Implement Stack using Queues
### [Leetcode](https://leetcode.com/problems/implement-stack-using-queues/)

这道题要求使用队列来模拟栈，由于队列是先进先出，栈是先进后出。  
要想用两个队列模拟栈，就假定一个队列queue1为主，一个队列queue2为辅。每次添加元素时，先放到辅助队列queue2，然后将queue1的所有元素放入queue2，这样就形成了最后添加的元素位于首位。也就是实现了后进先出。然后交换queue1和queue2。  
注意queue的实现可以用linked list或者deque。

## 2. Stack and Queue 03 - 225. Valid Parentheses
### [Leetcode](https://leetcode.com/problems/valid-parentheses/description/)

这道题要求判断所给字符串是否符合要求。经过分析，不符合要求的情况总共有三种。这是典型的用栈解决的问题。  
第一种是，多了左括号。第二种是左右括号类型不匹配。第三种是多了右括号。  
首先遍历字符串，当遇到左括号就把对应的右括号放入到栈中，当遇到右括号就判断是否与栈顶元素相同。如果遍历完字符串，栈里还有元素，说明多了左括号也就是第一种情况。如果字符串对应处右括号与栈顶元素不相同，说明左右括号不匹配也就是第二种情况。如果字符串还没遍历完，栈已经空了，说明右括号多了，也就是第三种情况。  

