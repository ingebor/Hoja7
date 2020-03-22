//import javax.swing.tree.TreeNode;

//Extraído de https://stackoverflow.com/questions/51285589/binary-tree-of-strings-in-java
public class BinaryTree <E> extends Object{
	

	private String key;
    private Object value;
    private BinaryTree left, right;
    //TreeNode treen = new TreeNode();
    
    //TreeNode root;

    public BinaryTree(String key, Object value)
    {
      this.key = key;
      this.value = value;
    }
    

    public BinaryTree() {
		// TODO Auto-generated constructor stub
	}


	public Object get( String key )
    {
      if (this.key.equals(key))
      {
        return value;
      }

      if (key.compareTo(this.key) < 0 )
      {
        return left == null ? null : left.get(key);
      }
      else
      {
        return right == null ? null : right.get(key);
      }
    }

    public void put(String key, Object value)
    {
      if (key.compareTo(this.key) < 0)
      {
        if (left != null)
        {
          left.put(key, value);
        }
        else
        {
          left = new BinaryTree(key, value);
        }
      }
      else if (key.compareTo(this.key) > 0)
      {
        if (right != null)
        {
          right.put(key, value);
        }
        else
        {
          right = new BinaryTree(key, value);
        }
      }
      else
      {
        this.value = value;
      }
    }
    
    public void inOrder(BinaryTree bt) {
    	if(bt==null) {
    		return;
    	}
    	if(left != null) {
    		System.out.println(left.key+" "+left.value);
    		if(left.left!= null) {
    			System.out.println(left.left.key+" "+left.left.value);
    			if(left.left.left!= null) {
        			System.out.println(left.left.left.key+" "+left.left.left.value);
        			if(left.left.left.left!= null) {
            			System.out.println(left.left.left.left.key+" "+left.left.left.left.value);
        			}
        			if(left.left.left.right!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    			if(left.left.right!= null) {
        			System.out.println(left.left.left.key+" "+left.left.left.value);
        			if(left.left.left.right!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    		}
    		if (left.right != null) {
    			System.out.println(left.right.key+" "+left.right.value);
    			if(left.right.right!= null) {
        			System.out.println(left.right.right.key+" "+left.right.right.value);
        			if(left.right.right.right!= null) {
            			System.out.println(left.left.left.left.key+" "+left.left.left.left.value);
        			}
        			if(left.right.right.left!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    			if(left.right.left!= null) {
        			System.out.println(left.right.left.key+" "+left.right.left.value);
        			if(left.right.left.left!= null) {
            			System.out.println(left.left.left.left.key+" "+left.left.left.left.value);
        			}
        			if(left.right.left.right!= null) {
            			System.out.println(left.left.left.right.key+" "+left.left.left.right.value);
        			}
    			}
    		}
    		System.out.println(bt.key+" " +bt.value);
    	}
    	else if (right != null) {
    		System.out.println(bt.key+ " " +bt.value);
    		System.out.println(right.key+" "+right.value);
    		if(right.left!= null) {
    			System.out.println(right.left.key+" "+right.left.value);
    			if(right.left.left!= null) {
        			System.out.println(right.left.left.key+" "+right.left.left.value);
        		}
    			if(right.left.right!= null) {
        			System.out.println(right.left.left.key+" "+right.left.left.value);
        		}
    		}
    		if (right.right != null) {
    			System.out.println(right.right.key+" "+right.right.value);
    			if(right.left.right!= null) {
        			System.out.println(right.left.right.key+" "+right.left.right.value);
        		}
    			if(right.left.right!= null) {
        			System.out.println(right.left.right.key+" "+right.left.right.value);
        		}
    		}
    	}
    	//inOrder(left);
    	//inOrder(left);
    }
}

