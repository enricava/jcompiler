// Para legibilidad del array
package ast;

public class Coleccion extends EUn {
   public Coleccion(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.COLECCION;}
   public String toString() {return "array["+opnd().toString()+"]";}
}
