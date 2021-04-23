package ast;

public class InstElse extends EUn {
   public InstElse(E listInst) {
     super(listInst);  
   }     
   public TipoE tipo() {return TipoE.ELSE;}
   public String toString() {return "else{"+opnd().toString()+"}";}
}
