package ast;

public class DeclaraFunc extends EQuint {
   public DeclaraFunc(E opnd1, E opnd2, E opnd3, E opnd4, E opnd5) {
     super(opnd1,opnd2,opnd3,opnd4,opnd5);  
   }     
   public TipoE tipo() {return TipoE.DECLARAFUNC;}
   public String toString() {return "declaraFunc("+opnd1().toString()+":"+opnd2().toString()+","
                                    +"args("+ opnd3().toString()+"),cuerpo{"+opnd4().toString()+"},return("+opnd5().toString()+"))";}
}
