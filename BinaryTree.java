public class BinaryTree {

    public static Node[] output = { null, null, null, null, null, null, null };
    Node rootNode = null;

    public BinaryTree(Node rootNode) {
        this.rootNode = rootNode;
    }

    // Sudeep Binary Tree Question
    // iterate the tree adding the first node on every level to the output
    public void iterateTree(Node nodeIn, int currentLevel) {
        int level = currentLevel;

        // add the node to the tree if nothing exists in its spot
        if (output[level] == null) {
            output[level] = nodeIn;
            System.out.println("added node " + nodeIn.value);
        }

        if (nodeIn.hasRightChild()) {
            int nextLevel = level + 1;
            iterateTree(nodeIn.rightChild, nextLevel);
        }

        if (nodeIn.hasLeftChild()) {
            int nextLevel = level + 1;
            iterateTree(nodeIn.leftChild, nextLevel);
        }

    }

}
