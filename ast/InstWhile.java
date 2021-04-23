package ast;

public class InstWhile extends EBin {
   public InstWhile(E cond, E listInst) {
     super(cond,listInst);  
   }     
   public TipoE tipo() {return TipoE.WHILE;}
   public String toString() {return "while(condicion("+opnd1().toString()+"),\ncuerpo{"+opnd2().toString()+"\n})";}
}