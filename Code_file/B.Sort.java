private static class TreeNode {
   String item;     
   TreeNode left;   
   TreeNode right;   
   TreeNode(String str) {
        item = str;
   }
}

private static TreeNode root;

static boolean treeContains( TreeNode root, String item ) {
   if ( root == null ) {        
      return false;
   }
   else if ( item.equals(root.item) ) {
      return true;
   }
   else if ( item.compareTo(root.item) < 0 ) {
      return treeContains( root.left, item );
   }
   else {
      return treeContains( root.right, item );
   }
}

private static boolean treeContainsNR( TreeNode root, String item ) {
   TreeNode runner;  
   runner = root;    
   while (true) {
      if (runner == null) {
         return false;  
      }
      else if ( item.equals(runner.item) ) {

         return true;
      }
      else if ( item.compareTo(runner.item) < 0 ) {
         runner = runner.left;
      }
      else {
         runner = runner.right;
      }
   }  // end while
}

root = new TreeNode( newItem ); 

private static void treeInsert(String newItem) {
   if ( root == null ) {
      root = new TreeNode( newItem );
      return;
   }
   TreeNode runner;  
   runner = root;   
   while (true) {
      if ( newItem.compareTo(runner.item) < 0 ) {
         if ( runner.left == null ) {
            runner.left = new TreeNode( newItem );
            return;  
         }
         else
            runner = runner.left;
      }
      else {
         if ( runner.right == null ) {
            runner.right = new TreeNode( newItem );
            return;  
         }
         else
            runner = runner.right;
      }
   } // end this while loop.
}


