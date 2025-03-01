 ## 1. array 01 - 283 moveZeroes (Easy)
### [Leetcode](https://leetcode.com/problems/move-zeroes/description/) 
对于这道题，是一道数组排序，需要把0元素全部放到数组末尾，将非0元素放到左边。  
我的思路是：用 **双指针**  
将 *left* 指针作为非0元素的位置，再用一个指针进行遍历，一旦有非0元素，就放到 *left* 指针的位置，然后将 *left* 指针加1。 

## 2. array 02 - 566 Reshape the Matrix (Easy)
### [Leetcode](https://leetcode.com/problems/reshape-the-matrix/description/) 
这道题是一道matrix题目，也就是所谓的二维数组，首先必须知道二维数组相关的知识，比如 *行数：array.length 列数：array[0].length*
还有二维数组的遍历等知识。  
我的解题思路是，首先排除不符合要求的r和c，根据题目，**r * c** 必须为二维数组的元素个数，否则直接返回原数组。 
然后就可以把二维数组的所有元素按照顺序遍历放入一个新的一维数组，再把一维数组中的元素排列放入新的二维数组。当然，这是较为繁琐的解法，下面再介绍一下相对简单的解法。  
不需要创建一维数组，而是直接将原二维数组的元素按照顺序放入新二维数组，只需在边界处加入判断即可。优化后的解法可以提升空间复杂度。

## 3. array 03 - 485 Max Consecutive Ones (Easy)
### [Leetcode](https://leetcode.com/problems/max-consecutive-ones/description/)
这道题是二进制数组找最长连续1的问题。我的解题思路是遍历数组并在遍历的过程中用while循环找连续的1，用count记录每一次连续1的个数，并将这些个数放入集合中，最后再遍历集合，找到最大的数字。  
有更为简单的方法，只要遍历一次数组即可，在遍历过程中比对，并且也不需要创建新的集合，提升空间复杂度。

## 4. array 04 - Search a 2D Matrix II (Medium)
### [Leetcode](https://leetcode.com/problems/search-a-2d-matrix-ii/)
这道题是在有序矩阵中寻找目标值，我的思路是可以根据矩阵的特性来解决。从矩阵的右上角开始搜索： 如果当前元素等于 target，返回 true。 如果当前元素大于 target，则向左移动一列。 如果当前元素小于 target，则向下移动一行。这种有关有序矩阵的问题都可以从这里下手。




