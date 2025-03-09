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

## 3. hashTable 03 - 1 Two Sum (Easy)
### [Leetcode](https://leetcode.com/problems/two-sum/description/) 

这道题是给定一个数组和一个目标值，找出两数相加等于目标值的下标，返回索引。这也是要求查找数的，考虑使用哈希表，查找的是值，返回的是索引，最好使用 **map**。  
首先开始遍历数组，创建一个hash map，用来存放已经遍历过的数及其索引，注意一定是数字值为key，索引为value，因为我们查找时使用的是值。
然后每次遍历到一个数就查找一次map，如果存在，直接get到map的value和当前数字的index，组成新数组返回，如果没找到则将其存入map。

## 4. hashTable 04 - 454 4Sum II (Med)
### [Leetcode](https://leetcode.com/problems/4sum-ii/description/) 

这道题是给定4个数组，要求找到4个数组里的数相加为0的元素的个数。依旧使用哈希表解决，由于此题设计数量较多，考虑使用map。  
将四个数组两两分组，这样能减少时间复杂度，遍历前两个数组，将它们的和记为a+b，创建一个map集合，key为a+b，value为个数。  
然后遍历剩余两个数组，记它们的和为c+d，当从map中找到0-（c+d）时，count加上value的所有值，最后返回count。

## 5. hashTable 05 - 15 3Sum (Med)
### [Leetcode](https://leetcode.com/problems/3sum/description/) 

这道题给定一个数组，要求找出三个数的和为0，并且所有找出的解里面，不能有重复的解。  
由于题目只要求返回数，并没有要求索引，可以使用 **双指针**。将数组进行排序，固定一个指针，再移动左右两个指针。  
对于查重，解题思路是我们要保证每个相同的数只处理一次，遍历数组，nums[i]为当前的固定数，对nums[i]的去重在于如果nums[i]==nums[i-1]，即后面的数跟前面的数相等的话，就直接**continue**，因为当前的数字已经处理过了。
令left=i+1；right=nums[length-1]，开始进行判断，如果三个数相加小于0，将left指针+1，当大于0，将right指针-1。  
直到找到=0的值，将这三个数存入集合集，开始对left和right去重，如果nums[left+1]==nums[left]-> left++，如果nums[right]==nums[right-1]-> right--;最后再次移动指针进行新的判断。

## 6. hashTable 05 - 18 4Sum (Med)
### [Leetcode](https://leetcode.com/problems/4sum/description/) 

这道题跟上面的3sum一样，但要求是4个数相加。我们可以在三个数的基础上加一个外循环。继续用双指针思路。
要注意的是，每次的剪枝和去重操作，尤其是内层循环剪枝后，应该接break，而不是return result。  
对于剪枝的条件，必须是第一个数大于等于0且大于target，才可以break，即当数组全部为正数且大雨target才可以进行return。这也是个易错点。