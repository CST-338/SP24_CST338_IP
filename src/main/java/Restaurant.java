import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant {
  public static void main(String[] args) {

    List<DeliSandwich> menu = new ArrayList<>();
    DeliSandwich sandwich = new DeliSandwich(2, "Ham and Cheese");
    Burger burger = new Burger();

    menu.add(sandwich);
    menu.add(burger);

    for(DeliSandwich s : menu){
      System.out.println(s);
    }

  }
}
