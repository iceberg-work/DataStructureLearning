package linkedlist.question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        //暂时不更新
    }
}

class ListNode {
    int val;
     ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {

    public int[] reversePrint(ListNode head) {
        if (head.next == null) {
            return new int[]{head.val};
        }
        int[] arr0 = reversePrint(head.next);
        //int[] arr1 = ;
        //int[] arr2 = new int[arr0.length +arr1.length];
        return new int[]{head.val};
    }
}
