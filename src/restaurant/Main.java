package restaurant;


public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem banhMi = new MenuItem("3.50", "Tofu Banh Mi: French baguette, crispy tofu, pickled carrot & daikon", "entree");
        MenuItem prawnToast = new MenuItem("4.00", "Prawn Toast: White bread, grilled prawns, egg battered and deep fried", "appetizer");
        MenuItem matchaTira = new MenuItem("6.00", "Matcha Tiramisu: Matcha soaked ladyfingers, vanilla mascarpone", "dessert");
        banhMi.setPrice("5.00");
        Menu littleTokyo = new Menu("Fusion");
        littleTokyo.setFullMenu(banhMi);
        littleTokyo.setFullMenu(prawnToast);
        littleTokyo.setFullMenu(matchaTira);

        littleTokyo.displayMenu();

    }
}
