package alex;

import errors.GestionErroresExp;

%%
%cup
%line
%class AnalizadorLexicoExp
%unicode
%public

%{
  private ALexOperations ops;
  private GestionErroresExp errores;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public void fijaGestionErrores(GestionErroresExp errores) {
   this.errores = errores;
  }
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

comentario = //[^\n]*
tent = int
tbool = bool 
tchar = char
tbin = bin
letra  = ([A-Z]|[a-z])
digitoPositivo = [1-9]
digito = ({digitoPositivo}|0)
barrabaja = _
identificador = ({letra}|{barrabaja})({letra}|{digito})*
separador = [ \t\r\b\n]
asignacion = \=
parteEntera = {digitoPositivo}{digito}*
numeroEntero = ([\+\-]?{parteEntera})|0
bool = (true|false)
bin = 0b(0|1)(0|1)*
cap = \[
ccierre = \]
coma  = \,
tarray = array



char = \'[^\t\n\b\r]\'
mas = \+
menos = \-
por = \*
div = \/
mod = \%
pap = \(
pcierre = \)
incremento = \+\+
decremento = \-\-
not = \!
and = \&
or = \|
igual = \=\=
distinto = \!\=
menor = <
mayor = >
mayorigual = >=
menorigual = <=
struct = struct
llaveap = \{
llavecierre = \}

return = return
def = def
enumerado = enum
constante = const

bucleFor = for
bucleWhile = while
expIf = if
expElif = elif 
expElse = else 

punto = \.
size = size

instread = read
instprint = print

%%
{separador}               {}
{comentario}              {}

{incremento}              {return ops.unidadIncremento();}
{decremento}              {return ops.unidadDecremento();}
{tent}                    {return ops.unidadTEnt();}
{tbool}                   {return ops.unidadTBool();}
{tchar}                   {return ops.unidadTChar();}
{tbin}                    {return ops.unidadTBin();}
{cap}                     {return ops.unidadCAp();}
{ccierre}                 {return ops.unidadCCierre();}
{asignacion}              {return ops.unidadAsignacion();} 
{coma}                    {return ops.unidadComa();}
{char}                    {return ops.unidadChar();}
{bool}                    {return ops.unidadBool();}
{bin}                     {return ops.unidadBin();}
{tarray}                  {return ops.unidadArray();}

{mas}                     {return ops.unidadSuma();}
{menos}                   {return ops.unidadResta();}
{por}                     {return ops.unidadMultiplicacion();}
{div}                     {return ops.unidadDivision();}
{mod}                     {return ops.unidadModulo();}
{pap}                     {return ops.unidadPAp();}
{pcierre}                 {return ops.unidadPCierre();}

{not}                     {return ops.unidadNegacion();}
{and}                     {return ops.unidadAnd();}
{or}                      {return ops.unidadOr();}
{igual}                   {return ops.unidadIgual();}
{distinto}                {return ops.unidadDistinto();}
{menor}                   {return ops.unidadMenor();}
{mayor}                   {return ops.unidadMayor();}
{menorigual}              {return ops.unidadMenorIgual();}
{mayorigual}              {return ops.unidadMayorIgual();}

{llaveap}                 {return ops.unidadLLaveAp();}
{llavecierre}             {return ops.unidadLLaveCierre();}
{struct}                  {return ops.unidadEstructura();}

{return}                  {return ops.unidadRetorno();}
{def}                     {return ops.unidadDef();}
{enumerado}               {return ops.unidadEnumerado();}
{constante}               {return ops.unidadConstante();}

{bucleFor}                {return ops.unidadBucleFor();}
{bucleWhile}              {return ops.unidadBucleWhile();}
{expIf}                   {return ops.unidadExpIf();}
{expElif}                 {return ops.unidadExpElif();}
{expElse}                 {return ops.unidadExpElse();}

{punto}                   {return ops.unidadPunto();}
{size}                    {return ops.unidadSize();}

{instread}                {return ops.unidadLectura();}
{instprint}               {return ops.unidadEscritura();}

{identificador}           {return ops.unidadId();} 
{numeroEntero}            {return ops.unidadEnt();} 
[^]                       {errores.errorLexico(fila(),lexema());}

