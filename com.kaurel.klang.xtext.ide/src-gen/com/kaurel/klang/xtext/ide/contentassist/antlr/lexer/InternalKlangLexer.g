/*
 * generated by Xtext 2.10.0
 */
lexer grammar InternalKlangLexer;

@header {
package com.kaurel.klang.xtext.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

SendMessage : 'sendMessage';

Collides : 'collides';

Received : 'received';

Clicked : 'clicked';

Forever : 'forever';

Pressed : 'pressed';

Double : 'double';

Sprite : 'sprite';

Starts : 'starts';

ENTER : 'ENTER';

SPACE : 'SPACE';

False : 'false';

Scene : 'scene';

Sleep : 'sleep';

While : 'while';

Else : 'else';

Game : 'game';

True : 'true';

When : 'when';

With : 'with';

And : 'and';

Int : 'int';

Not : 'not';

Var : 'var';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

If : 'if';

Or : 'or';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

A : 'A';

B : 'B';

C : 'C';

D : 'D';

E : 'E';

F : 'F';

G : 'G';

H : 'H';

I : 'I';

J : 'J';

K : 'K';

L : 'L';

M : 'M';

N : 'N';

O : 'O';

P : 'P';

Q : 'Q';

R : 'R';

S : 'S';

T : 'T';

U : 'U';

V : 'V';

W : 'W';

X : 'X';

Y : 'Y';

Z : 'Z';

// Rules duplicated to allow inter-rule references

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
