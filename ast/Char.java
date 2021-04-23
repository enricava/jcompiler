package ast;

public class Char extends E {
  private String v;
  public Char(String v) {
   this.v = v;   
  }
  public String caracter() {return v;}
  public TipoE tipo() {return TipoE.CHAR;}   
  public String toString() {return v;}  
}
