package pl.globallogic.exercises.ex47;

public class Main {
    public static void main(String[] args) {
        Node root = new Node("5");
        SearchTree tree = new SearchTree(root);
        tree.addItem(new Node("3"));
        tree.addItem(new Node("7"));
        tree.addItem(new Node("1"));
        tree.addItem(new Node("4"));
        tree.addItem(new Node("6"));
        tree.addItem(new Node("8"));

        System.out.println("Traversal:");
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        System.out.println("\nTraversal after removing '3':");
        tree.traverse(tree.getRoot());
    }
}
