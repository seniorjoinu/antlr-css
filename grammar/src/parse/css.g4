grammar css;
import lexerRules;

program
	: member*
	;

// сложные правила
member
	: cssClass
	| varDefinition
	;

varDefinition
    : variable '=' propValue+ ';'
    ;

cssClass
	: selector '{' cssBody '}'
	;

selector
	: Selector (('>'|'+'|'~')? Selector)*
	;

cssBody
	: property+
	;

property
	: propName ':' (propValue | variable)+ ';'
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
variable
    : Variable
    ;