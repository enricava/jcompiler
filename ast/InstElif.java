package ast;

public class InstElif extends ETer {
   public InstElif(E cond, E listInst, E elses) {
     super(cond, listInst, elses);  
   }     
   public TipoE tipo() {return TipoE.ELIF;}
   public String toString() {return "elif(condicion("+opnd1().toString()+"),\ncuerpo{"+opnd2().toString()+"\n},"+opnd3().toString()+")";}
}