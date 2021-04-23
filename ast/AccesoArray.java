package ast;

public class AccesoArray extends EBin {
   public AccesoArray(E nombre, E pos) {
     super(nombre,pos);  
   }     
   public TipoE tipo() {return TipoE.ACCESOARRAY;}
   public String toString() {return "posArray("+opnd1().toString()+","+opnd2().toString()+")";}
}
