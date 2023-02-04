import java.util.ArrayList;
/**
 * The Orchard class uses an ArrayList to keep track of Tree
 * objects and has a constructor that takes no parameters 
 * and initializes the instance variable to an empty array list of Tree.
 *
 * @author: Sharon Le
 * @version: 5/1/21
 */
public class Orchard
{
    // instance variables - replace the example below with your own
    private ArrayList<Tree> orchard;
    /**
     * constructor that takes no parameters and initializes the instance 
     * variable to an empty array list of Tree.
     */
    public Orchard()
    {
        orchard = new ArrayList<Tree>();
    }

    /**
     * add a tree at a given position of the array list if the index is valid.
     * It does not do anything if the index is out of the range.
     * 
     * @param newTrees given trees to add
     * @param pos the given position to add
     */
    public void add(Tree newTrees, int pos)
    {
        if (pos >= 0 && pos <= orchard.size())
        {
            orchard.add(pos, newTrees);
        }
    }

    /**
     * calculates and return the first tallest tree. But null if the arrayList is empty
     * 
     * @return the first tallest tree
     */
    public Tree tallest()
    {
        Tree temp = null;
        double max = Double.MIN_VALUE;
        for (Tree someTree : orchard)
        {
            if (someTree.getHeight() > max)
            {
                max = someTree.getHeight();
                temp = someTree;
            }
        }
        return temp;
    }

    /**
     * to determine if the array list contains a Tree object of a given type.
     * It returns either true or false.
     * 
     * @param thisTree is a lost tree that need to be found
     * @return a boolean if the tree is found in list
     */
    public boolean contains(String thisTree)
    {
        for (Tree tempo : orchard)
        {
            if (tempo.getType().equals(thisTree))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * return an ArrayList<String> containing the types of all the Tree objects
     * in the array list.
     * 
     * @return types of trees in formatted form
     */
    public String treeList()
    {
        String s =  "[";
        int count = 1;
        for (Tree temp : orchard)
        {
            if (count < orchard.size())
            {
                s += temp.getType() + ", ";
            }
            else
            {
                s += temp.getType();
            }
            count++;
        }
        s += "]";
        return s;
    }
}
