package restaurant;

public class MainRestaurant {
    public static void main(String[] args){
        Menu newMenu = new Menu();
        MenuItem pizza = new MenuItem("Pizza",5.35,"A slice of pizza.", "Main Course");
        MenuItem iceCream = new MenuItem("Ice Cream", 4.95,"It's vanilla.","Dessert");
        newMenu.setMenuItems(pizza);
        newMenu.setMenuItems(iceCream);
        System.out.println(newMenu);
    }
}
