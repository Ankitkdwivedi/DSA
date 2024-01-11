package Stack;
public class Stack {
    protected int[] arr;
    protected int tos;
    public Stack(){
        arr=new int[5];
        tos--;
    }
    public Stack(int n){
        arr=new int[n];
        tos--;
    }
    public boolean isEmpty() {
        return tos == -1;
    }

    public boolean isFull() {
        return tos == arr.length - 1;
    }

    public void push(int item) {
        tos++;
        arr[tos] = item;
    }

    public int size() {
        return tos + 1;
    }

    public int pop() {
        int x = arr[tos];
        tos--;
        return x;
    }

    public int peek() {
        int x = arr[tos];
        return x;


    }
    public void Display(){
        for(int i=0;i<=tos;i++){
            System.out.print(arr[i]+"->");
        }
        System.out.print(".");
    }
}