import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections;
/**
 * this class provide list method for stocks
 *
 * @author: Sharon Le
 * @version: 4/10/21
 */
public class StockList 
{
    // instance variables - replace the example below with your own
    private ArrayList<Stock> stock;

    /**
     * Constructor for objects of class StockList
     */
    public StockList()
    {
        // initialise instance variables
        stock = new ArrayList<Stock>();
    }

    /**
     * Adds a stock s to the end of the list.
     *
     * @param s is added to the end of list
     * 
     */
    public void add(Stock s)
    {
        stock.add(s);
    }

    /**
     * Swaps the element at index1 with the element at index2.
     * If either index is out of bounds, do not changing anything.
     *
     * @param index1 index of wanted company
     * @param index2 index of wanted company 2
     * 
     */
    public void swap(int index1, int index2)
    {
        Stock temp;
        if (index1 >= 0 && index1 < stock.size())
        {
            if (index2 >= 0 && index2 < stock.size())
            {
                temp = stock.get(index1);
                stock.set(index1, stock.get(index2));
                stock.set(index2, temp);
            }
        }
    }

    /**
     * Gets the symbol for the Stock with the lowest price per share. 
     * If more than one Stock has the same price, return the symbol for the first. 
     * If the listis empty, return the empty string.
     *
     * 
     * @return symbol of company with cheapest shares
     */
    public String cheapest()
    {
        double cheap = Double.MAX_VALUE;
        String symbol = "";
        for (Stock tempo : stock)
        {
            if (tempo.getPrice() < cheap)
            {
                cheap = tempo.getPrice();
                symbol = tempo.getSymbol();
            }
        }
        return symbol;
    }
    
    /**
     * write the list as strings
     *
     * @return the string of stock list
     * 
     */
    @Override
    public String toString()
    {
        return stock.toString();
    }
    
    /**
     * This method help sort the list using sort from Array class
     * 
     */
    public void sort()
    {
        Collections.sort(stock);
    }
}
