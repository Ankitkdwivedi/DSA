package Trie;

public class Trie_Client {
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("raj");
        System.out.println(t.search("raj"));
        System.out.println(t.search("r"));
    }
}
