package Stack;

public class Stack_client extends Stack{
    public static void main(String[] args) {
    Stack_client sc=new Stack_client();
    sc.push(1);
    sc.push(2);
    sc.push(3);
    sc.push(4);
    sc.Display();
    System.out.println(sc.peek());
    }
}
