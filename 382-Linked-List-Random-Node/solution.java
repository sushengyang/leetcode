/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode head;
    /** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head=head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int res=head.val;
        ListNode p=head.next;
        int len=1;
        Random r=new Random();
        int ran=0;
        while(p!=null){
            ran=r.nextInt(++len);
            if(ran==0)
                res=p.val;
            p=p.next;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */