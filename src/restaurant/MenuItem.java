package restaurant;

/*Constructor includes price, description, and category(app, main, dessert)
menu item is new or not = boolean?
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    String category;
    boolean newItem = false;

    MenuItem(double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }

    Double getPrice(){
        return price;
    }

    String getDescription() {
        return description;
    }

    public void setPrice(Double aPrice) {
        price = aPrice;
    }

    void setDescription(String aDescription){
        description = aDescription;
    }

    void setCategory(String aCategory){
        category = aCategory;
    }

    @Override
    public String toString() {
        String isNew;
        if(newItem){
            isNew = " NEW!";
        } else {
            isNew = "";
        }
        return "$" + price + isNew + "\n" + description + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}

