package com.test;

import java.util.*;
        import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /*

    class Node
        int data;
        Node left;
        Node right;
    */
    public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        Queue queue = new LinkedList();
        queue.add(root);

        while(! queue.isEmpty())
        {
            Node n = (Node)queue.poll();
            System.out.println(n.data);
            if(n.left !=null)
                queue.add(n.left);
            if(n.right !=null)
                queue.add(n.right);

        }
    }


    public static int height(Node root) {

        return height1(root)-1;

    }

    public static int height1(Node root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
        //return x-1;

    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        //levelOrder(root);
        int h = height(root);
        System.out.println(h);
    }
}