package LeetcodeExercises;

//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
//返回删除后的链表的头节点。

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode virtralHead = new ListNode(-1);
        virtralHead.next = head;
        ListNode cur = head,ano = cur.next;
        while (ano.next != null){
            if(cur.val == val){
                cur.next = ano.next;
            }else cur = cur.next;
        }
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}