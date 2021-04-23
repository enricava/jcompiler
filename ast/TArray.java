package ast;

public class TArray extends EBin {
    public TArray(E opnd1, E opnd2) {
        super(opnd1,opnd2);  
    }    
   public TipoE tipo() {return TipoE.TARRAY;}
   public String toString() {return "array(tam(" + opnd1().toString() + "),tipo(" + opnd2().toString()+ "))";}
}
