public class Coin {

  private final int heads = 0;
  private final int tails = 1;
  private int face;

  public Coin (){
    flip();
  }

  public void flip(){
    face = (int) (Math.random() * 2);
  }

  public boolean isHeads(){
    return (face == heads);
  }

  public String toString(){
    String faceName;
    if (face == heads)
    faceName = "Heads";
    else
    faceName = "Tails";
    return faceName;
  }
}
