grammar var;

import lexerRules;

program
    : member*
    ;

member
    : varExpr
    | expression
    ;

varExpr
    : varDefinition
    | forDefinition
    | ifDefinition
    ;

varDefinition
    : id '=' expression+ ';'
    ;

predicate
    : predicate op=('>'|'<') predicate      #Ltgt
    | predicate op=('>='|'<=') predicate    #Leqgeq
    | predicate op='==' predicate           #Eq
    | predicate op=('and'|'or') predicate   #Andor
    | predicate op='not' predicate          #Not
    | expression                            #ExprPred
    | '(' predicate ')'                     #ParensPred
    ;

forDefinition
    : For '(' id 'from' number 'to' number ')' '{' member+ '}'
    ;

ifDefinition
    : If '(' predicate ')' '{' member+ '}' (Else '{' member+ '}')?
    ;

expression
    : expression op=('*'|'/') expression    #Multdiv
    | expression op=('-'|'+') expression    #Addsub
    | expression '%' expression             #Modulo
    | propValue                             #ExprPropValue
    | '(' expression ')'                    #ParensExpr
    | print                                 #Prnt
    ;

print
    : 'print' expression ';'
    ;

propValue
	: numberUnit
	| number
	| name
	| color
	| string
	| id
	;


// лексические единицы
numberUnit
	: NumberUnit
	;
color
    : Color
    ;
name
    : Name
    ;
number
    : Number
    | Digit
    ;
string
    : String
    ;
id
    : Variable
    ;