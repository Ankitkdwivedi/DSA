package Trie;
import java.util.HashMap;
public class Trie {
    class Node{
        char data;
        boolean isTerminal;
        HashMap<Character,Node> child=new HashMap<>();
    }
    private Node root;
    public Trie(){
        Node nn=new Node();
        nn.data='*';
        root=nn;
    }

    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                Node nn=new Node();
                nn.data=ch;
                curr.child.put(ch,nn);
                curr=nn;
            }
        }
        curr.isTerminal=true;
    }

    public boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return false;
            }
        }
        return curr.isTerminal;
    }

    public boolean startswith(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
