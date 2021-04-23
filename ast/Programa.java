package ast;

public class Programa extends EUn {
   public Programa(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.PROGRAMA;}
   public String toString() {return "Lista de instrucciones ( "+opnd().toString()+"\n)";}
}
