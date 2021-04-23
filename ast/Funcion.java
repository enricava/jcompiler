package ast;

public class Funcion extends EBin {
   public Funcion(E nombre, E args) {
     super(nombre,args);  
   }     
   public TipoE tipo() {return TipoE.FUNCION;}
   public String toString() {return "funcion("+opnd1().toString()+",args("+opnd2().toString()+"))";}
}
