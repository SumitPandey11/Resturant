package resturant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdate = new Date();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItem() {
        return menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public boolean isNewMenuItem(MenuItem menuItem){
            return ( menuItems.indexOf(menuItem) == menuItems.size() -1 );
    }

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
        this.lastUpdate = new Date(System.currentTimeMillis());
    }

}
