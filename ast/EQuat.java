package ast;

public abstract class EQuat extends E {
   private E opnd1;
   private E opnd2;
   private E opnd3;
   private E opnd4;
   public EQuat(E opnd1, E opnd2, E opnd3, E opnd4) {
     this.opnd1 = opnd1;
     this.opnd2 = opnd2;
     this.opnd3 = opnd3;
     this.opnd4 = opnd4;
   }
   public E opnd1() {return opnd1;}
   public E opnd2() {return opnd2;}    
   public E opnd3() {return opnd3;}    
   public E opnd4() {return opnd4;}    
}
