package Bit_Masking;

import java.util.Arrays;

public class MAX_XOR_1707 {
    static class Node{
        Node zero;
        Node one;
    }
    public static void add(Node root,int val){
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
    static int getXor(Node root,int val) {
        Node curr=root;
        int ans=0;
            for(int i=31;i>=0;i--){ 
                int bit =(val&(1<<i));
                if(bit==0){
                    if(curr.one!=null){
                        curr=curr.one;
                        ans+=(1<<i);
                    }
                    else{
                        curr=curr.zero;
                    }
                }
                else{
                    if(curr.zero!=null){
                        curr=curr.zero;
                        ans+=(1<<i);
                    }
                    else{
                        curr=curr.one;
                    }
                }
            }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,2,4,6,6,3};
        Arrays.sort(arr);
        int [][]queries = {{12,4},{1,3},{5,6}};
        Pair q[]=new Pair[queries.length];
        for(int i=0;i<q.length;i++){
            q[i]=new Pair(queries[i][0],queries[i][1],i);
        }
        Arrays.sort(q,(a,b)->{
            return a.mi-b.mi;
        });

        Node root=new Node();
        int ans[]=new int[q.length];
        int j=0;
        for(Pair x:q){
            while(j<arr.length&&arr[j]<=x.mi){
                add(root, arr[j]);
                j++;
            }
            if(j==0){
                ans[x.i]=-1;
            }
            else{
                ans[x.i]=getXor(root,x.xi);
            }
        }
        System.out.println(Arrays.toString(ans));
        
    }
    
    static class Pair{
        int xi,mi,i;
        public Pair(int xi,int mi,int i){
            this.xi=xi;
            this.mi=mi;
            this.i=i;
        }
    }
}
