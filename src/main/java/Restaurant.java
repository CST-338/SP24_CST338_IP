import java.util.ArrayList;
import java.util.List;

public class Restaurant {

  public static void main(String[] args) {
    DeliSandwich sandwich = new DeliSandwich(2, "Ham and Cheese");

    List<DeliSandwich> menu = new ArrayList<>();
    menu.add(sandwich);

    menu.add(new Burger("Beef patty"));

    for(DeliSandwich s : menu){
      System.out.println(s);
    }
  }

}
