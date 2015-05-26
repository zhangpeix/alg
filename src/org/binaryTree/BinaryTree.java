package org.binaryTree;

public interface BinaryTree<T extends Comparable<T>> {
	//�������
	void inorderTreeWalk(Node<T> node);
	
	//����
	boolean treeSearch(T key);
	
	T maximun();
	
	T minimun();
	
	//���
	Node<T> successor();
	//ǰ��
	Node<T> predecessor();
	
	void insert(T x);
	
	void delete(T key);
	
	boolean isEmpty();
}
