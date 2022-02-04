package linkedlist.question2;

/**
 * printCommonPart
 * 打印两个有序链表的公共部分
 */
public class Question2 {

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