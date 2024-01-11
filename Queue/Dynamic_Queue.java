

public class Dynamic_Queue extends Queue {
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            int a[]=new int[2*arr.length];
            for(int i=0;i<size();i++){
                int idx=(front+i)%arr.length;
                a[i]=arr[idx];
            }
            front=0;
            arr=a;
        }
        super.Enqueue(item);
    }
}
