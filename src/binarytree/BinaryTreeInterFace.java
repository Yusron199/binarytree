package binarytree;

import java.lang.reflect.Method;

public interface BinaryTreeInterFace {
    public int size();
    public boolean isEmpty();
    public Object root();
    public void makeTree(Object root, Object left, Object right);
    public BinaryTreeInterFace removeLeftSubtree();
    public BinaryTreeInterFace removeRightSubtree();
    public void preOrder(Method visit);
    public void postOrder(Method visit);
    public void inOrder(Method visit);
    public void levelOrder(Method visit);
    
}
