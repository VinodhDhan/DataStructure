package trie;

public class Trie {
    /** Initialize your data structure here. */
    private TrieNode root;
    public Trie() {

        root = new TrieNode();

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            if(!current.children.containsKey(word.charAt(i))){
                TrieNode childOfCurrentNode = new TrieNode();
                current.children.put(word.charAt(i),childOfCurrentNode);
            }
            current = current.children.get(word.charAt(i));
        }
        current.endOfWord=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(current.children.containsKey(c)){
                current = current.children.get(c);
            }
            else return false;
        }
        if(current.endOfWord==true) return true;
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(int i=0;i<prefix.length();i++)
        {
            char c = prefix.charAt(i);
            if(current.children.containsKey(c)){
                current = current.children.get(c);
            }
            else return false;
        }
        return true;
    }
}
