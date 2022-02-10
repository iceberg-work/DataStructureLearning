package linkedlist.question5;

public class question5 {
    public int getDecimalValue(Node head) {
        if (head == null)
            return 0;
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) + head.val;
            head = head.next;
        }
        return ans;
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
