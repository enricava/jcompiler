package ast;

public class Decr extends EUn {
   public Decr(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.DECR;}
   public String toString() {return "decr("+opnd().toString()+")";}
}
