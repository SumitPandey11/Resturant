package resturant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private Date lastUpdate = new Date();
    private HashMap<String, MenuItem> menuItems = new HashMap<>();
    private String newMenuItemId;

    public HashMap getMenuItem() {
        return menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public boolean isNewMenuItem(MenuItem menuItem){
           if(menuItem.getMenuItemId().equals(this.newMenuItemId)) {
               return true;
           }
           else {
               return false;
           }
    }

    public void addMenuItem(MenuItem menuItem){
        if( ! this.menuItems.containsKey(menuItem.getMenuItemId())) {
            this.menuItems.put(menuItem.getMenuItemId(), menuItem);
            this.newMenuItemId = menuItem.getMenuItemId();
            this.lastUpdate = new Date(System.currentTimeMillis());
        } else{
            System.out.println(menuItem.getDescription() + " this item is already in the menu");
        }
    }

    public boolean removeMenuItem(MenuItem menuItem){
        if(this.menuItems.remove(menuItem.getMenuItemId()) != null ){
            this.lastUpdate = new Date(System.currentTimeMillis());
            return true;
        }
        else{
            return false;
        }
    }

    public void printMenu(){
        for(MenuItem m : menuItems.values()){
            m.printMenueItem();
        }
    }


}
