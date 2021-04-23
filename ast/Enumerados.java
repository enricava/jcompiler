package ast;

public class Enumerados extends EBin {
   public Enumerados(E opnd1, E opnd2) {
     super(opnd1,opnd2);  
   }     
   public TipoE tipo() {return TipoE.ENUMERADOS;}
   public String toString() {
    TipoE ultimo = opnd2().tipo();
       if(ultimo == TipoE.FIN) 
            return opnd1().toString();
       else return opnd1().toString()+","+opnd2().toString();
    }
}
