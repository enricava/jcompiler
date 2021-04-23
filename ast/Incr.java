package ast;

public class Incr extends EUn {
   public Incr(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.INCR;}
   public String toString() {return "incr("+opnd().toString()+")";}
}
