package ast;

public class InstIf extends ETer {
   public InstIf(E cond, E listInst, E elses) {
     super(cond, listInst, elses);  
   }     
   public TipoE tipo() {return TipoE.IF;}
   public String toString() {return "if(condicion("+opnd1().toString()+"),\ncuerpo{"+opnd2().toString()+ "}\n," +opnd3().toString()+")";}
}