package restaurant;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNew = true;

    public MenuItem(String itemName, double price, String description,String category){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public boolean getIsNew(){
        return isNew;
    }
    private void setIsNew(boolean isNew){
        this.isNew = isNew;
    }
}
