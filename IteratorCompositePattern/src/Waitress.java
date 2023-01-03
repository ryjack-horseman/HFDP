import java.awt.*;
import java.lang.management.MemoryUsage;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Waitress {

    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for(int i =0; i < breakfastItems.size(); i++){
            MenuItem item = breakfastItems.get(i);
            System.out.print(item.getName() + " ");
            System.out.println(item.getPrice() + " ");
            System.out.println(item.getDescription());
        }

        for(int i = 0; i < lunchItems.length; i++){
            MenuItem item = lunchItems[i];
            System.out.print(item.getName() + " ");
            System.out.println(item.getPrice() + " ");
            System.out.println(item.getDescription());
        }
    }
}
