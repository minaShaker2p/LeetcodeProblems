import helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SameTreeProblem100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> values1=new ArrayList<>();
        List<Integer> values2=new ArrayList<>();
       inOrderTraverse(p,values1);

         inOrderTraverse(q,values2);
         if(values1.size()!=values2.size())
             return false;
             else if(values1.toString().equalsIgnoreCase(values2.toString()))
                 return true;
             else
                 return false;
    }

    public static  List<Integer> inOrderTraverse(TreeNode node,List<Integer> values)
    {


        if(node ==null)
        {      values.add(-1);
            return null;
        }


        System.out.print(node.val + " ");
        values.add(node.val);
        inOrderTraverse(node.left,values);

        inOrderTraverse(node.right,values);
        return values;

    }


}

