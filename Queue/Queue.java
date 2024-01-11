
public class Queue {
    protected int []arr;
    protected int front;
    private int size;
    public Queue(){
        arr=new int[5];
        front =0;
        size=0;
    }
    public Queue(int n){
        arr=new int[n];
        front =0;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
    }
    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int GetFront() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return arr[front];
    }
    public void Display(){
        for(int i=0;i<size();i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
    }
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
         // q.Enqueue(10);
       System.out.println(q.Dequeue());
       System.out.println(q.Dequeue());
        q.Enqueue(60);
        q.Enqueue(70);
        q.Display();
    }

}
