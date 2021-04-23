// Declaraciones de variables de tipos basicos: (const) int, bool,... (valor)
package ast;

public class DeclaraBasico extends ETer {
   public DeclaraBasico(E c, E tipo, E asig) {
     super(c,tipo,asig);  
   }     
   public TipoE tipo() {return TipoE.DECLARABASICO;}
   public String toString() {
    TipoE primero = opnd1().tipo();
    if(primero == TipoE.FIN) 
         return "declara("+opnd2().toString()+":"+opnd3().toString()+")";
    else return "declara("+opnd1().toString()+" "+opnd2().toString()+":"+opnd3().toString()+")";
   }
}