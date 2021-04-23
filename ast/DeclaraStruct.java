package ast;

public class DeclaraStruct extends ETer {
   public DeclaraStruct(E struct, E var, E valores) {
     super(struct,var,valores);  
   }     
   public TipoE tipo() {return TipoE.DECLARASTRUCT;}
   public String toString() {return "declaraStruct(tipo:"+opnd1().toString()+","+opnd2().toString()+",{"+opnd3().toString()+"}";
   }
}