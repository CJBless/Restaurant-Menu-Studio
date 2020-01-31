package restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        MenuItem banhMi = new MenuItem(3.50, "Tofu Banh Mi: French baguette, crispy tofu, pickled carrot & daikon", "entree");
        MenuItem prawnToast = new MenuItem(4.00, "Prawn Toast: White bread, grilled prawns, egg battered and deep fried", "appetizer");
        MenuItem matchaTira = new MenuItem(6.00, "Matcha Tiramisu: Matcha soaked ladyfingers, vanilla mascarpone", "dessert");
        MenuItem chocRoll = new MenuItem(3.00, "Chocolate Spring Rolls: dark chocolate filled rice paper, fried, strawberry glaze", "dessert");
        banhMi.setPrice(5.00);
        ArrayList<MenuItem> firstMenu = new ArrayList<>();
        firstMenu.add(banhMi);
        firstMenu.add(prawnToast);
        firstMenu.add(matchaTira);
        Menu littleTokyo = new Menu("Fusion");
        littleTokyo.setFullMenu(firstMenu);

        littleTokyo.displayMenu();
        ArrayList<MenuItem> newAdditions = new ArrayList<>();
        newAdditions.add(chocRoll);
        littleTokyo.setFullMenu(newAdditions);
        littleTokyo.displayMenu();
        littleTokyo.removeItem("Matcha");
        littleTokyo.displayMenu();
//        littleTokyo.displayMenuItem("Prawn");
        ArrayList<MenuItem> menuUpdate = new ArrayList<>();
        menuUpdate.add(prawnToast);
        menuUpdate.add(matchaTira);
        littleTokyo.setFullMenu(menuUpdate);
        littleTokyo.displayMenu();
    }
}
