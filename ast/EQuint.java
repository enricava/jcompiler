package ast;

public abstract class EQuint extends E {
   private E opnd1;
   private E opnd2;
   private E opnd3;
   private E opnd4;
   private E opnd5;
   public EQuint(E opnd1, E opnd2, E opnd3, E opnd4, E opnd5) {
     this.opnd1 = opnd1;
     this.opnd2 = opnd2;
     this.opnd3 = opnd3;
     this.opnd4 = opnd4;
     this.opnd5 = opnd5;
   }
   public E opnd1() {return opnd1;}
   public E opnd2() {return opnd2;}    
   public E opnd3() {return opnd3;}    
   public E opnd4() {return opnd4;}    
   public E opnd5() {return opnd5;}    
}
