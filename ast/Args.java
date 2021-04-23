package ast;

public class Args extends EBin {
   public Args(E op, E args) {
     super(op,args);  
   }     
   public TipoE tipo() {return TipoE.ARGS;}
   public String toString() {
    TipoE ultimo = opnd2().tipo();
    if(ultimo == TipoE.FIN) return opnd1().toString();
    else return opnd1().toString()+","+opnd2().toString();
  }
}