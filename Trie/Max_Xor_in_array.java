package Trie;

public class Max_Xor_in_array {
    public class Node{
        Node zero;
        Node one;
    }
    public void Insert(Node root,int val){
        Node curr=root;
        for(int i=31;i>=0;i--){
            int bit =(val&(1<<i));
            if(bit==0){
                if(curr.zero!=null){
                    curr=curr.zero;
                }
                else{
                    Node nn=new Node();
                    curr.zero=nn;
                    curr=nn;
                }
            }
            else{
                if(curr.one!=null){
                    curr=curr.one;
                }
                else{
                    Node nn=new Node();
                    curr.one=nn;
                    curr=nn;

                }
            }
        }
    }
    public int Maxr(Node root,int[] nums) {
        Node curr=root;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            int temp=0;
            for(int i=31;i>=0;i--){
                int bit =(nums[j]&(1<<i));
                if(bit==0){
                    if(curr.one!=null){
                        curr=curr.one;
                        temp+=(1<<i);
                    }
                    else{
                        curr=curr.zero;
                    }
                }
                else{
                    if(curr.zero!=null){
                        curr=curr.zero;
                        temp+=(1<<i);
                    }
                    else{
                        curr=curr.one;
                    }
                }
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
    public int findMaximumXOR(int[] nums) {
        Node root=new Node();
        for(int i:nums){
            Insert(root, i);
        }
        return Maxr(root,nums);
    }
}
