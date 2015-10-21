/**Class: AbstractTree.java
 * @author Cynthia Johnson
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: ???
*
*
* This class: - Binary Search Tree extended class 
* Purpose: – To understand Binary Search Tree
* */
public abstract class AbstractTree<E> implements Tree<E> {
  @Override /** Inorder traversal from the root*/
  public void inorder() {
  }

  @Override /** Postorder traversal from the root */
  public void postorder() {
  }

  @Override /** Preorder traversal from the root */
  public void preorder() {
  }

  @Override /** Return true if the tree is empty */
  public boolean isEmpty() {
    return getSize() == 0;
  }
}
