// Removal of loop in linked list
package myPackage;

public class AC_29 {
    ListNode head;
    private int size;
    AC_29(){
        this.size=0;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
            size++;
        }
    }
    public void addLast(int value){
        ListNode newNode = new ListNode(value);
        size++;
        if(head==null ) {
            head=newNode;
            return;
        }
        ListNode cur = head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
    }
    public void loopCreation(){
        ListNode cur = head;
        for(int i=0;i<2;i++){
            cur=cur.next;
        }
        ListNode fur = cur;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=fur;
    }
    public void printList(){
        ListNode cur = head;
        while(cur!=null){
            System.out.print(cur.val+" -> ");
            cur=cur.next;
        }
        System.out.println("null");
    }
    public int deleteLoop(){
        if(head==null || head.next==null) return 0;
        ListNode hare = head;
        ListNode turtle = head;
        // ListNode result = head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle = turtle.next;
            if(hare==turtle) {
                ListNode fur = head;
                while(fur!=hare){
                    hare=hare.next;
                    fur=fur.next;
                }
                ListNode tur = hare.next;
                while(tur.next!=fur){
                    tur=tur.next;
                }
                tur.next=null;
                return tur.val;
            };
        }
        return 0;
    }
    public static void main(String[] args) {
        AC_29 list = new AC_29();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.loopCreation();
        list.deleteLoop();
        list.printList();
    }
}
