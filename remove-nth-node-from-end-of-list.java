/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dump = new ListNode(0);
        dump.next = head;
        if(head.next == null){
            return null;
        }
        ListNode SecNode = dump;
        for(int i =0;i<=n;i++){
            SecNode = SecNode.next;
        }
        ListNode preNode = dump;
        while(SecNode != null){
            preNode = preNode.next;
            SecNode = SecNode.next;
        }
        preNode.next = preNode.next.next;
        return dump.next;
    }
}