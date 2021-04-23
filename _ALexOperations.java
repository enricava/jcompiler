package alex;

import asint.ClaseLexica;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;   
  }
  
  public UnidadLexica unidadId() {
      return new UnidadLexica(alex.fila(), ClaseLexica.IDEN, alex.lexema());
   }

   public UnidadLexica unidadEnt() {
      return new UnidadLexica(alex.fila(), ClaseLexica.ENT, alex.lexema());
   }
   

   public UnidadLexica unidadSuma() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MAS, "+");
   }

   public UnidadLexica unidadResta() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MENOS, "-");
   }

   public UnidadLexica unidadMultiplicacion() {
      return new UnidadLexica(alex.fila(), ClaseLexica.POR, "*");
   }

   public UnidadLexica unidadDivision() {
      return new UnidadLexica(alex.fila(), ClaseLexica.DIV, "/");
   }
 
   public UnidadLexica unidadModulo() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MOD, "%");
   }

   public UnidadLexica unidadPAp() {
      return new UnidadLexica(alex.fila(), ClaseLexica.PAP, "(");
   }

   public UnidadLexica unidadPCierre() {
      return new UnidadLexica(alex.fila(), ClaseLexica.PCIERRE, ")");
   }
   
   public UnidadLexica unidadTEnt() {
      return new UnidadLexica(alex.fila(), ClaseLexica.TENT, "int");
   }

   public UnidadLexica unidadTBool() {
      return new UnidadLexica(alex.fila(), ClaseLexica.TBOOL, "bool");
   }

   public UnidadLexica unidadTChar() {
      return new UnidadLexica(alex.fila(), ClaseLexica.TCHAR, "char");
   }

   public UnidadLexica unidadTBin() {
      return new UnidadLexica(alex.fila(), ClaseLexica.TBIN, "bin");
   }

   public UnidadLexica unidadChar() {
      return new UnidadLexica(alex.fila(), ClaseLexica.CHAR, alex.lexema());
   }

   public UnidadLexica unidadBool() {
      return new UnidadLexica(alex.fila(), ClaseLexica.BOOL, alex.lexema());
   }

   public UnidadLexica unidadBin() {
      return new UnidadLexica(alex.fila(), ClaseLexica.BIN, alex.lexema());
   }

   public UnidadLexica unidadArray() {
      return new UnidadLexica(alex.fila(), ClaseLexica.ARRAY, "array");
   }

   
   public UnidadLexica unidadIgual() {
      return new UnidadLexica(alex.fila(), ClaseLexica.IGUAL, "==");
   }
   

   public UnidadLexica unidadComa() {
      return new UnidadLexica(alex.fila(), ClaseLexica.COMA, ",");
   }

   public UnidadLexica unidadEof() {
      return new UnidadLexica(alex.fila(), ClaseLexica.EOF, "<EOF>");
   }

   // Nuevos   
   public UnidadLexica unidadAsignacion() {
      return new UnidadLexica(alex.fila(), ClaseLexica.ASIGNA, "=");
   }

   public UnidadLexica unidadCAp() {
      return new UnidadLexica(alex.fila(), ClaseLexica.CAP, "[");
   }

   public UnidadLexica unidadCCierre() {
      return new UnidadLexica(alex.fila(), ClaseLexica.CCIERRE, "]");
   }
   
   public UnidadLexica unidadNegacion() {
      return new UnidadLexica(alex.fila(), ClaseLexica.NOT, "!");
   }

   public UnidadLexica unidadIncremento() {
      return new UnidadLexica(alex.fila(), ClaseLexica.INCR, "++");
   }

   public UnidadLexica unidadDecremento() {
      return new UnidadLexica(alex.fila(), ClaseLexica.DECR, "--");
   }

   public UnidadLexica unidadAnd() {
      return new UnidadLexica(alex.fila(), ClaseLexica.AND, "&");
   }

   public UnidadLexica unidadOr() {
      return new UnidadLexica(alex.fila(), ClaseLexica.OR, "|");
   }

   public UnidadLexica unidadDistinto() {
      return new UnidadLexica(alex.fila(), ClaseLexica.DISTINTO, "!=");
   }

   public UnidadLexica unidadMenor() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MENOR, "<");
   }

   public UnidadLexica unidadMayor() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MAYOR, ">");
   }

   public UnidadLexica unidadMenorIgual() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MAYORIGUAL, "<=");
   }

   public UnidadLexica unidadMayorIgual() {
      return new UnidadLexica(alex.fila(), ClaseLexica.MENORIGUAL, ">=");
   }

   public UnidadLexica unidadEstructura() {
      return new UnidadLexica(alex.fila(), ClaseLexica.STRUCT, "struct");
   }

   public UnidadLexica unidadLLaveAp() {
      return new UnidadLexica(alex.fila(), ClaseLexica.LLAVEAP, "{");
   }

   public UnidadLexica unidadLLaveCierre() {
      return new UnidadLexica(alex.fila(), ClaseLexica.LLAVECIERRE, "}");
   }

   public UnidadLexica unidadRetorno() {
      return new UnidadLexica(alex.fila(), ClaseLexica.RETURN, "return");
   }

   public UnidadLexica unidadDef() {
      return new UnidadLexica(alex.fila(), ClaseLexica.DEF, "def");
   }

   public UnidadLexica unidadEnumerado() {
      return new UnidadLexica(alex.fila(), ClaseLexica.ENUM, "enum");
   }

   public UnidadLexica unidadConstante() {
      return new UnidadLexica(alex.fila(), ClaseLexica.CONSTANTE, "const");
   }

   public UnidadLexica unidadBucleFor() {
      return new UnidadLexica(alex.fila(), ClaseLexica.FOR, "for");
   }

   public UnidadLexica unidadBucleWhile() {
      return new UnidadLexica(alex.fila(), ClaseLexica.WHILE, "while");
   }

   public UnidadLexica unidadExpIf() {
      return new UnidadLexica(alex.fila(), ClaseLexica.IF, "if");
   }

   public UnidadLexica unidadExpElif() {
      return new UnidadLexica(alex.fila(), ClaseLexica.ELIF, "elif");
   }

   public UnidadLexica unidadExpElse() {
      return new UnidadLexica(alex.fila(), ClaseLexica.ELSE, "else");
   }

   public UnidadLexica unidadPunto() {
      return new UnidadLexica(alex.fila(), ClaseLexica.PUNTO, ".");
   }

   public UnidadLexica unidadSize() {
      return new UnidadLexica(alex.fila(), ClaseLexica.SIZE, "size");
   }

   public UnidadLexica unidadLectura() {
      return new UnidadLexica(alex.fila(), ClaseLexica.READ, "read");
   }

   public UnidadLexica unidadEscritura() {
      return new UnidadLexica(alex.fila(), ClaseLexica.PRINT, "print");
   }
}
