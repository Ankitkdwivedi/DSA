  
  //leetcode 543
  //leetcode 110
  //leetcode 101,951,112,113,129,199
  
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
    
    public class diameter_optimised {
    public int diameterofBinaryTree(TreeNode root){
        return diameter(root).dia;
    }
    public DiaPair diameter(TreeNode root){
        if(root==null){
            return new DiaPair();
        }
        DiaPair ldp=diameter(root.left);
        DiaPair rdp=diameter(root.right);
        int sd=ldp.ht+rdp.ht+2;
        DiaPair sdp=new DiaPair();
        sdp.dia=Math.max(sd, Math.max(rdp.dia, ldp.dia));
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
   } 
}
class DiaPair{
    int dia=0;
    int ht=-1;
}