import model.BSTModel;


public class Main {
    public static void main(String[] args) {
        BSTModel bst = new BSTModel();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Testing the traversals");
        System.out.print("Inorder should be sorted: ");
        bst.inorder();
        System.out.println();

        System.out.print("Preorder: ");
        bst.preorder();
        System.out.println();

        System.out.print("Postorder:");
        bst.postorder();
        System.out.println();

        System.out.print("Breadth search: ");
        bst.levelOrder();
        System.out.println();

        System.out.println("Balance the tree");
        bst.balance();

        System.out.print("Inorder after balance: ");
        bst.inorder();
        System.out.println();

        }
}
