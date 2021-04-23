package ast;

public class TamArray extends EUn {
   public TamArray(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.TAMARRAY;}
   public String toString() {return "size("+opnd().toString()+")";}
}
