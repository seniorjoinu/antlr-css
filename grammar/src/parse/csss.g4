grammar csss;
import lexerRules;

@members {
    private IdeController controller;

    public csssParser(TokenStream input, IdeController controller) {
    	this(input);
    	this.controller = controller;
    }

    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e) {
    	super.notifyErrorListeners(offendingToken, msg, e);
    	this.controller.errorLog.appendText(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) + ": " + msg + "\n");
    }
}

program
    : member*
    ;

trueMember
    : member
    | property
    ;

falseMember
    : member
    | property
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
	: (mainSelector (pseudo)*)+
	;

pseudo
    : (PseudoElement '(' id ')' | PseudoClass)
    ;

mainSelector
    : op=('>'|'+'|'~')? Selector
    ;

classBody
	: (property | definition)*
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
    : For '(' id From startCount=number To endCount=number ')' '{' member+ '}'
    ;

ifDefinition
    : If '(' predicate ')' '{' trueMember+ '}' (Else '{' falseMember+ '}')?
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