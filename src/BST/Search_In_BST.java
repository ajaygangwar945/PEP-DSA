package BST;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class Search_In_BST {

    public static Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }

        if(key < root.data){
            root.left=insert(root.left,key);
        }
        else if(key >root.data){
            root.right=insert(root.right, key);
        }

        return root;
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args){

        Node root=null;
        root=insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println();

        int key=60;

        if (search(root, key))
            System.out.println(key + " Found");
        else
            System.out.println(key + " Not Found");
    }
}
