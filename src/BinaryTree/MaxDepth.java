package BinaryTree;

class Depth
{
	int depth(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int ld=depth(root.left);
			int rd=depth(root.right);
			
			if(ld>rd)
			{
				return ld+1;
			}
			else
			{
				return rd+1;
			}
		}
	}
}

public class MaxDepth {
	public static void main(String... s)
	{
		Node root=null;
		Depth d=new Depth();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		System.out.println(d.depth(root));
	}
}
