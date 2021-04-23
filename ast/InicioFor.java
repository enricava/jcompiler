package ast;

public class InicioFor extends EBin {
   public InicioFor(E opnd1, E opnd2) {
     super(opnd1,opnd2);  
   }     
   public TipoE tipo() {return TipoE.INICIOFOR;}
   public String toString() {return "inicioFor("+opnd1().toString()+","+opnd2().toString()+")";}
}
