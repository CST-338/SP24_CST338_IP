public class Burger extends DeliSandwich{

  public Burger(){
    this("Beef Patty");
  }
  public Burger(String filling){
    super(2,filling);
  }

  @Override
  public String toString(){
    return "Bun burger patty bun";
  }

}
