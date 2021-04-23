package ast;

public class Campos extends ETer {
   public Campos(E opnd1, E opnd2, E opnd3) {
     super(opnd1,opnd2, opnd3);  
   }     
   public TipoE tipo() {return TipoE.CAMPOS;}
   public String toString() {
    TipoE ultimo = opnd3().tipo();
    if(ultimo == TipoE.FIN) return opnd1().toString()+":"+opnd2().toString();
    else return opnd1().toString()+":"+opnd2().toString()+","+opnd3().toString();
    }
}
