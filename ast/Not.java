package ast;

public class Not extends EUn {
   public Not(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.NOT;}
   public String toString() {return "not("+opnd().toString()+")";}
}
