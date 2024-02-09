import java.util.HashMap;
import java.util.Objects;

/**
 * Used in a lesson on inheritance.
 *
 * @author drew a clinkenbeard
 */
public class DeliSandwich {

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

  /**
   * Using a StringBuilder because we will use a loop later...
   *
   * @return a String about sandwiches
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("This ").append(this.getClass().getName());
    sb.append(" is ");
    sb.append(slicesOfBread > 1 ? "Bread":"");
    for (String key : fillings.keySet()){
      sb.append(key).append("\n");
    }
    sb.append(" bread.");
    return sb.toString();
  }

  public Integer getSlicesOfBread() {
    return slicesOfBread;
  }

  public void setSlicesOfBread(Integer slicesOfBread) {
    this.slicesOfBread = slicesOfBread;
  }

  public HashMap<String, Integer> getFilling() {
    return fillings;
  }

  public void setFilling(HashMap<String, Integer> filling) {
    this.fillings = filling;
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
    return fillings.equals(sandwich.fillings);
  }

  @Override
  public int hashCode() {
    int result = slicesOfBread != null ? slicesOfBread.hashCode() : 0;
    result = 31 * result + fillings.hashCode();
    return result;
  }
}

