
/**
 * This class creates trees objects
 *
 * @author: Sharon Le
 * @version: 5/8/21
 */
public class Tree implements Comparable
{
    private String type;
    private int height;
    /**
     * contructor to make trees
     * 
     * @param name provides a given type of tree
     * @param tall provides a given height of tree
     */
    public Tree(String name, int tall)
    {
        type = name;
        height = tall;
    }
    
    /**
     * get type of tree
     * 
     * @return type of tree
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * get height of tree
     * 
     * @return height of tree
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * set new type of tree
     * 
     * @param newType is a type to replace the previous
     */
    public void setType(String newType)
    {
        type = newType;
    }
    
    /**
     * set new height of tree
     * 
     * @param newHeight is a height to replace the previous
     */
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    /**
     * print out in formatted form
     */
    @Override
    public String toString()
    {
        return "Tree[Type:" + type + ",Height:" + height + "]";
    }
    
    /**
     * This class compare the value of the instances
     * 
     * @param otherObject get a object of some type
     * @return integer that indicates a comparison
     */
    @Override
    public int compareTo(Object otherObject)
    {
        Tree other = (Tree)otherObject;
        int comp = height - other.height;
        if (comp == 0) // if price the same, then compare symbol
        {
            return type.compareTo(other.type);
        }
        else // if price is not the same
        {
            return comp;
        }
    }
}
