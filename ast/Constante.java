package ast;

public class Constante extends E {
   public Constante() {  
       super();
   }     
   public TipoE tipo() {return TipoE.CONSTANTE;}
   public String toString() {return "constante";}
}
