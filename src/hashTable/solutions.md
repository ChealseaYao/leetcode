## 1. hashTable 01 - 242 Valid Anagram (Easy)
### [Leetcode](https://leetcode.com/problems/valid-anagram/description/) 

这道题要求判断两个字符串是否为异位词。可以用 **哈希表** 来解决。考虑到字母只有26位，选择数组数据结构。  
创建一个26位的整数数组，将s中的字母遍历，有相应字母存在便将个数加一，数组索引应该从0开始，只需将每个字母减去a，会得到从0到25的索引值。  
接下来将另一个字符串遍历，每到一个字母，将hash数组中对应索引处减一，如果符合条件，这样操作完后hash数组的值都为0。  
再遍历数组，只要有不为0的值，就说明不是有效字母异位词。

## 2. hashTable 02 - 349 Intersection of Two Arrays (Easy)
### [Leetcode](https://leetcode.com/problems/intersection-of-two-arrays/description/) 

这道题要求找到两个数组公共的部分，返回的数组必须是去重的。一旦涉及到去重，就该想到使用set。  
首先把第一个数组放到set，然后遍历第二个数组，当第二个数组里有重合的数字，将这个数字放到新的set集合，最后将set转换为数组返回。



