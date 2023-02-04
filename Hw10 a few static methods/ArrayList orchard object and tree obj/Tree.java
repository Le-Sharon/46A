
/**
 * This class creates trees objects
 *
 * @author: Sharon Le
 * @version: 5/1/21
 */
public class Tree
{
    private String type;
    private double height;
    /**
     * contructor to make trees
     * 
     * @param name provides a given type of tree
     * @param tall provides a given height of tree
     */
    public Tree(String name, double tall)
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
    public Double getHeight()
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
    public void setHeight(double newHeight)
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
}
