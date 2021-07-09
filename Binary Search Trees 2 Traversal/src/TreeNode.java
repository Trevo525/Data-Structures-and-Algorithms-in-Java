import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value){
        if (data == value){
            return;
        }

        if(value < data){
            if (leftChild == null){
                leftChild = new TreeNode(value);
            }else{
                leftChild.insert(value);
            }
        }else{
            if (rightChild == null){
                rightChild = new TreeNode(value);
            }else{
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if(leftChild!=null){
            leftChild.traverseInOrder();
        }
        System.out.print("Data = "+data + ", ");
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }
    
    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
