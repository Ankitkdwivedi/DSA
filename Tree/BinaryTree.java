import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTree{
    public class Node{
        int data;
        Node left, right;
    }
    private Node root;
    public BinaryTree(){
         root=createtree();
    }
    Scanner sc=new Scanner(System.in);
    private Node createtree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
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
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null) return;
        String s="";
        s="<--"+nn.data+"-->";
        if(nn.left!=null){
            s=nn.left.data+s;
        }
        else{
            s="."+s;
        }
        if(nn.right!=null){
            s=s+nn.right.data;
        }
        else{
            s="."+s;
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int  max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int left=max(nn.left);
        int right=max(nn.right);
        return Math.max(nn.data,Math.max(left, right));
    }

    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node nn,int item){
        if(nn==null) return false;
        if(nn.data==item) return true;
        boolean left=find(nn.left,item);
        boolean right=find(nn.right,item);
        return left||right;
    }

    public void height(){
        System.out.println(height(root));
    }

    private int height(Node nn){
        if(nn==null) return -1;//singel node's height is 0  
        //return 0 pe node's height is 1.
        int lh=height(nn.left);
        int rh=height(nn.right);
        return Math.max(lh,rh)+1;
    }

    public void PreOrder(){
        PreOrder(root);
    }

    private void PreOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.println(nn.data);
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    public void PostOrder(){
        PostOrder(root);
    }

    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }
        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.println(nn.data);
    }
    public void InOrder(){
        InOrder(root);
    }

    private void InOrder(Node nn){
        if(nn==null){
            return;
        }
        InOrder(nn.left);
        System.out.println(nn.data);
        InOrder(nn.right);
    }
    public void LevelOrder(){
        LevelOrder(root);
    }

    private void LevelOrder(Node nn){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove();//q.poll() can also be used here
            System.out.print(rv.data+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }

    }
    public void diameter(){
        System.out.println(diameter(root));
    }
    private int diameter(Node nn) {
        if(nn==null) return 0;
       int ld=diameter(nn.left);
       int rd=diameter(nn.right);
       int sd=height(nn.left)+height(nn.right)+2;
       return Math.max(sd,Math.max(rd,ld));
    }


}