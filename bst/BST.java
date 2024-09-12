package bst;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    //inserting node O(N)
    
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
             return root;
        }
        if(root.data > val){
            //left subtree
            root.left=insert(root.left, val);


        }
        else{
            root.right = insert(root.right, val);

        }
        return root;

    }
    //inorder traversal 
    public static void inorder(Node root){
        if(root == null){
            return;

        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    //SEARCH in BST 
    //O(HEIGHT)
    // root > key leftsubtree
    // root = key -> true founf
    //root <key right subtree

    public static boolean search(Node root, int key){
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true; 
        }
        else{//right subtree
            return search(root.right, key);
        }
    }
    //delete  a node from BST
    public static Node delete(Node root, int val){
        if(root.data > val){
           root.left = delete(root.left, val);


        }
        else if(root.data < val){
            root.right = delete(root.right, val);

        }
        else{
            //case 1: khali tree
            if(root.left == null && root.right == null){
                return null;

            }
            //case 2:
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;

            }
            //case 3:
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right =delete(root.right, IS.data);


        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root =root.left;

        }
        return root;
    }

    
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        //inorder(root);
        if(search(root, 1)){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
        delete(root,4);
        inorder(root);



    }
}
