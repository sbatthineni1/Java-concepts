package lists.al;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}

public class ArrayLists {
    public static void main(String[] args) {


        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "Produce", 5);
        groceryArray[2] = "Oranges";
        System.out.println(Arrays.toString(groceryArray));
        /*
        [GroceryItem[name=milk, type=Dairy, count=1], GroceryItem[name=apples, type=Produce, count=5], Oranges]
         */
        GroceryItem[] groceryLists = new GroceryItem[3];
        groceryLists[0] = new GroceryItem("milk");
        groceryLists[1] = new GroceryItem("apples", "Produce", 5);
        groceryLists[2] = new GroceryItem("apples", "Produce", 5);
        System.out.println(Arrays.toString(groceryLists));
        /*
        [GroceryItem[name=milk, type=Dairy, count=1], GroceryItem[name=apples, type=Produce, count=5],
        GroceryItem[name=apples, type=Produce, count=5]]
        Here we set the groceryLists to instance of new GroceryItem instead of Object.
        So it doesn't accept string, it only accepts instances of grocery Items.
        Here the length is fixed and cannot be changed after instatiation
         */

        ArrayList objectLists = new ArrayList();
        objectLists.add(new GroceryItem("butter"));
        objectLists.add("grapes");
        System.out.println(objectLists);
        /*
        [GroceryItem[name=butter, type=Dairy, count=1], grapes]
        whenever we create a list we need to specify the generic type inorder the lists to accept only those.
        Here since we did not specify the ArrayLists type hence it accepts everything,
        either new GroceryItem object or even just a string list object we created in first scenario.
        The ArrayLists is immutable we can add or delete the elements from our list as required.
                 */
        ArrayList<GroceryItem> groceryLists1 = new ArrayList<>();
        groceryLists1.add(new GroceryItem("butter"));
        groceryLists1.add(0, new GroceryItem("Cheese"));
        groceryLists1.add(new GroceryItem("grapes", "produce", 10));
        System.out.println(groceryLists1);
        groceryLists1.remove(1);
        System.out.println(groceryLists1);
        /*
        [GroceryItem[name=Cheese, type=Dairy, count=1], GroceryItem[name=butter, type=Dairy, count=1], GroceryItem[name=grapes, type=produce, count=10]]
        [GroceryItem[name=Cheese, type=Dairy, count=1], GroceryItem[name=grapes, type=produce, count=10]]
        Angle brackets include record GroceryItem now, which will now only consider groceryItems,
       Here we are telling the compiler to type check for the data it adds to the list
         */


    }
}
