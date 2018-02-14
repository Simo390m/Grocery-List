public class GroceryItemOrder
{
    private String name;
    private double price;
    private int units;

    public double getSubTotals ()
    {
        return (this.price * this.units);
    }

    public GroceryItemOrder(String name)
    {
        this.name = name;
        this.units = 1;
    }

    public GroceryItemOrder(String name, double price, int units)
    {
        this.name = name;
        this.price = price;
        this.units = units;
    }

    @Override
    public String toString()
    {
        return "Grocery Item: " + name + ", "+ "Price: " + price + ", " + "Quantity: " + units;
    }
}
