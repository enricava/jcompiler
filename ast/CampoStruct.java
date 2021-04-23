package ast;

public class CampoStruct extends EBin {
   public CampoStruct(E var, E campo) {
     super(var,campo);  
   }     
   public TipoE tipo() {return TipoE.CSTRUCT;}
   public String toString() {return "campoStruct("+opnd1().toString()+","+opnd2().toString()+")";}
}