package ast;

public class Asigna extends EBin {
   public Asigna(E var, E valor) {
     super(var,valor);  
   }     
   public TipoE tipo() {return TipoE.ASIGNA;}
   public String toString() {return "asigna("+opnd1().toString()+","+opnd2().toString()+")";}
}
