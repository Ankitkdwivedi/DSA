public class linked_list {
    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;
    //O(1)
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
    public void AddatIndex(int item,int k) throws Exception{
        if(k<0||k>=size){
            throw new Exception("please input k in range");
        }
        if(k==0){
            AddFirst(item);
        }
        else if(k==size){
            AddLast(item);
        }
        else{
            Node nn=new Node();
            nn.val=item; 
            Node k_1th=GetNode(k-1);
            Node kth=k_1th.next;
            k_1th.next=nn;
            nn.next=kth;
            this.size++;
        }
    }
    public int GetFirst(){
        return head.val;
    }
    public int GetLast(){
        return tail.val;
    }
    public int GetatIndex(int k) throws Exception{
        return GetNode(k).val;
    }
    public int RemoveFirst() throws Exception{
        if(size==0){
            throw new Exception("ll empty hai");
        }
        int rv=head.val;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
            size--;
        }
        return rv;
    }
    public int RemoveLast() throws Exception{
        if(size==0){
            throw new Exception("ll empty hai");
        }
        if(size==1){
            return RemoveFirst();
        }
        else{
            int rv=tail.val;
            Node n=GetNode(size-2);
            tail=n;
            tail.next=null;
            size--;
            return rv;
        }
        
    }
    public int RemoveatIndex(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("index out of bound");
        }
        if(k==0){
            return RemoveFirst();
        }
        else if(k==size-1){
            return RemoveLast();
        }
        else{
            Node k_1th=GetNode(k-1);
            Node kth=k_1th.next;
            k_1th.next=kth.next;
            kth.next=null;
            size--;
            return kth.val;
        }
    }
}
