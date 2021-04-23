package ast;

public class InstRead extends EUn {
   public InstRead(E var) {
     super(var);  
   }     
   public TipoE tipo() {return TipoE.READ;}
   public String toString() {return "read("+opnd().toString()+")";}
}
