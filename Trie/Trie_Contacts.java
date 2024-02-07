package Trie;
import java.util.HashMap;
public class Trie_Contacts {
    class Node{
        char data;
        boolean isTerminal;
        HashMap<Character,Node> child=new HashMap<>();
    }
    private Node root;
    public Trie_Contacts(){
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

    public int search(String word){
        int c=0;
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
                c++;
            }
            else{
                return false;
            }
        }
        return curr.isTerminal;
    }

    public static void main(String[] args) {
        Trie_Contacts t=new Trie_Contacts();
        t.insert("raj");
        t.insert("r");
        System.out.println(t.search("raj"));
        System.out.println(t.search("hak"));
    }
}
