/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode swapNodes(ListNode head, int k) {
            k=k-1;
            ListNode f=head;
            ListNode s=head;
            while(k-->0){
                f=f.next;
            }
            ListNode fs=f;
            while(fs.next!=null){
                s=s.next;
                fs=fs.next;
            }
            int temp=s.val;
            s.val=f.val;
            f.val=temp;
            return head;
    }

}