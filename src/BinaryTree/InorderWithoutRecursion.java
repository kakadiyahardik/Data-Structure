package BinaryTree;
import java.util.Stack;

class Inorder
{
	void inorder(Node root)
	{
		if(root==null)
			return;
		
		Stack<Node> s=new Stack<>();
		
		Node tmp=root;
		s.push(tmp);
		
		while(tmp.left !=null )
		{
			s.push(tmp.left);
			tmp=tmp.left;
		}
		
		while(s.size()>0)
		{
			tmp=s.pop();
			System.out.print(tmp.data+" ");
			
			if(tmp.right != null)
			{
				s.push(tmp.right);
				tmp=tmp.right;
			}
			
			while(tmp.left != null)
			{
				s.push(tmp.left);
				tmp=tmp.left;
			}
			
		}
	}
}

public class InorderWithoutRecursion {
	public static void main(String []arg)
	{
		Node root=null;
		Inorder in=new Inorder();
		
		root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        in.inorder(root);
	}
}
