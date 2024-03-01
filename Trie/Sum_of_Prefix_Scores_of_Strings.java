package Trie;

public class Sum_of_Prefix_Scores_of_Strings {//leetcode 2416 
    public int[] sumPrefixScores(String[] words) {
        Node nn=new Node();
        int n=words.length;
       int ans[]=new int [n]; 
       for(String str:words){
           nn.insert(str);
       }
       for(int i=0;i<n;i++){
           ans[i]=nn.search(words[i]);
       }
       return ans;
    }
}
class Node{
    Node child[]=new Node[26];
    int weight;
    public void insert(String word){
        Node curr=this;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int ind=ch-'a';
            if(curr.child[ind]==null){
                curr.child[ind]=new Node();
            }
            curr=curr.child[ind];
            curr.weight++;
        }
    }
    public int search(String word){
        Node curr=this;
        int ans=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int ind=ch-'a';
            if(curr.child[ind]==null){
                break;
            }
            curr=curr.child[ind];
            ans+=curr.weight;
        }
        return ans;
    }
}
