package linkedlist.question2;

/**
 * mergeTwoLists
 * 合并两个有序链表
 * from LeetCode 21
 */
public class Question2 {
    //进行初始化操作，生成两个单链表，链表1中有[3，5，8]，链表2中有[2，4，6]，链表的头节点中储存的元素分别为3、2
    static linkedList linkedList1, linkedList2,linkedList3, linkedList4;

    static {
        linkedList1 = new linkedList(new int[]{3, 5, 8});
        linkedList2 = new linkedList(new int[]{2, 4, 6});
        linkedList3 = new linkedList(new int[]{3, 5, 8});
        linkedList4 = new linkedList(new int[]{2, 4, 6});
    }

    public static void main(String[] args) {
        Node head = func(linkedList1.head, linkedList2.head);//接受新链表的头节点
        //输出生成的新链表
        print(head);
        //测试递归方法
        head = funcByRecursion(linkedList3.head, linkedList4.head);
        print(head);
    }

    /**
     * 合并两个有序链表的迭代方法
     *
     * @param head1 链表1的头节点
     * @param head2 链表2的头节点
     * @return 合并后链表的头节点
     */
    public static Node func(Node head1, Node head2) {
        Node preHead = new Node();
        Node prev = preHead;
        while (head1 != null && head2 != null) {
            if (head1.val > head2.val) {
                prev.next = head2;
                head2 = head2.next;
            } else {
                prev.next = head1;
                head1 = head1.next;
            }
            prev = prev.next;
        }
        prev.next = head1 == null ? head2 : head1;
        return preHead.next;
    }

    /**
     * 合并两个有序链表的递归方法
     * @param head1 链表1的头节点
     * @param head2 链表2的头节点
     * @return 合并后链表的头节点
     */
    public static Node funcByRecursion(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        } else if (head1.val < head2.val) {
            head1.next = funcByRecursion(head1.next,head2);
            return head1;
        } else {
            head2.next = funcByRecursion(head1,head2.next);
            return  head2;
        }
    }

    /**
     * 遍历链表并打印每一个节点中的元素
     * @param head 链表的头节点
     */
    public static void print(Node head) {
        while (head.next != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println(head.val);
    }
}

/**
 * 链表类
 */
class linkedList {
    Node head;//头节点

    public linkedList(int[] list) {
        int index = 1;
        Node tail = new Node(list[0]);//尾节点
        this.head = tail;
        while (index < list.length) {
            tail.next = new Node(list[index]);
            tail = tail.next;
            index++;
        }
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