package ast;

public class InstFor extends EQuat {
   public InstFor(E opnd1, E opnd2, E opnd3, E opnd4) {
     super(opnd1,opnd2,opnd3,opnd4);  
   }     
   public TipoE tipo() {return TipoE.FOR;}
   public String toString() {
       return "for("+opnd1().toString()+","+opnd2().toString()+",pasoFor("+opnd3().toString()+"),\ncuerpo{"+opnd4().toString()+"})";
    }
}
