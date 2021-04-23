package ast;

public class AsignaStruct extends ETer {
   public AsignaStruct(E var, E campo, E val) {
     super(var,campo,val);  
   }     
   public TipoE tipo() {return TipoE.ASIGNASTRUCT;}
   public String toString() {return "asigna("+opnd1().toString()+":"+opnd2().toString()+","+opnd3().toString()+")";
   }
}