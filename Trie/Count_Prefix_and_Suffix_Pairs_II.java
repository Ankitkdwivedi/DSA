public class Count_Prefix_and_Suffix_Pairs_II {
    public long countPrefixSuffixPairs(String[] words) {
        Node nn=new Node();
        long ans=0;
        for(String word:words){
            ans+=nn.getPrefixLength(word);
            nn.insert(word);
        }
        return ans;
    }
}
class Node{
    Node child[]=new Node[26];
    boolean isLast;
    int endCount;
    public void insert(String word){
        Node curr=this;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int ind=ch-'a';
            if(curr.child[ind]==null){
                curr.child[ind]=new Node();
            }
            curr=curr.child[ind];
        }
        curr.isLast=true;
        curr.endCount++;
    }
    public int getPrefixLength(String word){

        Node curr=this;
        int c=0;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            s.append(ch);
            int ind=ch-'a';
            if(curr.child[ind]==null){
                break;
            }
            curr=curr.child[ind];
            if(curr.isLast&&word.endsWith(s.toString())){
                c+=curr.endCount;
            }
        }
        return c;
    }
}