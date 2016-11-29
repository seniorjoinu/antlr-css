// Generated from C:/IdeaProjects/antlr-css/grammar/src/parse\css.g4 by ANTLR 4.5.3
package parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Character=9, 
		Digit=10, Hex=11, WS=12, Variable=13, Color=14, Selector=15, Name=16, 
		NumberUnit=17, Number=18, Unit=19, Html=20, String=21;
	public static final int
		RULE_program = 0, RULE_member = 1, RULE_varDefinition = 2, RULE_cssClass = 3, 
		RULE_selector = 4, RULE_cssBody = 5, RULE_property = 6, RULE_propName = 7, 
		RULE_propValue = 8, RULE_numberUnit = 9, RULE_color = 10, RULE_name = 11, 
		RULE_number = 12, RULE_string = 13, RULE_variable = 14;
	public static final String[] ruleNames = {
		"program", "member", "varDefinition", "cssClass", "selector", "cssBody", 
		"property", "propName", "propValue", "numberUnit", "color", "name", "number", 
		"string", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'{'", "'}'", "'>'", "'+'", "'~'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Character", "Digit", 
		"Hex", "WS", "Variable", "Color", "Selector", "Name", "NumberUnit", "Number", 
		"Unit", "Html", "String"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "css.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable || _la==Selector) {
				{
				{
				setState(30);
				member();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public CssClassContext cssClass() {
			return getRuleContext(CssClassContext.class,0);
		}
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_member);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case Selector:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				cssClass();
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				varDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<PropValueContext> propValue() {
			return getRuleContexts(PropValueContext.class);
		}
		public PropValueContext propValue(int i) {
			return getRuleContext(PropValueContext.class,i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			variable();
			setState(41);
			match(T__0);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				propValue();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Color) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0) );
			setState(47);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CssClassContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public CssBodyContext cssBody() {
			return getRuleContext(CssBodyContext.class,0);
		}
		public CssClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterCssClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitCssClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitCssClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssClassContext cssClass() throws RecognitionException {
		CssClassContext _localctx = new CssClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cssClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			selector();
			setState(50);
			match(T__2);
			setState(51);
			cssBody();
			setState(52);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> Selector() { return getTokens(cssParser.Selector); }
		public TerminalNode Selector(int i) {
			return getToken(cssParser.Selector, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Selector);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Selector))) != 0)) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
					{
					setState(55);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(58);
				match(Selector);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CssBodyContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public CssBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterCssBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitCssBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitCssBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBodyContext cssBody() throws RecognitionException {
		CssBodyContext _localctx = new CssBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cssBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				property();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public PropNameContext propName() {
			return getRuleContext(PropNameContext.class,0);
		}
		public List<PropValueContext> propValue() {
			return getRuleContexts(PropValueContext.class);
		}
		public PropValueContext propValue(int i) {
			return getRuleContext(PropValueContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			propName();
			setState(70);
			match(T__7);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(73);
				switch (_input.LA(1)) {
				case Color:
				case Name:
				case NumberUnit:
				case Number:
				case String:
					{
					setState(71);
					propValue();
					}
					break;
				case Variable:
					{
					setState(72);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Variable) | (1L << Color) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0) );
			setState(77);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(cssParser.Name, 0); }
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterPropName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitPropName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitPropName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropValueContext extends ParserRuleContext {
		public NumberUnitContext numberUnit() {
			return getRuleContext(NumberUnitContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PropValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterPropValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitPropValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitPropValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropValueContext propValue() throws RecognitionException {
		PropValueContext _localctx = new PropValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propValue);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case NumberUnit:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				numberUnit();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				number();
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				name();
				}
				break;
			case Color:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				color();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberUnitContext extends ParserRuleContext {
		public TerminalNode NumberUnit() { return getToken(cssParser.NumberUnit, 0); }
		public NumberUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterNumberUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitNumberUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitNumberUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberUnitContext numberUnit() throws RecognitionException {
		NumberUnitContext _localctx = new NumberUnitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numberUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NumberUnit);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode Color() { return getToken(cssParser.Color, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Color);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(cssParser.Name, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(cssParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(cssParser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(cssParser.Variable, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssListener ) ((cssListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssVisitor ) return ((cssVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Variable);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\5\6;\n\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\6\7D\n\7\r\7"+
		"\16\7E\3\b\3\b\3\b\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\5\nY\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\7\tc\2"+
		"#\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b\63\3\2\2\2\n8\3\2\2\2\fC\3\2\2\2\16"+
		"G\3\2\2\2\20Q\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26\\\3\2\2\2\30^\3\2\2\2"+
		"\32`\3\2\2\2\34b\3\2\2\2\36d\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#"+
		"!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&)\5\b\5\2\')\5\6\4\2(&\3\2\2"+
		"\2(\'\3\2\2\2)\5\3\2\2\2*+\5\36\20\2+-\7\3\2\2,.\5\22\n\2-,\3\2\2\2./"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\4\2\2\62\7\3\2\2"+
		"\2\63\64\5\n\6\2\64\65\7\5\2\2\65\66\5\f\7\2\66\67\7\6\2\2\67\t\3\2\2"+
		"\28?\7\21\2\29;\t\2\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\7\21\2\2=:\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2A?\3\2\2\2BD\5\16\b\2CB"+
		"\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\r\3\2\2\2GH\5\20\t\2HK\7\n\2\2"+
		"IL\5\22\n\2JL\5\36\20\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\7\4\2\2P\17\3\2\2\2QR\7\22\2\2R\21\3\2\2\2SY\5\24\13"+
		"\2TY\5\32\16\2UY\5\30\r\2VY\5\26\f\2WY\5\34\17\2XS\3\2\2\2XT\3\2\2\2X"+
		"U\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\23\3\2\2\2Z[\7\23\2\2[\25\3\2\2\2\\]\7"+
		"\20\2\2]\27\3\2\2\2^_\7\22\2\2_\31\3\2\2\2`a\7\24\2\2a\33\3\2\2\2bc\7"+
		"\27\2\2c\35\3\2\2\2de\7\17\2\2e\37\3\2\2\2\13#(/:?EKMX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}