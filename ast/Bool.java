package ast;

public class Bool extends E {
  private String v;
  public Bool(String v) {
   this.v = v;   
  }
  public String bool() {return v;}
  public TipoE tipo() {return TipoE.BOOL;}   
  public String toString() {return v;}  
}
