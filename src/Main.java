import Controller.Controller;
import Model.NumbersList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        NumbersList list = new NumbersList();

        int[] list1 = controller.createList();
        System.out.println(Arrays.toString(list1));
        double average1 = list.averageList(list1);

        int[] list2 = controller.createList();
        System.out.println(Arrays.toString(list2));
        double average2 = list.averageList(list2);

        list.compareList(average1, average2);

    }
}
