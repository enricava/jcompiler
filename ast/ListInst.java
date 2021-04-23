package ast;

public class ListInst extends EBin {
   public ListInst(E inst, E lista) {
     super(inst,lista);  
   }     
   public TipoE tipo() {return TipoE.LISTINST;}
   public String toString() {
    TipoE ultimo = opnd2().tipo();
    if(ultimo == TipoE.FIN) 
         return "\n"+opnd1().toString();
    else return "\n"+opnd1().toString()+","+opnd2().toString();
   }
}