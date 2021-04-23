package ast;

public class Iden extends E {
  private String v;
  public Iden(String v) {
   this.v = v;   
  }
  public String iden() {return v;}
  public TipoE tipo() {return TipoE.IDEN;}   
  public String toString() {return v;}  
}
