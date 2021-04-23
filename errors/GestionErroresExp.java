package errors;

import alex.UnidadLexica;

public class GestionErroresExp {
   public void errorLexico(int fila, String lexema) {
     System.out.println("ERROR fila "+fila+": Caracter desexperado : "+lexema); 
     System.exit(1);
   }  
   public void errorSintactico(UnidadLexica unidadLexica) {
     System.out.print("ERROR fila "+unidadLexica.fila()+": Elemento desexperado "+unidadLexica.value);
     System.exit(1);
   }
}
