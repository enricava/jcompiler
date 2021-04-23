package ast;

public class Struct extends EBin {
   public Struct(E opnd1, E opnd2) {
     super(opnd1,opnd2);  
   }     
   public TipoE tipo() {return TipoE.STRUCT;}
   public String toString() {return "sruct("+opnd1().toString()+", campos{"+opnd2().toString()+"})";}
}
