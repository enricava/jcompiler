package ast;

public abstract class ETer extends E {
   private E opnd1;
   private E opnd2;
   private E opnd3;
   public ETer(E opnd1, E opnd2, E opnd3) {
     this.opnd1 = opnd1;
     this.opnd2 = opnd2;
     this.opnd3 = opnd3;
   }
   public E opnd1() {return opnd1;}
   public E opnd2() {return opnd2;}    
   public E opnd3() {return opnd3;}    
}
