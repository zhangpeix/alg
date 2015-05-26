package org.binaryTree;

public class BinaryTreeImpl<T extends Comparable<T>> implements BinaryTree<T> {
	
	private Node<T> root;

	@Override
	public void inorderTreeWalk(Node<T> node) {
		if(node!=null){
			inorderTreeWalk(node.getLeft());
			System.out.println(node.getValue().toString());
			inorderTreeWalk(node.getRight());
		}
	}

	@Override
	public boolean treeSearch(T key) {
		if(isEmpty() || key==null){
			return false;
		}
		Node<T> node=root;
		while(node!=null){
			Comparable<T> value=node.getValue();
			if(value.compareTo(key)>0){
				node=node.getLeft();
			}else if(value.compareTo(key)<0){
				node=node.getRight();
			}else{
				return true;
			}
		}
		return false;
		
	}

	@Override
	public T maximun() {
		Node<T> node=root;
		while(node.getRight()!=null){
			node=node.getRight();
		}
		return node.getValue();
	}

	@Override
	public T minimun() {
		Node<T> node=root;
		while(node.getLeft()!=null){
			node=node.getLeft();
		}
		return node.getValue();
	}

	@Override
	public Node<T> successor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<T> predecessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(T x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		if(root!=null){
			return false;
		}else{
			return true;
		}
	}
	
	

}
