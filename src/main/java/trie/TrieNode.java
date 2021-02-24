package trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character,TrieNode> children;
    boolean endOfWord = false;
    TrieNode(){
        children = new HashMap<>();
    }
}
