package ast;

public class TBool extends E {
   public TBool() {  
       super();
   }     
   public TipoE tipo() {return TipoE.TBOOL;}
   public String toString() {return "bool";}
}
