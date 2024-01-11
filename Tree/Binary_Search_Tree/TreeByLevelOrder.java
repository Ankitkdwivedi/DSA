package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeByLevelOrder {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public TreeByLevelOrder(){
        root=createTree();
    }
    private Node createTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        root=nn;
        Queue<Node> q=new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            Node rv=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
               Node ll=new Node();
               ll.val=c1;
               rv.left=ll;
               q.add(ll); 
            }
            if(c2!=-1){
                Node ll=new Node();
                ll.val=c2;
                rv.right=ll;
                q.add(ll);
            }
        }
        return nn;
    }
    public void PreOrder(){
        PreOrder(root);
    } 
    private void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
               PreOrder(root.left);
               PreOrder(root.right);

    }
    public static void main(String[] args) {
        TreeByLevelOrder lv=new TreeByLevelOrder();
        lv.PreOrder();
    }
}
