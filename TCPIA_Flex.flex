/*
 * =====================================================================================
 *
 *       Filename:  TCPIA_Flex.flex
 *
 *    Description:  Flex file for the TCPIA compilator.
 *
 *        Version:  1.0
 *        Created:  03/23/2015 11:03:20 AM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Axel Fahy, Rudolf Höhn 
 *   Organization:  HES-SO hepia section ITI
 *
 * =====================================================================================
 */
import java_cup.runtime.*;
import java.util.*;

%%
// Options
%class Lexer
%line
%column
%cup

%{
// Error code
//public void yyerror() {
//    System.out.println("error line " +yyline + " column " +yycolumn
//    + " " +yytext());
//}

%}

// Flex détecte les mots, JCup vérifie que les mots forment bien une phrase.

// Models

ident=([a-zA-Z][a-zA-Z0-9]*)
nombre=([0-9]+)
comment=(\/\/.*(\n))
constanteEnt=([0-9]+)
constanteChaine=[\"]([^\"]|\"\")*[\"]

%%
// Rules

// Programme
"programme "        { return new Symbol(sym.programme); }
"debutprg"          { return new Symbol(sym.debutprg); }
"finprg"            { return new Symbol(sym.finprg); }
"debutfonc"         { return new Symbol(sym.debutfonc); }
"finfonc"           { return new Symbol(sym.finfonc); }
"retourne"          { return new Symbol(sym.retourne); }

// Types
"entier "           { return new Symbol(sym.entier); }
"booleen "          { return new Symbol(sym.bool); }

// Affectation
"="                 { return new Symbol(sym.affectation); }

// Opération
"lire"              { return new Symbol(sym.lire); }
"ecrire"            { return new Symbol(sym.ecrire); }
"\+"                { return new Symbol(sym.plus); }
"-"                 { return new Symbol(sym.moins); }
"\*"                { return new Symbol(sym.mult); }
"\/"                { return new Symbol(sym.div); }
"=="                { return new Symbol(sym.doubleegal); }
"<>"                { return new Symbol(sym.different); }
"<"                 { return new Symbol(sym.pluspetit); }
"<="                { return new Symbol(sym.pluspetitegal); }
">"                 { return new Symbol(sym.plusgrand); }
">="                { return new Symbol(sym.plusgrandegal); }
"et"                { return new Symbol(sym.et); }
"ou"                { return new Symbol(sym.ou); }

// Parenthèses
"\("                { return new Symbol(sym.parentouvrante); }
"\)"                { return new Symbol(sym.parentfermante); }

// Crochets
"\["                { return new Symbol(sym.crochetouvrant); }
"\]"                { return new Symbol(sym.crochetfermant); }

// Constantes
"constante"         { return new Symbol(sym.constante); }
{constanteEnt}      { return new Symbol(sym.constanteent, new String(yytext())); }
{constanteChaine}   { return new Symbol(sym.constantechaine); }
"vrai"              { return new Symbol(sym.vrai); }
"faux"              { return new Symbol(sym.faux); }

{comment}           { return new Symbol(sym.comment, new String(yytext())); }
","                 { return new Symbol(sym.virgule); }
".."                { return new Symbol(sym.deuxpoints); }
";"                 { return new Symbol(sym.pointvirgule); }
"\~"                { return new Symbol(sym.moinsunaire); }
"non"               { return new Symbol(sym.no); }

// Condition
"si"                { return new Symbol(sym.si); }
"alors"             { return new Symbol(sym.alors); }
"sinon"             { return new Symbol(sym.sinon); }
"finsi"             { return new Symbol(sym.finsi); }

// Loop for
"pour"              { return new Symbol(sym.pour); }
"allantde"          { return new Symbol(sym.allantde); }
"a"                 { return new Symbol(sym.a); }
"faire"             { return new Symbol(sym.faire); }
"finpour"           { return new Symbol(sym.finpour); }

// Loop while
"tantque"           { return new Symbol(sym.tantque); }
"fintantque"        { return new Symbol(sym.fintantque); }

{ident}             { return new Symbol(sym.ident, new String(yytext())); }


/* -------------------------------------------------
Characters not handle.
------------------------------------------------- */
[\t|\r|\r\n]        {}
.                   {}

