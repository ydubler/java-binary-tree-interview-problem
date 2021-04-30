import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        // create nodes
        Node rootNode = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node9 = new Node(9);

        // add children to root
        rootNode.setLeftChild(node1);
        rootNode.setRightChild(node2);

        // add children to node 1
        node1.setLeftChild(node3);
        node1.setRightChild(node4);

        // add child to node 2
        node2.setLeftChild(node5);

        // add children to node 4
        node4.setLeftChild(node9);

        // create the binary tree
        BinaryTree bt = new BinaryTree(rootNode);

        // iterate over the tree, outputting all right most nodes per level
        bt.iterateTree(rootNode, 0);

        int x = 1;
        int y = 2;

        if (x == 1 & y == 2) {
            System.out.println("sup");
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(1);

        int sum = 0;
        for (Integer cv : al) {
            sum += cv;
        }

        System.out.println("sum is " + sum);
    }
}