grammar css;
import lexerRules;

program
	: member*
	;

// сложные правила
member
	: cssClass
//  | varExpr
	;

cssClass
	: selector '{' cssBody '}'
	;

selector
	: Selector (('>'|'+'|'~')? Selector)*
	;

cssBody
	: property+ cssClass*
	;

property
	: propName ':' propValue+ ';'
	;

propName
	: Name
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
    ;
string
    : String
    ;
id
    : Variable
    ;