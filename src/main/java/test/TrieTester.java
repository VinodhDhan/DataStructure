package test;

import trie.Trie;

public class TrieTester {
    public static void main(String[] args) {
        String word = "Vinodh";
        String prefix = "Vi";
        Trie obj = new Trie();
        obj.insert(word);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith(prefix);
        System.out.println(param_2+" "+param_3);
    }
}
