package ast;

public class Fin extends E {
   public Fin() {  
       super();
   }     
   public TipoE tipo() {return TipoE.FIN;}
   public String toString() {return "-";}
}
