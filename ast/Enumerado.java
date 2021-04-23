package ast;

public class Enumerado extends EBin {
   public Enumerado(E opnd1, E opnd2) {
     super(opnd1,opnd2);  
   }     
   public TipoE tipo() {return TipoE.ENUMERADO;}
   public String toString() {return "enumerado(nombre("+opnd1().toString()+"),datos{"+opnd2().toString()+"})";}
}
