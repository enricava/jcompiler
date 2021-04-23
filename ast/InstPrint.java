package ast;

public class InstPrint extends EUn {
   public InstPrint(E var) {
     super(var);  
   }     
   public TipoE tipo() {return TipoE.PRINT;}
   public String toString() {return "print("+opnd().toString()+")";}
}
