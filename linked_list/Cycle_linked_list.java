public class Cycle_linked_list {
    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;
    public void AddFirst(int item){
        Node nn = new Node();
        nn.val = item;
        if(size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            nn.next=this.head;
            head=nn;
            this.size++;
        }
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println(".");
    }
//O(1)
    public void AddLast(int item){
        if(size==0){
            AddFirst(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            this.size++;
        }
    }
    public void createCycle() throws Exception{
        Node nn=GetNode(2);
        tail.next=nn;
    }
    public Node GetNode(int k) throws Exception{
        if(k<0||k>=size){
            throw new Exception("please input k in range");
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        //System.out.println(temp);
        return temp;
    }
    public Node hasCycle(Node head) {
        Node fast=head;
               Node slow=head;
               while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow) return slow;
                    }
        return null;
    }
    public void CycleRemoval1(){
        Node meet =hasCycle(head);
        if(meet==null){
            return;
        }
        Node curr=head;
        while(curr!=null){
            Node temp=meet;
            while(temp.next!=meet){
                if(temp.next==curr){
                    temp.next=null;
                    return;
                }
                temp=temp.next;
            }
        curr=curr.next;
        }
    }
    public void CycleRemoval2(){
        Node meet=hasCycle(head);
        if(meet==null){
            return;
        }
        Node temp=meet;
        int count =1;
        while(temp.next!=meet){
            count++;
            temp=temp.next;
        }
        // m length aage jayega
        Node fast=head;
        for(int i=0;i<=count;i++){
            fast=fast.next;
        }
        Node slow=head;
        while(slow.next!=fast.next){
            fast=fast.next;
        }
    }
    public void floyedCycleRemoval(){
        Node fast=
    }

}
