public class Node {

    public Node leftChild = null;
    public Node rightChild = null;
    public int value = -1;

    public Node(int value) {
        this.value = value;
    }

    public boolean hasRightChild() {
        if (rightChild != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasLeftChild() {
        if (leftChild != null) {
            return true;
        } else {
            return false;
        }
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
}