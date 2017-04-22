package tree.binarytree;

class WithoutStack
{
	void inorder(Node root)
	{
		if(root==null)
			return;
		
		Node cur,nex;
		
		cur=root;
		
		while(cur!=null)
		{
			if(cur.left==null)
			{
				System.out.println(cur.data+" ");
				cur=cur.right;
			}
			else
			{
				nex=cur.left;
				
				while(nex.right!=null && nex.right!=cur)
				{
					nex=nex.right;
				}
				
				if(nex.right==null)
				{
					nex.right=cur;
					cur=cur.left;
				}
				else
				{
					nex.right=null;
					System.out.println(cur.data+" ");
					cur=cur.right;
				}
			}
		}
	}
}

public class InorderWithoutStack {
	public static void main(String...strings )
	{
		Node root=null;
		WithoutStack in=new WithoutStack();
		
		root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        in.inorder(root);
	}
}
