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

## 3. Stack and Queue 03 - 225. Valid Parentheses
### [Leetcode](https://leetcode.com/problems/valid-parentheses/description/)

这道题要求判断所给字符串是否符合要求。经过分析，不符合要求的情况总共有三种。这是典型的用栈解决的问题。  
第一种是，多了左括号。第二种是左右括号类型不匹配。第三种是多了右括号。  
首先遍历字符串，当遇到左括号就把对应的右括号放入到栈中，当遇到右括号就判断是否与栈顶元素相同。如果遍历完字符串，栈里还有元素，说明多了左括号也就是第一种情况。如果字符串对应处右括号与栈顶元素不相同，说明左右括号不匹配也就是第二种情况。如果字符串还没遍历完，栈已经空了，说明右括号多了，也就是第三种情况。  

## 4. Stack and Queue 04 - 1047. Remove All Adjacent Duplicates
### [Leetcode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/)

这道题要求移除所有相邻重复的字母，最后返回移除后的结果。  
又是典型的用栈解决的问题。我们首先遍历字符串，将遍历过的都放入栈中，当遍历到与栈中第一个字符相同的时候，就说明他们俩是相邻重复的，就从栈中移除，接着遍历，最后剩下的就是这个string中移除过所有相邻重复字符的结果。

## 5. Stack and Queue 05 - 1047. Evaluate Reverse Polish Notation
### [Leetcode](https://leetcode.com/problems/evaluate-reverse-polish-notation/description/)

这道题要求逆波兰表达式的解，逆波兰表达式也就是后缀表达式。特性是从左到右计算：表达式从左到右扫描，遇到操作数就压入栈，遇到运算符就从栈中弹出相应数量的操作数进行计算，并将结果压回栈中。  
值得注意的是，由于栈的LIFO特性，我们再将操作数放入栈中时，第一个放入的就是第一个操作数，但是当弹出的时候，第一个操作数就会在后面弹出，要处理好操作数的顺序。

## 6. Stack and Queue 06 - 1047. Sliding Window Maximum
### [Leetcode](https://leetcode.com/problems/sliding-window-maximum/description/)

这道题是求滑动窗口的最大值，使用单调队列求解，用双端队列deque。结果数组的个数应该是n-k+1。  
每次滑动窗口索引的位置应该是[i-k+1,i]，首先判断双端队列的前面元素是否还在索引范围内，不在索引范围就poll出去。  
保持单调递减队列，每次添加元素的时候，跟队列尾端的元素比较，如果尾端元素小，就弹出队列。  
最后判断的时候，当[i>=k-1]时，说明窗口形成，然后循环加入队列首个元素即最大值就行。