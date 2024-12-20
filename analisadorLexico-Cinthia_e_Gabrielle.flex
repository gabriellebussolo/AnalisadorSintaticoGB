/*
 * Nomes: Cinthia Becher e Gabrielle Bussolo
 */

/* Trab GA 2 */

import java_cup.runtime.Symbol;

%%

%public
%unicode
%class fooliLexer
%cup
%line
%column

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, String value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

// Palavras reservadas
classe = class 
main = main
constante = True|False
not = not
and = and
or = or
if = if
else = else
retorno = return
while = while

boolType = bool
intType = int
voidType = void  

// Identificador e numero
identificador = [a-zA-Z_][a-zA-Z_0-9]*
numero = [0-9]+

// Operadores
soma = \+
multiplicacao = \*
opIgual = \=\=
opMenor = <
opMaior = >
igual = \=

// Pontuacao
pontoEVirgula = ;
virgula = ,
chaveEsq = \{
chaveDir = \}
parEsq = \(
parDir = \)

ignorar = [\n|\s|\t\r]

%%

// Palavras reservadas
{classe} { return symbol(sym.CLASSE); }

{boolType} { return symbol(sym.BOOL, yytext()); }
{intType} { return symbol(sym.INT, yytext()); }
{voidType} { return symbol(sym.VOID, yytext()); }

{main} { return symbol(sym.MAIN); }

{if} { return symbol(sym.IF); }
{else} { return symbol(sym.ELSE); }

{constante} { return symbol(sym.CONSTANTE, yytext()); }
{not} { return symbol(sym.NOT); }
{and} { return symbol(sym.AND); }
{or} { return symbol(sym.OR); }

{retorno} { return symbol(sym.RETORNO); }

{while} { return symbol(sym.WHILE); }

// Identificador e numeros
{identificador} { return symbol(sym.ID, yytext()); }
{numero} { return symbol(sym.NUMERO, yytext()); }

// Operadores
{soma} { return symbol(sym.SOMA); }
{multiplicacao} { return symbol(sym.MULTIPLICACAO); }
{opIgual} { return symbol(sym.OPIGUAL); }
{opMaior} { return symbol(sym.OPMAIOR); }
{opMenor} { return symbol(sym.OPMENOR); }

{igual} { return symbol(sym.IGUAL); }

// Pontuacao
{parEsq} { return symbol(sym.PARESQ); }
{parDir} { return symbol(sym.PARDIR); }

{chaveEsq} { return symbol(sym.CHAVEESQ); }
{chaveDir} { return symbol(sym.CHAVEDIR); }

{pontoEVirgula} { return symbol(sym.PONTOEVIRGULA); }
{virgula} { return symbol(sym.VIRGULA); }

{ignorar} {}
