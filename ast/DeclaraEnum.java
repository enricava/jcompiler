package ast;

public class DeclaraEnum extends ETer {
   public DeclaraEnum(E enumerado, E var, E valor) {
     super(enumerado,var,valor);  
   }     
   public TipoE tipo() {return TipoE.DECLARAENUM;}
   public String toString() {return "declaraEnum("+opnd1().toString()+":"+opnd2().toString()+","+opnd3().toString()+")"; }
}