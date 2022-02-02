package linkedlist;

public class Question1 {
    //进行初始化操作，生成一个单链表，链表中有[1,2,3,4,5]，链表的头节点中储存的元素为1
    static Node n1, n2, n3, n4, n5;

    static {
        n1 = new Node(1);
        n2 = new Node(2);
        n3 = new Node(3);
        n4 = new Node(4);
        n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    }

    public static void main(String[] args) {
        Node head = n1;//头节点为n1
        head = func(head);
        //输出生成的新链表
        while (head.next != null) {
            System.out.print(head.var + " ");
            head = head.next;
        }
        System.out.println(head.var);
    }

    /**
     * 每隔一定间隔插入一个数字9，间隔量为1
     *
     * @param head 链表的头节点
     * @return 新链表的头节点
     */
    public static Node func(Node head) {
        Node preHead = new Node(9, head);//在头结点前加一个节点
        Node inserted;
        if (head.next != null) {
            func(head.next);
        }
        inserted = new Node(9);
        inserted.next = head.next;
        head.next = inserted;
        return preHead;
    }
}

/**
 * 链表节点类，类似于c的结构体
 */
class Node {
    int var;
    Node next;//相当于存储下一个节点的地址

    /**
     * 链表节点类的构造方法（即生成一个对象）
     *
     * @param var 类型为int的节点元素
     */
    public Node(int var) {
        this.next = null;
        this.var = var;
    }

    /**
     * 链表节点类的构造方法（即生成一个对象）
     *
     * @param var  类型为int的节点元素
     * @param next 下一个节点
     */
    public Node(int var, Node next) {
        this.next = next;
        this.var = var;
    }

    /**
     * 链表节点类的构造方法（即生成一个对象）
     */
    public Node() {
        this.next = null;
    }
}