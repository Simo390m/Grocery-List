public class GroceryList
{

    private GroceryItemOrder[] groceryItem;
    private int pointer;

    public double getGrandTotal ()
    {
        double sum = 0;

        for (GroceryItemOrder groceryItem: groceryItem )
        {
            sum += groceryItem.getSubTotals();
        }

        return sum;

    }

    public GroceryList()
    {
        this.groceryItem = new GroceryItemOrder[10];
    }

    public void addItem(GroceryItemOrder gio)
    {
        groceryItem[pointer] = gio;
        pointer++;
    }

    @Override
    public String toString()
    {
        String value = "";
        for (GroceryItemOrder gio: this.groceryItem) {
            value += gio + "\n";
        }
        return "GroceryList" + value;
    }
}
