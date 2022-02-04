#DataStructureLearning

##linkedList

###Question1

在一个链表中每隔一定间隔插入一个数字9，间隔量为1，采用双指针法，时间复杂度为O(n)

经验：

插入一个节点时，靠前的节点不能为空，靠后的节点可以为空（front.next = inserted中front为空会抛空指针异常）

###Question2

合并两个有序链表，今天复习了迭代的方法，明天复习递归的方法