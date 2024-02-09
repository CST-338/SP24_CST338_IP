/**
 * Used in a lesson on inheritance.
 * @author drew a clinkenbeard
 */
public class DeliSandwich {
  //Integer rather than int because of containers.
  private Integer slicesOfBread;
  private String filling;

  public DeliSandwich(Integer slicesOfBread, String filling) {
    this.slicesOfBread = slicesOfBread;
    this.filling = filling;
  }

  /**
   * Using a StringBuilder because we will use a loop later...
   * @return a String about sandwiches
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("This sandwhich has ");
    sb.append(filling);
    sb.append(" between ");
    sb.append(slicesOfBread);
    sb.append(" slices of bread.");
    return sb.toString();
  }
}

