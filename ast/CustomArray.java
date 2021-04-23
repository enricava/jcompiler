// Array inicializado en cada posicion: int array 5 v = [2,3,4,5,6]
package ast;

public class CustomArray extends EBin {
   public CustomArray(E op, E ops) {
     super(op,ops);  
   }     
   public TipoE tipo() {return TipoE.CARRAY;}
   public String toString() {return opnd1().toString()+","+opnd2().toString();}
}