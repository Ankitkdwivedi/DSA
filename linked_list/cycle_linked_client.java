public class cycle_linked_client {
    public static void main(String[] args) throws Exception {
        Cycle_linked_list l=new Cycle_linked_list();
        l.AddLast(1);
        l.AddLast(2);
        l.AddLast(3);
        l.AddLast(4);
        l.AddLast(5);
        l.AddLast(6);
        l.AddLast(7);
        l.Display();
        l.createCycle();
        l.Display();
    }
}
