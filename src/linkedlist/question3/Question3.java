package linkedlist.question3;

/**
 * getIntersectionNode
 * 相交链表
 * from LeetCode 160
 */
public class Question3 {
    public static void main(String[] args) {

    }

    /**
     *大佬求解相交链表的方法
     * @param head1 一条单链表的头节点
     * @param head2 另一条单链表的头节点
     * @return 相交的节点
     */
    public static Node func(Node head1, Node head2) {
        if(head1 == null || head2 == null)
            return null;
        Node h1 = head1;
        Node h2 = head2;
        while (h1 != h2) {
            h1 = h1 == null ? head2 : h1.next;
            h2 = h2 == null ? head1 : h1.next;
        }
        return h1;
    }
}

/**
 * 链表节点类，类似于c的结构体
 */
class Node {
    int val;
    Node next;//相当于存储下一个节点的地址

    /**
     * 链表节点类的构造方法（即生成一个对象）
     *
     * @param val 类型为int的节点元素
     */
    public Node(int val) {
        this.next = null;
        this.val = val;
    }

    /**
     * 链表节点类的构造方法（即生成一个对象）
     *
     * @param val  类型为int的节点元素
     * @param next 下一个节点
     */
    public Node(int val, Node next) {
        this.next = next;
        this.val = val;
    }

    /**
     * 链表节点类的构造方法（即生成一个对象）
     */
    public Node() {
        this.next = null;
    }
}