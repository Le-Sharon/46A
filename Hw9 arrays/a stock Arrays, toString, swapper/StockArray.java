import java.util.Arrays;
/**
 * this class provides array methods for stock
 *
 * @author: Sharon Le
 * @version: 4/16/2021
 */
public class StockArray
{
    // instance variables - replace the example below with your own
    private Stock[] stock;
    private int numOfStock;

    /**
     * Constructor for objects of class StockArray
     * 
     * @param length given length of array
     */
    public StockArray(int length)
    {
        // initialise instance variables
        numOfStock = 0;
        stock = new Stock[length];
    }

    /**
     * Adds the stockat the specified index position and maintain the order of all elements in the array
     * and updates numOfStocks if the array is not full and the index is valid. 
     * Otherwise, the method does nothing.
     *
     * @param stock1 given stock to insert
     * @param index given index to insert stock1
     */
    public void insert(Stock stock1, int index)
    {
        // put your code here
        if (numOfStock < stock.length && index >= 0 && index <= numOfStock)
        {
            for (int i = numOfStock; i > index; i--)
            {
                stock[i] = stock[i - 1];
            }
            stock[index] = stock1;
            numOfStock++;
        }
    }

    /**
     * Swaps the stock at index1 with the stock at index2. If either index is out of bounds, does not changeanything.
     *
     * @param index1 to swap
     * @param index2 to swap
     */
    public void swap(int index1, int index2)
    {
        // put your code here
        if (index1 >= 0 && index1 < numOfStock && index2 >= 0 && index2 < numOfStock)
        {
            Stock temp = stock[index1];
            stock[index1] = stock[index2];
            stock[index2] = temp;
        }
    }

    /**
     * Gets the price for the stock in the array specified by the parameter symbol.If the stock is not in the array, returns -1. 
     *
     * @param symbol given symbol to find price
     * @return price of symbol
     */
    public double quote(String symbol)
    {
        // put your code here
        boolean found =  false;
        int index = 0;
        if (numOfStock > 0)
        {
            for (int x = 0; x < numOfStock; x++)
            {
                if (symbol.equals(stock[x].getSymbol()))
                {
                    index = x;
                    found = true;
                }
            }
        }

        if (found)
        {
            return stock[index].getPrice();            
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns a string containing all stocks in the array in the format [Stock[...], 
     * Stock[...], . . . Stock[...]], where each item Stock[...] is the string from the toString()
     * method of class Stockfor a stockin the array.
     *
     * @return stock in formatted string
     * 
     */
    @Override
    public String toString()
    {
        // put your code here
        String s = "[";
        if (numOfStock > 0)
        {
            s += stock[0].toString();
            for (int i = 1; i < numOfStock; i ++)
                s += ", " + stock[i].toString();
        }
        s = s + "]";
        return s;
    }
}

