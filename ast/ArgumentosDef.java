package ast;

public class ArgumentosDef extends ETer {
   public ArgumentosDef(E tipo, E arg, E args) {
     super(tipo,arg,args);  
   }     
   public TipoE tipo() {return TipoE.ARGSDEF;}
   public String toString() {
    TipoE ultimo = opnd3().tipo();
    if(ultimo == TipoE.FIN) 
         return opnd1().toString()+":"+opnd2().toString();
    else return opnd1().toString()+":"+opnd2().toString()+","+opnd3().toString();
   }
}