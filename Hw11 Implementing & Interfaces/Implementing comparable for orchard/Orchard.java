import java.util.Arrays;
import java.util.ArrayList;
/**
 * The Orchard class uses an ArrayList to keep track of Tree
 * objects and has a constructor that takes no parameters 
 * and initializes the instance variable to an empty array list of Tree.
 *
 * @author: Sharon Le
 * @version: 5/8/21
 */
public class Orchard
{
    // instance variables - replace the example below with your own
    private Tree[] orchard;
    private int counter;
    public static final int MIN_HEIGHT = 30;
    /**
     * constructor that takes no parameters and initializes the instance 
     * variable to an empty array list of Tree.
     */
    public Orchard(int length)
    {
        orchard = new Tree[length];
        counter = 0;
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
        if (pos >= 0 && pos <= counter && counter < orchard.length)
        {
            counter++;
            for (int a = counter - 1; a > pos; a--)
            {
                orchard[a] = orchard[a - 1];
            }
            orchard[pos] = newTrees;
        }
    }

    /**
     * calculates and return the first tallest tree. But null if the arrayList is empty
     * 
     * @return the first tallest tree
     */
    public Tree lastTallTree()
    {
        Tree temp = null;
        for (int i = counter - 1; i >= 0; i--)
        {
            if (orchard[i].getHeight() >= MIN_HEIGHT)
            {
                temp = orchard[i];
                break;
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
        for (int y = 0; y < counter; y++)
        {
            if (orchard[y].getType().equals(thisTree))
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
    public ArrayList<String> treeList()
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int x = 0; x < counter; x++)
        {
            list.add(orchard[x].getType());
        }
        return list;
    }
    
    /**
     * sort the array based on interface Comparable
     * 
     */
    public void sort()
    {
        Arrays.sort(orchard, 0, counter);
    }
}
