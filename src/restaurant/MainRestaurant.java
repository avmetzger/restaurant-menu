package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRestaurant {
    public static void main(String[] args){
        Menu newMenu = new Menu();
        List<String> category = new ArrayList<>(Arrays.asList("Appetizer", "Entree", "Dessert"));
        System.out.println(newMenu.toString());
    }
}
