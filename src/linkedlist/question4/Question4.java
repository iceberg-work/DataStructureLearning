package linkedlist.question4;
/**
 * 今天状态不是很好，先欠着
 *
 * 反转链表
 * from LeetCode 206
 */
public class Question4 {
    public static void main(String[] args) {
    }
    public static Node func(Node head) {
        Node pre = null;
        Node next;//Node next = null;提交不了
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static Node funcByRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node p = funcByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return p;
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