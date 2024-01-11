public class QueuePrac {
    static int front;
    static int rear;
    static int arr[];
    static int size;
    QueuePrac(int n){
        arr=new int[n];
        size=n;
        front=rear=-1;
    }
    public static void add(int data){
        if(rear==size-1){
            System.out.println("overflow");
        }
        if(front==rear){
            front+=1;
            rear+=1;
        }
        else{
            rear+=1;
        }
        arr[rear]=data;
    }
    public static void remove(){
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            // for(int i=0;i<rear-1;i++){
            //     arr[i]=arr[i+1];
            // }
            // rear-=1;
            front+=1;
        }
    }
    public static void print(){
        if(rear==-1){
            System.out.println("empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"    ");
            }
        }
    }
    public static void main(String[] args) {
        QueuePrac q=new QueuePrac(5);
        q.add(1);
        q.add(2);
        q.print();
        System.out.println();
        q.remove();
        q.add(6);
        q.print();
    }
}