## 1. string 01 - 344. Remove String (Easy)
### [Leetcode](https://leetcode.com/problems/reverse-string/description/) 

这道题要求反转字符串，但是原地反转，不能创建新的数组空间。由于是反转，也就是首尾交换，很容易想到双指针。  
创建头尾两个指针，逐步开始交换，循环条件是i<=j。

## 2. string 02 - 541. Remove String II (Easy)
### [Leetcode](https://leetcode.com/problems/reverse-string-ii/description/) 

这道题也是反转字符串，但在上题的基础上附加了条件，每2k个数里的前k个进行反转，如果剩下的数不够k个，全部反转，如果剩下的数大于k小于2k，将前k个反转。  
先将string改为char[]，方便换位，以后这种字符串改变位置的题目都可以先转换为char[]来求解。  
设置边界条件，当剩下的数不足k个，也就是i+k大于length了，那就直接反转到length-1处。  
当剩下的数大于k个小于2k个，也就是i+k<length，直接将反转到i+k-1处。反转代码跟上题相同。
注意在遍历的时候直接每2k一跳。

## 3. string 03 - 541. Reverse Words in a String (Easy)
### [Leetcode](https://leetcode.com/problems/reverse-words-in-a-string/)

这道题要求反转words，并且去除掉多余的空格。分三步进行：1.先整体去掉两边的空格和中间多余的空格。 2.整体反转string。 3.挨个反转单词。  
首先去除空格，创建一个StringBuilder，使用双指针思想，先从两边依次循环判断，直到元素不为空的地方，进入循环，关键条件在于当前元素不为空||上一个元素不为空，这是关键条件，然后将符合要求的元素添加到sb。 最后将sb直接返回。 
整体反转string，继续使用上一个方法返回的sb，引入两个新形参作为起始位置，反转思想跟前两道题目相同。
最后挨个反转单词，将sb引入，判断当前位置是否为空，如果到了空格位置，将start--end-1处反转，使用上个反转方法，然后start=end+1，end=start+1.  
最后再将sb转换为string返回。  
在 Java 中，String 是不可变的（immutable），这意味着每次对字符串进行修改（如拼接、替换、反转等）时，都会创建一个新的 String 对象。这些方法在 StringBuilder 中都是原地操作（in-place），不会创建新对象。

## 3. strStr 04 - 541. Find the Index of the First Occurrence in a String (Easy)
### [Leetcode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

这道题要求在一个string中找到另一个string的起始index。使用KMP算法解决。  
先求出子字符串的前缀表，使用固定的KMP算法。然后遍历目标string，当遍历到不同字符时，移动索引到该处前一位的next[j-1]处，重新开始比较，最后如果j=m，即子string的长度时，返回开始索引i-j+1。否则返回-1.


