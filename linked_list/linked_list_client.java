public class linked_list_client {
    public static void main(String[] args) throws Exception {
        linked_list l1=new linked_list();
        l1.AddFirst(1);
        l1.AddFirst(2);
        l1.AddFirst(3);
        // l1.Display();
        // l1.AddFirst(30);
        // l1.Display();
        l1.AddLast(10);
        l1.AddLast(20);
        l1.AddLast(30);
        l1.AddLast(40);
       // l1.AddatIndex(-9, 3);
        l1.RemoveFirst();
        l1.RemoveatIndex(1);
        l1.Display();
        l1.GetNode(2);
       
        // System.out.println(l1.GetFirst());
        // System.out.println(l1.GetLast());
        // System.out.println(l1.GetatIndex(3));
    }
}
