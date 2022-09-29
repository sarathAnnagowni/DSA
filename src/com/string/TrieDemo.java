package com.string;

public class TrieDemo {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("abd");
        trie.insert("abcd");
        trie.insert("bcd");
        trie.insert("bc");
        trie.insert("cadb");
        trie.insert("cef");

        System.out.println(trie);
        System.out.println(trie.search("abd"));
        System.out.println(trie.search("bcd"));
        System.out.println(trie.search("bca"));
        System.out.println(trie.search("bc"));
    }
}

class Trie {
    static class Node {
        char character;
        int wordCount = 0;
        Node[] childNodes;

        Node() {
            childNodes = new Node[26];
            for (Node e : childNodes) {
                e.childNodes = null;
            }
        }

        Node(char c) {
            character = c;
            childNodes = new Node[26];
            for (int i = 0; i < childNodes.length; i++) {
                childNodes[i] = null;
            }
        }
    }

    Node root = new Node('/');

    public void insert(String pattern) {
        int length = pattern.length();
        char[] chars = pattern.toCharArray();
        Node temp = root;
        for (int i = 0; i < length; ) {
            int index = chars[i] - 'a';
            if (temp.childNodes[index] == null) {
                Node node = new Node(chars[i]);
                node.wordCount = 0;
                temp.childNodes[index] = node;
                temp = temp.childNodes[index];
                i++;
            } else {
                temp = temp.childNodes[index];
                i++;
            }
            if (i == length) {
                temp.wordCount++;
            }
        }
    }


    public boolean search(String pattern) {
        Node temp = root;

        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            if (temp.childNodes[index] != null) {
                temp = temp.childNodes[index];
            } else {
                return false;
            }
            if (i == pattern.length() - 1) {
                if (temp.wordCount > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

