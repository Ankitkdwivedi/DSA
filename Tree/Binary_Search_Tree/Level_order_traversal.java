package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_order_traversal {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public Level_order_traversal(){
        root=createtree();
    }
    Scanner sc=new Scanner(System.in);
    public Node createtree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();   //check has left child
        if(hlc){
            nn.left=createtree();
        }
        boolean hlr=sc.nextBoolean();   //check has right child
        if(hlr){
            nn.right=createtree();
        }
        return nn;
    }
    public void LevelOrder(){
        LevelOrder(root);
    }

    private void LevelOrder(Node nn){
        Queue<Node> q=new LinkedList<>();
        Queue<Node> helper=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove();//q.poll() can also be used here
            System.out.print(rv.val+" ");
            if(rv.left!=null){
                helper.add(rv.left);
            }
            if(rv.right!=null){
                helper.add(rv.right);
            }
            if(q.isEmpty()){
                q=helper;
                helper=new LinkedList<>();
                System.out.println();
            }
        }
        System.out.println();

    }
}
    