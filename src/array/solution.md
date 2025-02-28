 ## 1. array 01 - moveZeroes
### [Leetcode](https://leetcode.com/problems/move-zeroes/description/) 283 easy 
对于这道题，是一道数组排序，需要把0元素全部放到数组末尾，将非0元素放到左边。  
我的思路是：用 **双指针**  
将 *left* 指针作为非0元素的位置，再用一个指针进行遍历，一旦有非0元素，就放到 *left* 指针的位置，然后将 *left* 指针加1。 

## 2. array 02 - Reshape the Matrix
### [Leetcode](https://leetcode.com/problems/reshape-the-matrix/description/) 566 easy
这道题是一道matrix题目，也就是所谓的二维数组，首先必须知道二维数组相关的知识，比如 *行数：array.length 列数：array[0].length*
还有二维数组的遍历等知识。  
我的解题思路是，首先排除不符合要求的r和c，根据题目，**r * c** 必须为二维数组的元素个数，否则直接返回原数组。 
然后就可以把二维数组的所有元素按照顺序遍历放入一个新的一维数组，再把一维数组中的元素排列放入新的二维数组。当然，这是较为繁琐的解法，下面再介绍一下相对简单的解法。  
不需要创建一维数组，而是直接将原二维数组的元素按照顺序放入新二维数组，只需在边界处加入判断即可。优化后的解法可以提升空间复杂度。



