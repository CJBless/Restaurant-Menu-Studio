package restaurant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* Menu contains several menu items
menu last updated date
 */
public class Menu {
    private String name;
    private ArrayList<MenuItem> appMenu = new ArrayList<>();
    private ArrayList<MenuItem> entreeMenu = new ArrayList<>();
    private ArrayList<MenuItem> dessMenu = new ArrayList<>();
    private String date;

    public Menu(String name){
        this.name = name;
    }

    private void setDate() {
        DateFormat format = new SimpleDateFormat("MMM d, yyyy");
        Date updated = new Date();
        date = format.format(updated);
    }

    void setFullMenu(MenuItem newItem) {
        newItem.setDateAdded();
        newItem.newItem = true;
        if(newItem.category == "appetizer"){
            appMenu.add(newItem);
        } else if(newItem.category == "entree"){
            entreeMenu.add(newItem);
        } else {
            dessMenu.add(newItem);
        }
        setDate();
    }

    void displayMenu(){
        System.out.println(name.toUpperCase() + "\n");
        System.out.println("APPETIZERS\n");
        for(MenuItem apps : appMenu){
            if(!apps.dateAdded.equals(date)){
                apps.newItem = false;
            }
            if(apps.newItem){
                System.out.println(apps.getPrice() + "  NEW!\n" + apps.getDescription() + "\n");
            } else {
                System.out.println(apps.getPrice() + "\n" + apps.getDescription() + "\n");
            }
        }
        System.out.println("ENTREES\n");
        for(MenuItem ent : entreeMenu){
            if(!ent.dateAdded.equals(date)){
                ent.newItem = false;
            }
            if(ent.newItem){
                System.out.println(ent.getPrice() + "  NEW!\n" + ent.getDescription() + "\n");
            } else {
                System.out.println(ent.getPrice() + "\n" + ent.getDescription() + "\n");
            }
        }
        System.out.println("DESSERTS");
        for(MenuItem dess : dessMenu){
            if(!dess.dateAdded.equals(date)){
                dess.newItem = false;
            }
            if(dess.newItem){
                System.out.println(dess.getPrice() + "  NEW!\n" + dess.getDescription() + "\n");
            } else {
                System.out.println(dess.getPrice() + "\n" + dess.getDescription() + "\n");
            }
        }
        System.out.println("Last updated: " + date);

    }

//    public void
}
