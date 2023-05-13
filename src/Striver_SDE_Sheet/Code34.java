package Striver_SDE_Sheet;

public class Code34 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newNode=null;
        while(head!=null){
            ListNode nex = head.next;
            head.next = newNode;
            newNode = head;
            head = nex;
        }
        return newNode;
    }
    public ListNode middleElement(ListNode head){
        ListNode har = head;
        ListNode tur = head;
        while(har.next!=null && har.next.next!=null){
            har=har.next.next;
            tur=tur.next;
        }
        return tur;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode middle = middleElement(head);
        ListNode secondHalf = reverse(middle.next);

        ListNode firstHalf = head;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val) {
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
}
