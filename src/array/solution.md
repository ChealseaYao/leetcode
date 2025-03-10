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

## 4. array 04 - 240. Search a 2D Matrix II (Medium)
### [Leetcode](https://leetcode.com/problems/search-a-2d-matrix-ii/)
这道题是在有序矩阵中寻找目标值，我的思路是可以根据矩阵的特性来解决。从矩阵的右上角开始搜索： 如果当前元素等于 target，返回 true。 如果当前元素大于 target，则向左移动一列。 如果当前元素小于 target，则向下移动一行。这种有关有序矩阵的问题都可以从这里下手。

## 5. array 05 - 378. Kth Smallest Element in a Sorted Matrix ((Medium))
### [Leetcode](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/)
这道题是在一个有序矩阵中找第几小的问题，可以使用**最小堆**来解决，也就是优先队列，优先级最小的元素最先出队。在 Java 中，优先队列是通过 PriorityQueue 类实现的。默认情况下，PriorityQueue 是一个最小堆（min heap）。

## 6. array 06 - 645. Set Mismatch (Easy)
### [Leetcode](https://leetcode.com/problems/set-mismatch/description/)
这道题是说给了一个数组，里面的数字是从1-n，也就是意味着如果这个数组按照顺序排列的话，应该是由1到n递增的，也就是说每个数组都应该比它的索引大一位。  
题目说有一个数组重复了两次，同时有一个数字消失，我们需要把重复两次和消失的数字放入一个新数组并返回。 
解题思路就在于，每个数字应该比排序后的索引大一位，为了降低空间复杂度，我们先遍历数组，利用while循环找到 *nums[i]!=i+1* 的数字，也就是说明位置不对，然后将nums[i]放到nums[nums[i]-1]的位置上。这样遍历一遍后，就会得到排序好的数组。  
然后我们需要再遍历一次数组，找到nums[i]!=i+1的数字，这个nums[i]就是重复的数字，而i+1就是小时的数字。

## 7. array 07 - 704. Binary Search (Easy)
### [Leetcode](https://leetcode.com/problems/binary-search/description/)
这道题是典型的二分查找题目，一般来说，通常用于在有序数组中查找目标值。它的核心思想是通过不断缩小搜索范围来快速定位目标值。  

中间值的计算非常重要，我们一般用 int mid = left + (right - left) / 2; 来计算，这个公式等同于int mid = (left + right) / 2; 但是更为安全，因为在某些编程语言中（如Java、C++），如果left和right都是很大的整数，直接使用(left + right)可能会导致整数溢出。使用left + (right - left) / 2可以避免这个问题。  

然后解法一般有两种，取决于区间的选择，主要有左闭右开区间和左闭右闭区间。  
左闭右开区间：有些二分法的实现使用left < right作为循环条件，此时right是不包含在搜索范围内的。在这种情况下，更新right时应该使用right = mid，而不是right = mid - 1。  
左闭右闭区间：有些实现使用left <= right作为循环条件，此时right是包含在搜索范围内的。在这种情况下，更新right时应该使用right = mid - 1。

## 8. array 08 - 27. Remove Element (Easy)
### [Leetcode](https://leetcode.com/problems/remove-element/description/)
这道题是要移除数组元素，但必须在这个数组上完成，这是典型的可以用双指针完成的题目，本题用快慢指针。  

用fast指针来代表要添加的数字，用slow指针来代表目前添加的索引，当nums[fast]!=val时，就把这个数字放到nums[slow]里面，相等的数字就跳过，这样将数字遍历完后，slow的值是已经添加完毕的数字索引的下一位，因为它是索引，也就代表着已完成添加的个数，返回slow即可。  

还有一种解法就是暴力解法，需要遍历两遍数组，第一次遍历是为了找到跟val相等的数字，一旦找到跟val相等的数字，就将之后的元素全部向前覆盖，也就是从i+1的位置开始重新遍历，由于i位置的数字被覆盖为新数字，必须将 *i--* （为了抵消i++） ，同时由于向前移位，再将 *size--* ，这样操作完成后size即为与val不相等的个数。

## 9. array 09 - 977. Squares of a Sorted Array (Easy)
### [Leetcode](https://leetcode.com/problems/squares-of-a-sorted-array/description/)
这道题要求把一个非降序排列的数组的每个数字的平方进行排序，根据题目的特性，有序数组，因此它所有数字的平方最大值要么在最左端要么在最右端。  
因此考虑使用双指针，取头尾两处指针，每次平方后进行比较，创建一个新数组，从后往前放置，以保证最终平方排序为由小到大的顺序。  
要确保每个数都比较过，当左指针的平方大于右指针平方时，将左指针平方放入结果数组，保持右指针不变，左指针++，进行下一轮比较。当右指针平方大于左指针平方时，将右指针平方放入结果数组，保持左指针不动，右指针--，进行下一轮比较。因为递增数组的特性，从两边找到最大值后，就可以排除最大值，比较下面的数字。

还有一种解法就是排序法也就是暴力解法，遍历数组，将所有数字的平凡和求解出来，并放在数组原位置，再用快排进行排序，最终返回数组。

## 10. array 10 - 209.Minimun Size Subarray Sum (Med)
### [Leetcode](https://leetcode.com/problems/minimum-size-subarray-sum/description/)
这道题要求在一个正整数数组中找到一个最小长度子序列，其中子序列的sum>=target。  
用 **滑动窗口** 来解决，要注意的是我们进行遍历时的指针应该为滑动窗口的右指针，而进行缩小范围的指针才是左指针。也就是说我们遍历移动的指针应该是滑动窗口的末尾指针，而不断进行调整的就是滑动窗口的头指针。    
每次当我们找到符合条件的值时，先计算出子序列的长度：subL = right - left + 1;然后保持右指针不变，开始移动左指针，移动前sum先减去当前左指针的值，如果符合条件再进行赋值subL的操作，如果不符合，跳出while循环，继续移动末尾指针。  
当不再符合条件时，也就是从初始left到当前right没有更小的序列，开始移动右指针，向后加一位，左指针不需要操作，因为在这之前的所有左指针长度肯定是比满足条件时长，所以无需考虑，从当前停止的左指针开始判断操作即可。  


## 11. array 11 - 59. Spiral Matrix II (Med)
### [Leetcode](https://leetcode.com/problems/spiral-matrix-ii/description/)
这道题是典型的螺旋矩阵题目，在求解过程中应该明确边界，我们在进行旋转赋值的时候应该保持一个左闭右开的思想，即每次只需赋值到本行或者本列的倒数第二位，把最后一位当作是下一行或者列的起始格。  
需要初始化一个行和列，用 startX = 0 和 startY = 0 来表示，还需要定义一个 offset 用来维持最后一位不填充，写上下左右四个for循环依次进行顺时针遍历。  
最重要的是，我们循环的次数应该为 **n / 2** ，如果 n 为奇数，再单独赋值最后一个元素。 注意 loop 初始为 0 和 1 均可。



