package restaurant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;

public class Menu {
    private List<MenuItem> menuItems;
    private LocalDateTime lastUpdated;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdated = LocalDateTime.now();
    }

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem item) {
        if (this.menuItems.contains(item)) {
            System.out.println(item.getItemName() + " is already on the menu.");
        } else {
            item.setIsNew(true);
            menuItems.add(item);
            this.lastUpdated = LocalDateTime.now();
        }
    }

    public void removeMenuItem(MenuItem item) {
        if (menuItems.contains(item)) {
            menuItems.remove(item);
        } else {
            System.out.println("Menu Item not found on menu.");
        }
        this.lastUpdated = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void printMenu() {
        System.out.println("Menu:");
        for (MenuItem item : this.menuItems) {
            System.out.println(item + "\n-------------");
        }
        System.out.println("\nLast Updated:" + lastUpdated);
    }

    @Override
    public String toString() {
        return "Menu:\n" + menuItems + "\nLast Updated:" + lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuItems, menu.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems);
    }
}
