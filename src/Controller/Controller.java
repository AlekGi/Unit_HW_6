package Controller;

import java.util.Random;

public class Controller {

    public int[] createList(){
        Random random = new Random();
        return random.ints(1,100).limit(10).toArray();
    }
}
