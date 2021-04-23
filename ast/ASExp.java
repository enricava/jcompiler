package ast;

public class ASExp {

  //  Lista de instrucciones
  public E programa(E ls) {return new Programa(ls);}
  public E listinst(E inst, E lista) {return new ListInst(inst,lista);}
  public E fin() {return new Fin();}
  public E instFor(E f1, E f2, E f3, E cuerpo) {return new InstFor(f1,f2,f3,cuerpo);}
  public E inicioFor(E opnd1, E opnd2) {return new InicioFor(opnd1,opnd2);}
  public E asigna(E var, E valor) {return new Asigna(var,valor);}
  public E instWhile(E cond, E listInst) {return new InstWhile(cond, listInst);}
  public E instIf(E cond, E listInst, E elses) {return new InstIf(cond, listInst, elses);}
  public E instElif(E cond, E listInst, E elses) {return new InstElif(cond, listInst, elses);}
  public E instElse(E listInst) {return new InstElse(listInst);}
  public E instRead(E var) {return new InstRead(var);}
  public E instPrint(E var) {return new InstPrint(var);}
  public E struct(E nombre, E campos) {return new Struct(nombre, campos);}
  public E campos(E tipo,E nombre, E campos) {return new Campos(tipo, nombre, campos);}
  public E declaraFunc(E tipo,E nombre, E argsDef, E cuerpo, E op) {return new DeclaraFunc(tipo, nombre, argsDef, cuerpo, op);}
  public E argumentosDef(E tipo,E nombre, E args) {return new ArgumentosDef(tipo, nombre, args);}
  public E enumerado(E nombre, E datos) {return new Enumerado(nombre, datos);}
  public E enumerados(E nombre, E datos) {return new Enumerados(nombre, datos);}
  public E declaraStruct(E struct, E var, E valores) {return new DeclaraStruct(struct, var, valores);}
  public E declaraEnum(E enumerado,E var, E valor) {return new DeclaraEnum(enumerado, var, valor);}
  public E asignaStruct(E var, E campo, E valor) {return new AsignaStruct(var, campo, valor);}
  public E asignaArray(E var,E pos, E valor) {return new AsignaArray(var, pos, valor);}
  public E declaraBasico(E c,E tipo, E asig) {return new DeclaraBasico(c, tipo, asig);}
  public E declaracion(E c,E dec) {return new Declaracion(c, dec);}


  //  Operaciones binarias
  public E suma(E opnd1, E opnd2) {return new Suma(opnd1,opnd2);}
  public E resta(E opnd1, E opnd2) {return new Resta(opnd1,opnd2);}  
  public E mul(E opnd1, E opnd2) {return new Mul(opnd1,opnd2);}  
  public E div(E opnd1, E opnd2) {return new Div(opnd1,opnd2);}  
  public E mod(E opnd1, E opnd2) {return new Mod(opnd1,opnd2);} 
  public E igual(E opnd1, E opnd2) {return new Igual(opnd1,opnd2);}
  public E or(E opnd1, E opnd2) {return new Or(opnd1,opnd2);}
  public E and(E opnd1, E opnd2) {return new And(opnd1,opnd2);}
  public E distinto(E opnd1, E opnd2) {return new Distinto(opnd1,opnd2);}
  public E menor(E opnd1, E opnd2) {return new Menor(opnd1,opnd2);}
  public E mayor(E opnd1, E opnd2) {return new Mayor(opnd1,opnd2);}
  public E menorIgual(E opnd1, E opnd2) {return new MenorIgual(opnd1,opnd2);}
  public E mayorIgual(E opnd1, E opnd2) {return new MayorIgual(opnd1,opnd2);}
  public E funcion(E opnd1, E opnd2) {return new Funcion(opnd1,opnd2);}
  public E args(E opnd1, E opnd2) {return new Args(opnd1,opnd2);}
  public E campostruct(E var, E campo) {return new CampoStruct(var,campo);}
  public E coleccion(E array) {return new Coleccion(array);}
  public E array(E array) {return new Array(array);}
  public E customArray(E op, E ops) {return new CustomArray(op, ops);}
  public E accesoArray(E nombre, E pos) {return new AccesoArray(nombre, pos);}
  public E tamArray(E nombre) {return new TamArray(nombre);}

  //  Operaciones unarias
  public E incr(E opnd) {return new Incr(opnd);}  
  public E decr(E opnd) {return new Decr(opnd);}  
  public E not(E opnd) {return new Not(opnd);} 
  
  //  Valores Básicos
  public E ent(String v)       {return new Ent(v);}      
  public E iden(String v)      {return new Iden(v);}      
  public E bool(String v)      {return new Bool(v);}      
  public E caracter(String v)  {return new Char(v);}      
  public E bin(String v)       {return new Bin(v);}   
  
  // Palabras reservadas (tipos)
  public E tent() {return new TEnt();}
  public E tbin() {return new TBin();}
  public E tchar() {return new TChar();}
  public E tbool() {return new TBool();}
  public E tarray(E tam, E tipo) {return new TArray(tam, tipo);}
  public E constante() {return new Constante();} 

}
