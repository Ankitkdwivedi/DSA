public class Abstract_Demo_client {
    public static void main(String[] args) {
           Abstract_Demo obj=new Abstract_Demo(){
           public void Payment(){
            System.out.println("this is payment");     //anonymous object
           }
        };
           obj.Payment();
    }
}
