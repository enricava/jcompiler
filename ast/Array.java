// Array inicializado con el mismo valor: int array 5 v = {0} <=> v = [0,0,0,0,0]
package ast;

public class Array extends EUn {
   public Array(E opnd) {
     super(opnd);  
   }     
   public TipoE tipo() {return TipoE.ARRAY;}
   public String toString() {return "array{"+opnd().toString()+"}";}
}
