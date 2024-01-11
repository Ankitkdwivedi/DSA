public class queue_ques {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue dp=new Dynamic_Queue();
        dp.Enqueue(1);
        dp.Enqueue(14);
        dp.Enqueue(13);
        dp.Enqueue(12);
        dp.Enqueue(41);
        dp.Dequeue();
        reverse(dp);
        dp.Display();
    }
    static void reverse(Dynamic_Queue dp) throws Exception{
        if(dp.isEmpty()){
            return;
        }
        int x=dp.Dequeue();
        reverse(dp);
        dp.Enqueue(x);
    }
}
