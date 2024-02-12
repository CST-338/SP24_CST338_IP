import java.util.HashMap;
import java.util.Objects;

/**
 * Used in a lesson on inheritance.
 *
 * @author drew a clinkenbeard
 */
public class DeliSandwich implements Sandwich {

  //Integer rather than int because of containers.
  private Integer slicesOfBread;
  private HashMap<String, Integer> fillings;

  public DeliSandwich(Integer bread, String filling){
    this.slicesOfBread = bread;
    HashMap<String, Integer> hashmap = new HashMap<>();
    hashmap.put(filling,1);
    this.fillings = hashmap;
  }

  public DeliSandwich(Integer slicesOfBread, HashMap<String,Integer> fillings) {
    this.slicesOfBread = slicesOfBread;
    this.fillings = fillings;
  }

  @Override
  public String listFilling(){
    StringBuilder sb = new StringBuilder();
    if(!fillings.isEmpty()){
      for (String key : fillings.keySet()){
        sb.append(String.valueOf(String.format("%s%n", key)).repeat(Math.max(0, fillings.get(key))));
      }
    }else{
      return "no fillings: not a sandwich.";
    }
    return sb.toString();
  }

  /**
   * @return a String about sandwiches
   */
  @Override
  public String toString() {
    return "This " + this.getClass().getName()
        + String.format(" is %n")
        + (slicesOfBread > 1 ? String.format("Bread%n") : "")
        + listFilling()
        + "bread.";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    DeliSandwich sandwich = (DeliSandwich) o;

    if (!Objects.equals(slicesOfBread, sandwich.slicesOfBread)) {
      return false;
    }
    return Objects.equals(fillings, sandwich.fillings);
  }

  @Override
  public int hashCode() {
    int result = slicesOfBread != null ? slicesOfBread.hashCode() : 0;
    result = 31 * result + (fillings != null ? fillings.hashCode() : 0);
    return result;
  }
}

