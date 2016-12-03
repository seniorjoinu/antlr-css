lexer grammar lexerRules;

Character
	: 'a'..'z' | 'A'..'Z' | '-' | '_'
	;
Digit
	: '0'..'9'
	;
Hex	: 'a'..'f' | 'A'..'F' | '0'..'9'
	;
WS 	: [ \t\r\n] -> skip
	;
For : 'for'
    ;
If  : 'if'
    ;
Else: 'else'
    ;


Variable
    : '$' (Character | Digit)+
    ;
Color
	: '#' (Hex Hex Hex) | (Hex Hex Hex Hex Hex Hex)
	;
Selector
	: (Html | (('#'|'.') Character (Character | Digit)*) | '*') (PseudoClass | PseudoElement '(' .*? ')' )*
	;
Name
	: Character+
	;
NumberUnit
    : Number Unit
    ;
Number
	: Digit+
	;
Unit
	: 'em' | 'px' | '%'
	;
Html
	: 'a' | 'abbr' | 'acronym' | 'address' | 'applet' | 'area' | 'b' | 'base' | 'basefont' | 'bdo'
	| 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'caption' | 'center' | 'cite' | 'code'
	| 'col' | 'colgroup' | 'dd' | 'del' | 'dfn' | 'dir' | 'div' | 'dl' | 'dt' | 'em' | 'fieldset'
	| 'font' | 'form' | 'frame' | 'frameset' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head'
	| 'hr' | 'html' | 'i' | 'iframe' | 'input' | 'ins' | 'isindex' | 'kbd' | 'label' | 'legend'
	| 'li' | 'link' | 'map' | 'menu' | 'meta' | 'noframes' | 'noscript' | 'object' | 'ol'
	| 'optgroup' | 'option' | 'p' | 'param' | 'pre' | 'q' | 's' | 'samp' | 'script' | 'select'
	| 'small' | 'span' | 'strike' | 'strong' | 'style' | 'sub' | 'sup' | 'table' | 'tbody'
	| 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'title' | 'tr' | 'tt' | 'u' | 'ul'
	| 'var' | 'header' | 'hgroup' | 'nav' | 'article' | 'section' | 'aside' | 'footer' | 'address'
	| 'figure' | 'figcaption' | 'rp' | 'rt' | 'ruby' | 'time' | 'mark' | 'bdi' | 'wbr'
	;
PseudoClass
    : ':active' | ':any' | ':checked' | ':default' | ':disabled' | ':empty' | ':enabled' | ':first'
    | ':first-child' | ':first-of-type' | ':fullscreen' | ':focus' | ':hover' | ':indeterminate' | ':in-range'
    | ':invalid' | ':last-child' | ':last-of-type' | ':left' | ':link' | ':nth-last-of-type'| ':only-child'
    | ':only-of-type' | ':optional' | ':out-of-range' | ':read-only' | ':read-write' | ':required' | ':right'
    | ':root' | ':scope' | ':target' | ':valid' | ':visited'
    ;
PseudoElement
    : ':dir' | ':lang' | ':not' | ':nth-child' | ':nth-last-child' | ':nth-of-type'
    ;
String
	: '"' .*? '"'
    ;