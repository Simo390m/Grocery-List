import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryMain
{
    static File groceryListFile = new File("groceryItems.txt");

    public static void main(String[] args)
    {

        GroceryList gL = getGroceryListFromFile(groceryListFile);

        //ArrayList appliance
        //GroceryList2 groceryList2 = new GroceryList2();



        GroceryItemOrder gio = new GroceryItemOrder("Paprika", 1.5, 1);
        GroceryItemOrder gio1 = new GroceryItemOrder("Apple", 6.5, 1);
        GroceryItemOrder gio2 = new GroceryItemOrder("Pear", 4.5, 1);
        GroceryItemOrder gio3 = new GroceryItemOrder("Tomato", 4.25, 1);
        GroceryItemOrder gio4 = new GroceryItemOrder("Milk", 10.0, 1);
        GroceryItemOrder gio5 = new GroceryItemOrder("Cheese", 6.5, 1);
        GroceryItemOrder gio6 = new GroceryItemOrder("Orange", 1.8, 1);
        GroceryItemOrder gio7 = new GroceryItemOrder("Curry", 12.5, 1);
        GroceryItemOrder gio8 = new GroceryItemOrder("Ginger", 25.0, 1);
        GroceryItemOrder gio9 = new GroceryItemOrder("Lemongrass", 10.0, 1);

        /*gL.addItem(gio);
        gL.addItem(gio1);
        gL.addItem(gio2);
        gL.addItem(gio3);
        gL.addItem(gio4);
        gL.addItem(gio5);
        gL.addItem(gio6);
        gL.addItem(gio7);
        gL.addItem(gio8);
        gL.addItem(gio9);*/

        //ArrayList Appliance
        /*groceryList2.add(gio);
        groceryList2.add(gio1);
        groceryList2.add(gio2);
        groceryList2.add(gio3);
        groceryList2.add(gio4);
        groceryList2.add(gio5);
        groceryList2.add(gio6);
        groceryList2.add(gio7);
        groceryList2.add(gio8);
        groceryList2.add(gio9);*/
        System.out.println(gL);
    }

    public static GroceryList getGroceryListFromFile(File file) {
        GroceryList groceryList = new GroceryList();
        Scanner scanner = null;

        try
        {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                groceryList.addItem(new GroceryItemOrder(scanner.nextLine()));
            }

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return groceryList;
    }


}