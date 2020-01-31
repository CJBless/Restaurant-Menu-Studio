package restaurant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/* Menu contains several menu items
menu last updated date
 */
public class Menu {
    private String name;
    private ArrayList<MenuItem> fullMenu = new ArrayList<>();
    private LocalDate date;

    public Menu(String name){
        this.name = name;
    }

    void removeItem(String removeThis){
        ArrayList<MenuItem> removal = new ArrayList<>();
        for(MenuItem dish : fullMenu){
            if(dish.getDescription().contains(removeThis)){
                removal.add(dish);
            }
        }
        fullMenu.removeAll(removal);
    }

    void setFullMenu(ArrayList<MenuItem> newItems) {
        for(MenuItem old : fullMenu){
            old.newItem = false;
        }
        for(MenuItem newDish : newItems){
            if(fullMenu.contains(newDish)){
                System.out.println("Item: '" + newDish.getDescription() + "' already on menu");
            } else {
                newDish.newItem = true;
                fullMenu.add(newDish);
            }
        }
        date = LocalDate.now();
    }

    void displayMenu(){
        System.out.println(name.toUpperCase() + "\n");
        System.out.println("APPETIZERS\n");
        for(MenuItem dish : fullMenu){
            if(dish.category == "appetizer" && dish.newItem){
                System.out.println("$" + dish.getPrice() + "  NEW!\n" + dish.getDescription() + "\n");
            } else if(dish.category == "appetizer" && !dish.newItem){
                System.out.println(dish.getPrice() + "\n" + dish.getDescription() + "\n");
            }
        }
        System.out.println("ENTREES\n");
        for(MenuItem dish : fullMenu){
            if(dish.category == "entree" && dish.newItem){
                System.out.println("$" + dish.getPrice() + "  NEW!\n" + dish.getDescription() + "\n");
            } else if(dish.category == "entree" && !dish.newItem){
                System.out.println("$" + dish.getPrice() + "\n" + dish.getDescription() + "\n");
            }
        }
        System.out.println("DESSERTS");
        for(MenuItem dish : fullMenu){
            if(dish.category == "dessert" && dish.newItem){
                System.out.println("$" + dish.getPrice() + "  NEW!\n" + dish.getDescription() + "\n");
            } else if(dish.category == "dessert" && !dish.newItem){
                System.out.println("$" + dish.getPrice() + "\n" + dish.getDescription() + "\n");
            }
        }
        System.out.println("Last updated: " + date);

    }

    void displayMenuItem(String displayItem){
        ArrayList<MenuItem> match = new ArrayList<>();
        for(MenuItem items : fullMenu){
            if(items.equals(displayItem)){
                match.add(items);
            }
        }
        if(match.isEmpty()){
            System.out.println("Item not found on menu");
        } else {
            System.out.println(match);
        }
    }

//    public void
}
