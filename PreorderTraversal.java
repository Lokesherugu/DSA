public class PreorderTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int val) { data = val; }
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        preorder(root);  // Output: 1 2 4 5 3
    }
}