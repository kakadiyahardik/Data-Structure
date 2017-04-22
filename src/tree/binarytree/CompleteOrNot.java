package tree.binarytree;

import java.util.LinkedList;

class SolvedCompleteOrNot{
	
	public boolean checkTree(Node root){
		
		LinkedList<Node> queue=new LinkedList<>();
		boolean flag=false;
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Node tmp=queue.removeFirst();
			
			if(tmp.left!=null){
				
				if(flag){
					return false;
				}
				queue.add(tmp.left);
			}
			else{
				flag= true;
			}
			
			if(tmp.right!=null){
				if(flag){
					return false;
				}
				queue.add(tmp.right);
			}
			else{
				flag=true;
			}
		}
		
		return true;
	}
}

public class CompleteOrNot {
	public static void main(String...args){
		SolvedCompleteOrNot tree=new SolvedCompleteOrNot();
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		if(tree.checkTree(root)){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
	}
}


