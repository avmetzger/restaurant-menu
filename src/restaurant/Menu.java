package restaurant;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Menu {
    private List<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
    }
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
    public void setMenuItems(MenuItem item){
        menuItems.add(item);
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }
}
