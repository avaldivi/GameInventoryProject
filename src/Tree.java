/**Class: AbstractTree.java
 * @author Cynthia Johnson
 * @version 2.0
 * Course : ITEC 3150 Fall 2015
 * Written: ???
*
*
* This class: - Binary Search Tree iterator
* Purpose: – To understand Binary Search Tree
* */

public interface Tree<E> extends Iterable<E> {
  /** Return true if the element is in the tree */
  public boolean search(E e);

  /** Insert element o into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e);

  /** Delete the specified element from the tree
   * Return true if the element is deleted successfully */
  public boolean delete(E e);

  /** Inorder traversal from the root*/
  public void inorder();

  /** Postorder traversal from the root */
  public void postorder();

  /** Preorder traversal from the root */
  public void preorder();

  /** Get the number of nodes in the tree */
  public int getSize();

  /** Return true if the tree is empty */
  public boolean isEmpty();
}
