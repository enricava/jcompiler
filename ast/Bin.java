package ast;

public class Bin extends E {
  private String v;
  public Bin(String v) {
   this.v = v;   
  }
  public String bin() {return v;}
  public TipoE tipo() {return TipoE.BIN;}   
  public String toString() {return v;}  
}
