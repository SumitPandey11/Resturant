package resturant;

public class Resturant {
    public static void main(String[] args){
        Menu menue = new Menu();
        MenuItem menuItem1 = new MenuItem("d1","appetizer",14.50);
        MenuItem menuItem2 = new MenuItem("d2","main course",34.50);
        MenuItem menuItem3 = new MenuItem("d3","dessert",24.50);
        MenuItem menuItem4 = new MenuItem("d1","appetizer",14.50);

        menue.addMenuItem(menuItem1);
        menue.addMenuItem(menuItem2);
        menue.addMenuItem(menuItem3);
        menue.addMenuItem(menuItem4);

        System.out.println( " This Menu last Updated on : " + menue.getLastUpdate() );

        System.out.println("menuItem1.equals(menuItem2) ? " + menuItem1.equals(menuItem4));
        System.out.println("menuItem1.isNewItem() ? " + menue.isNewMenuItem(menuItem1));
        System.out.println("menuItem2.isNewItem() ? " + menue.isNewMenuItem(menuItem2));
        System.out.println("menuItem3.isNewItem() ? " + menue.isNewMenuItem(menuItem3));
        System.out.println("menuItem4.isNewItem() ? " + menue.isNewMenuItem(menuItem4));

        menue.printMenu();

        menue.removeMenuItem(menuItem1);

        System.out.println("*** After Removing menuItem1 *** ");
        menue.printMenu();

    }
}
