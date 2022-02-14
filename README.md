# DataStructureLearning

## linkedList

### Question1

在一个链表中每隔一定间隔插入一个数字9，间隔量为1，采用双指针法，时间复杂度为O(n)

经验：

插入一个节点时，靠前的节点不能为空，靠后的节点可以为空（front.next = inserted中front为空会抛空指针异常）

### Question2

合并两个有序链表，实现了迭代的方法和递归的方法，但对什么是迭代和递归产生疑问，同时对调用func后原链表产生的变化也有疑惑（头节点没有发生变化，但其余部分和新链表一致，猜测引用过程进行了地址传递）

### Question3

相交链表，目前的代码是参照下面题解写的：

[图解相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/tu-jie-xiang-jiao-lian-biao-by-user7208t/)

没看题解时，想用栈来解决这道题，明天补充这个解法及题目的描述

看了题解后，发现这个思路和高中物理中与求解位移相关问题（例如行星多久后再次相遇）的思路相似，得出了代码是一种思维过程的符号表述的结论

# 最近在学指针，明天将优化该代码库的命名
没改完，明天继续
