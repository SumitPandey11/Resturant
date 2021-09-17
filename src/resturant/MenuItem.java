package resturant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private String menuItemId;
    private String description;
    private double price;
    private String category;
    private Date createdOn;
    private boolean isNewItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }

    MenuItem(){

     }

     MenuItem(String description, String category, double price){
        this.menuItemId = description+category;
        this.description = description;
        this.category = category;
        this.price = price;
        this.createdOn = new Date();
    }

    public boolean isNewItem() {
        return isNewItem;
    }

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setNewItem(boolean newItem) {
        isNewItem = newItem;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void printMenueItem(){
          System.out.println("Description : " + this.description + " Category : " + this.category + " Price : " + this.price);
    }

}
