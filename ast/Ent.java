package ast;

public class Ent extends E {
  private String v;
  public Ent(String v) {
   this.v = v;   
  }
  public String ent() {return v;}
  public TipoE tipo() {return TipoE.ENT;}   
  public String toString() {return v;}  
}