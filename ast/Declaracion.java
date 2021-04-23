// Declaraciones de Struct y Enum
package ast;

public class Declaracion extends EBin {
   public Declaracion(E c, E dec) {
     super(c,dec);  
   }     
   public TipoE tipo() {return TipoE.DECLARACION;}
   public String toString() {
       TipoE primero = opnd1().tipo();
       if(primero == TipoE.FIN) return "declara("+opnd2().toString()+")";
       else return "declara("+opnd1().toString()+ " " +opnd2().toString()+")";
    }
}
