package ast;

public class AsignaArray extends ETer {
   public AsignaArray(E struct, E var, E valores) {
     super(struct,var,valores);  
   }     
   public TipoE tipo() {return TipoE.ASIGNAARRAY;}
   public String toString() {return "asigna("+opnd1().toString()+"["+opnd2().toString()+"],"+opnd3().toString()+")";
   }
}