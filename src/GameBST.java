import javax.swing.tree.TreeNode;

public class GameBST {
	protected TreeNode root = null;

	public GameBST(){};
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void preorder()
	{
		preOrder(root);
	}

	private void preOrder(TreeNode p) 
	{
		if(p != null)
		{
			System.out.println(p.data + " ");
			preOrder(p.left);
			preOrder(p.right);
		}	
	}
	public void postOrder()
	{
		postOrder(root);
	}

	private void postOrder(TreeNode p) 
	{
		if (p != null)
		{
			postOrder(p.left);
			postOrder(p.right);
			System.out.println(p.data + " ");
		}
	}
	
	public class TreeNode
	{
		protected Games data;
		protected TreeNode left;
		protected TreeNode right;
		
		public TreeNode()
		{
			left = null;
			right = null;
		}
		
		public TreeNode(Games data)
		{
			this(data,null,null);
		}
		
		public TreeNode(Games data, TreeNode l, TreeNode r)
		{
			this.data = data;
			left = l;
			right = r;
		}
		
		public void add (Games data)
		{
			TreeNode p = root, prev = null;
			while (p != null)
			{
				prev =p;
				if(p.data.compareTo(data) < 0)
				{
					p = p.right;
				}
				else
				{
					p = p.left;
				}
				
			}
			if (root == null)
			{
				root = new TreeNode(data);
			}
			else if (prev.data.compareTo(data) < 0)
			{
				prev.right = new TreeNode(data);
			}
			else
			{
				prev.left = new TreeNode(data);
			}
		}
		
	}	
	
}
