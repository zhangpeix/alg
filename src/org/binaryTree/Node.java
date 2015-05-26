package org.binaryTree;

public class Node<T extends Comparable<T>> {
	
	private T value;
	private Node<T> parent;
	private Node<T> left;
	private Node<T> right;
	
	
	private Node() {
		super();
	}
	private Node(T value, Node<T> parent, Node<T> left, Node<T> right) {
		super();
		this.value = value;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	
	
	
}
