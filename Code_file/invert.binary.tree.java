public TreeNode invertTree(TreeNode root) {
    if(root!=null){
        check(root);
    }
 
    return root;    
}
 
public void check(TreeNode p){
 
    TreeNode temp = p.left;
    p.left = p.right;
    p.right = temp;
 
    if(p.left!=null)
        check(p.left);
 
    if(p.right!=null)
        check(p.right);
}