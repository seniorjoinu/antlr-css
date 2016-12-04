grammar csss;
import lexerRules;

program
    : member*
    ;

member
    : definition
    | expression
    ;

definition
    : varDefinition
    | forDefinition
    | ifDefinition
    | classDefinition
    ;

classDefinition
    : selector '{' classBody '}'
    ;

selector
	: (op=('>'|'+'|'~')? Selector)+
	;

classBody
	: property* definition*
	;

property
	: propName ':' expression+ ';'
	;

propName
	: Name
	;

varDefinition
    : id '=' expression ';'
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
    : For '(' id 'from' startCount=number 'to' endCount=number ')' '{' forBody=member+ '}'
    ;

ifDefinition
    : If '(' predicate ')' '{' trueMembers=member+ '}' (Else '{' falseMembers=member+ '}')?
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
	| bool
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
bool
    : 'true'
    | 'false'
    ;