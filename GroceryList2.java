import java.util.ArrayList;

public class GroceryList2
{
    private ArrayList<GroceryItemOrder> groceryArrayList;

    public GroceryList2 ()
    {
        this.groceryArrayList = new ArrayList<>();
    }

    public double getGrandTotal ()
    {
        double sum = 0;

        for (GroceryItemOrder groceryItem: groceryArrayList )
        {
            sum += groceryItem.getSubTotals();
        }

        return sum;

    }

    public void add(GroceryItemOrder groceryItemOrder)
    {
        this.groceryArrayList.add(groceryItemOrder);
    }

    @Override
    public String toString()
    {
        String value = "";
        for (GroceryItemOrder gio: this.groceryArrayList) {
            value += gio + "\n";
        }
        return "GroceryList" + value;
    }
}
