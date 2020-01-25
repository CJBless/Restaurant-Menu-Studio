package restaurant;

/*Constructor includes price, description, and category(app, main, dessert)
menu item is new or not = boolean?
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private String price = "$";
    private String description;
    String category;
    boolean newItem = false;
    String dateAdded;

    MenuItem(String price, String description, String category){
        this.price += price;
        this.description = description;
        this.category = category;
    }

    String getPrice(){
        return price;
    }

    String getDescription() {
        return description;
    }

    public void setPrice(String aPrice) {
        price = aPrice;
    }

    void setDescription(String aDescription){
        description = aDescription;
    }

    void setCategory(String aCategory){
        category = aCategory;
    }

    void setDateAdded(){
        DateFormat format = new SimpleDateFormat("MMM d, yyyy");
        Date newDate = new Date();
        dateAdded = format.format(newDate);
    }
}
