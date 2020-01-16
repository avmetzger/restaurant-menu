package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){
        Menu newMenu = new Menu();
        List<String> category = new ArrayList<>(Arrays.asList("Appetizer", "Entree", "Dessert"));
        Scanner input = new Scanner(System.in);

        MenuItem branFlakes = new MenuItem("Bran Flakes",4.35, "Wheat bran flakes in a bowl of fresh milk", "Entree");
        MenuItem fruitBowl = new MenuItem("Fruit Bowl", 6.45, "It's some fruit!", "Side");
        MenuItem eggs = new MenuItem("Eggs", 4.50, "A couple of eggs, prepared chef's choice",  "Entree");
        MenuItem pancakes = new MenuItem("Pancakes",5.50,"It's basically regular cake","Dessert");

        newMenu.addMenuItem(branFlakes);
        newMenu.addMenuItem(fruitBowl);
        newMenu.addMenuItem(eggs);
        newMenu.addMenuItem(pancakes);

        newMenu.printMenu();
        System.out.println(pancakes.toString());
        newMenu.removeMenuItem(pancakes);
        newMenu.printMenu();
        newMenu.addMenuItem(eggs);
    }
}
