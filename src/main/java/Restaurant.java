import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The driver for running the Sandwich and burger code.
 * @author drew a. Clinkenbeard
 */
public class Restaurant {
  public static void main(String[] args) {

    List<Sandwich> menu = new ArrayList<>();
    HashMap<String,Integer> fillings = new HashMap<>();
    fillings.put("Emmental",2);
    fillings.put("Pepper Jack",2);

    DeliSandwich sandwich = new DeliSandwich(2, fillings);
    Burger burger = new Burger();

    menu.add(sandwich);
    menu.add(burger);

    for(Sandwich s : menu){
      System.out.println(s);
    }

  }
}
