// BST.java
public class BST {
    private class Node {
        int key;
        Node left, right;
        Node(int k) { key = k; left = right = null; }
    }

    private Node root;

    public BST() { root = null; }

    // Insert
    public void insert(int key) {
        root = insertRec(root, key);
    }
    private Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key) node.left = insertRec(node.left, key);
        else if (key > node.key) node.right = insertRec(node.right, key);
        // if equal, ignore or handle duplicates as needed (here we ignore)
        return node;
    }

    // Search
    public boolean search(int key) {
        return searchRec(root, key);
    }
    private boolean searchRec(Node node, int key) {
        if (node == null) return false;
        if (key == node.key) return true;
        return key < node.key ? searchRec(node.left, key) : searchRec(node.right, key);
    }

    // Delete
    public void delete(int key) {
        root = deleteRec(root, key);
    }
    private Node deleteRec(Node node, int key) {
        if (node == null) return null;
        if (key < node.key) node.left = deleteRec(node.left, key);
        else if (key > node.key) node.right = deleteRec(node.right, key);
        else {
            // node to delete found
            // Case 1: no child
            if (node.left == null && node.right == null) return null;
            // Case 2: one child
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            // Case 3: two children -> replace with inorder successor (smallest in right subtree)
            Node succ = minValueNode(node.right);
            node.key = succ.key;
            node.right = deleteRec(node.right, succ.key);
        }
        return node;
    }
    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    // Traversals
    public void inorder() { inorderRec(root); System.out.println(); }
    private void inorderRec(Node node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.key + " ");
        inorderRec(node.right);
    }

    public void preorder() { preorderRec(root); System.out.println(); }
    private void preorderRec(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        preorderRec(node.left);
        preorderRec(node.right);
    }

    public void postorder() { postorderRec(root); System.out.println(); }
    private void postorderRec(Node node) {
        if (node == null) return;
        postorderRec(node.left);
        postorderRec(node.right);
        System.out.print(node.key + " ");
    }

    // Simple main to demo insert/delete/search
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) tree.insert(v);

        System.out.print("InOrder: "); tree.inorder();
        System.out.print("PreOrder: "); tree.preorder();
        System.out.print("PostOrder: "); tree.postorder();

        System.out.println("Search 40: " + tree.search(40)); // true
        tree.delete(50); // delete root with two children
        System.out.print("InOrder after deleting 50: "); tree.inorder();
    }
}
