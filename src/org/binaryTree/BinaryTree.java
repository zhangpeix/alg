package org.binaryTree;

public interface BinaryTree<T extends Comparable<T>> {
	//中序遍历
	void inorderTreeWalk(Node<T> node);
	
	//查找
	boolean treeSearch(T key);
	
	T maximun();
	
	T minimun();
	
	//后继
	Node<T> successor();
	//前驱
	Node<T> predecessor();
	
	void insert(T x);
	
	void delete(T key);
	
	boolean isEmpty();
}
