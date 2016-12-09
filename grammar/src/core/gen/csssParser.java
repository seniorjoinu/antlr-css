// Generated from C:/IdeaProjects/antlr-css/grammar/src/parse\csss.g4 by ANTLR 4.5.3
package core.gen;
import core.controller.IdeController;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Character=25, Digit=26, Hex=27, WS=28, For=29, From=30, To=31, If=32, 
		Else=33, Variable=34, Color=35, Selector=36, Name=37, NumberUnit=38, Number=39, 
		Unit=40, Html=41, PseudoClass=42, PseudoElement=43, String=44;
	public static final int
		RULE_program = 0, RULE_trueMember = 1, RULE_falseMember = 2, RULE_member = 3, 
		RULE_definition = 4, RULE_classDefinition = 5, RULE_selector = 6, RULE_pseudo = 7, 
		RULE_mainSelector = 8, RULE_classBody = 9, RULE_property = 10, RULE_propName = 11, 
		RULE_varDefinition = 12, RULE_predicate = 13, RULE_forDefinition = 14, 
		RULE_ifDefinition = 15, RULE_expression = 16, RULE_print = 17, RULE_propValue = 18, 
		RULE_numberUnit = 19, RULE_color = 20, RULE_name = 21, RULE_number = 22, 
		RULE_string = 23, RULE_id = 24, RULE_bool = 25;
	public static final String[] ruleNames = {
		"program", "trueMember", "falseMember", "member", "definition", "classDefinition", 
		"selector", "pseudo", "mainSelector", "classBody", "property", "propName", 
		"varDefinition", "predicate", "forDefinition", "ifDefinition", "expression", 
		"print", "propValue", "numberUnit", "color", "name", "number", "string", 
		"id", "bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'>'", "'+'", "'~'", "':'", "';'", "'='", 
		"'<'", "'>='", "'<='", "'=='", "'and'", "'or'", "'not'", "'*'", "'/'", 
		"'-'", "'%'", "'print'", "'true'", "'false'", null, null, null, null, 
		"'for'", "'from'", "'to'", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Character", "Digit", "Hex", "WS", "For", "From", "To", "If", "Else", 
		"Variable", "Color", "Selector", "Name", "NumberUnit", "Number", "Unit", 
		"Html", "PseudoClass", "PseudoElement", "String"
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
	public String getGrammarFileName() { return "csss.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private IdeController controller;

	    public csssParser(TokenStream input, IdeController controller) {
	    	this(input);
	    	this.controller = controller;
	    }

	    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e) {
	    	super.notifyErrorListeners(offendingToken, msg, e);
	    	this.controller.errorLog.appendText(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) + ": " + msg + "\n");
	    }

	public csssParser(TokenStream input) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Digit) | (1L << For) | (1L << If) | (1L << Variable) | (1L << Color) | (1L << Selector) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0)) {
				{
				{
				setState(52);
				member();
				}
				}
				setState(57);
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

	public static class TrueMemberContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TrueMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitTrueMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueMemberContext trueMember() throws RecognitionException {
		TrueMemberContext _localctx = new TrueMemberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trueMember);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				member();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				property();
				}
				break;
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

	public static class FalseMemberContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public FalseMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitFalseMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseMemberContext falseMember() throws RecognitionException {
		FalseMemberContext _localctx = new FalseMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_falseMember);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				member();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				property();
				}
				break;
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_member);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				expression(0);
				}
				break;
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

	public static class DefinitionContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public ForDefinitionContext forDefinition() {
			return getRuleContext(ForDefinitionContext.class,0);
		}
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				varDefinition();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				forDefinition();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				ifDefinition();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case Selector:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				classDefinition();
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			selector();
			setState(77);
			match(T__0);
			setState(78);
			classBody();
			setState(79);
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

	public static class SelectorContext extends ParserRuleContext {
		public List<MainSelectorContext> mainSelector() {
			return getRuleContexts(MainSelectorContext.class);
		}
		public MainSelectorContext mainSelector(int i) {
			return getRuleContext(MainSelectorContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				mainSelector();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PseudoClass || _la==PseudoElement) {
					{
					{
					setState(82);
					pseudo();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Selector))) != 0) );
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

	public static class PseudoContext extends ParserRuleContext {
		public TerminalNode PseudoElement() { return getToken(csssParser.PseudoElement, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PseudoClass() { return getToken(csssParser.PseudoClass, 0); }
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch (_input.LA(1)) {
			case PseudoElement:
				{
				setState(92);
				match(PseudoElement);
				setState(93);
				match(T__2);
				setState(94);
				id();
				setState(95);
				match(T__3);
				}
				break;
			case PseudoClass:
				{
				setState(97);
				match(PseudoClass);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MainSelectorContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Selector() { return getToken(csssParser.Selector, 0); }
		public MainSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSelector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitMainSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSelectorContext mainSelector() throws RecognitionException {
		MainSelectorContext _localctx = new MainSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				setState(100);
				((MainSelectorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					((MainSelectorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(103);
			match(Selector);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << For) | (1L << If) | (1L << Variable) | (1L << Selector) | (1L << Name))) != 0)) {
				{
				setState(107);
				switch (_input.LA(1)) {
				case Name:
					{
					setState(105);
					property();
					}
					break;
				case T__4:
				case T__5:
				case T__6:
				case For:
				case If:
				case Variable:
				case Selector:
					{
					setState(106);
					definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
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

	public static class PropertyContext extends ParserRuleContext {
		public PropNameContext propName() {
			return getRuleContext(PropNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			propName();
			setState(113);
			match(T__7);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				expression(0);
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Digit) | (1L << Variable) | (1L << Color) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0) );
			setState(119);
			match(T__8);
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
		public TerminalNode Name() { return getToken(csssParser.Name, 0); }
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitPropName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropNameContext propName() throws RecognitionException {
		PropNameContext _localctx = new PropNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			id();
			setState(124);
			match(T__9);
			setState(125);
			expression(0);
			setState(126);
			match(T__8);
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtgtContext extends PredicateContext {
		public Token op;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public LtgtContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitLtgt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends PredicateContext {
		public Token op;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public NotContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensPredContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ParensPredContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitParensPred(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends PredicateContext {
		public Token op;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public EqContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndorContext extends PredicateContext {
		public Token op;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public AndorContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitAndor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPredContext extends PredicateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPredContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitExprPred(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeqgeqContext extends PredicateContext {
		public Token op;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public LeqgeqContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitLeqgeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPredContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new ParensPredContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(T__2);
				setState(131);
				predicate(0);
				setState(132);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new LtgtContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(137);
						((LtgtContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__10) ) {
							((LtgtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(138);
						predicate(8);
						}
						break;
					case 2:
						{
						_localctx = new LeqgeqContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140);
						((LeqgeqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((LeqgeqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(141);
						predicate(7);
						}
						break;
					case 3:
						{
						_localctx = new EqContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						((EqContext)_localctx).op = match(T__13);
						setState(144);
						predicate(6);
						}
						break;
					case 4:
						{
						_localctx = new AndorContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						((AndorContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((AndorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(147);
						predicate(5);
						}
						break;
					case 5:
						{
						_localctx = new NotContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						((NotContext)_localctx).op = match(T__16);
						setState(150);
						predicate(4);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForDefinitionContext extends ParserRuleContext {
		public NumberContext startCount;
		public NumberContext endCount;
		public TerminalNode For() { return getToken(csssParser.For, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode From() { return getToken(csssParser.From, 0); }
		public TerminalNode To() { return getToken(csssParser.To, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ForDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitForDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDefinitionContext forDefinition() throws RecognitionException {
		ForDefinitionContext _localctx = new ForDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(For);
			setState(157);
			match(T__2);
			setState(158);
			id();
			setState(159);
			match(From);
			setState(160);
			((ForDefinitionContext)_localctx).startCount = number();
			setState(161);
			match(To);
			setState(162);
			((ForDefinitionContext)_localctx).endCount = number();
			setState(163);
			match(T__3);
			setState(164);
			match(T__0);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				member();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Digit) | (1L << For) | (1L << If) | (1L << Variable) | (1L << Color) | (1L << Selector) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0) );
			setState(170);
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

	public static class IfDefinitionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(csssParser.If, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public List<TrueMemberContext> trueMember() {
			return getRuleContexts(TrueMemberContext.class);
		}
		public TrueMemberContext trueMember(int i) {
			return getRuleContext(TrueMemberContext.class,i);
		}
		public TerminalNode Else() { return getToken(csssParser.Else, 0); }
		public List<FalseMemberContext> falseMember() {
			return getRuleContexts(FalseMemberContext.class);
		}
		public FalseMemberContext falseMember(int i) {
			return getRuleContext(FalseMemberContext.class,i);
		}
		public IfDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitIfDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefinitionContext ifDefinition() throws RecognitionException {
		IfDefinitionContext _localctx = new IfDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(If);
			setState(173);
			match(T__2);
			setState(174);
			predicate(0);
			setState(175);
			match(T__3);
			setState(176);
			match(T__0);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				trueMember();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Digit) | (1L << For) | (1L << If) | (1L << Variable) | (1L << Color) | (1L << Selector) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0) );
			setState(182);
			match(T__1);
			setState(192);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(183);
				match(Else);
				setState(184);
				match(T__0);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					falseMember();
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Digit) | (1L << For) | (1L << If) | (1L << Variable) | (1L << Color) | (1L << Selector) | (1L << Name) | (1L << NumberUnit) | (1L << Number) | (1L << String))) != 0) );
				setState(190);
				match(T__1);
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPropValueContext extends ExpressionContext {
		public PropValueContext propValue() {
			return getRuleContext(PropValueContext.class,0);
		}
		public ExprPropValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitExprPropValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddsubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModuloContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrntContext extends ExpressionContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitPrnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultdivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultdivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitMultdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case Digit:
			case Variable:
			case Color:
			case Name:
			case NumberUnit:
			case Number:
			case String:
				{
				_localctx = new ExprPropValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				propValue();
				}
				break;
			case T__2:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__2);
				setState(197);
				expression(0);
				setState(198);
				match(T__3);
				}
				break;
			case T__21:
				{
				_localctx = new PrntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MultdivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(204);
						((MultdivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((MultdivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(205);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						((AddsubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__19) ) {
							((AddsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(208);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(T__20);
						setState(211);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__21);
			setState(218);
			expression(0);
			setState(219);
			match(T__8);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PropValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitPropValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropValueContext propValue() throws RecognitionException {
		PropValueContext _localctx = new PropValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_propValue);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case NumberUnit:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				numberUnit();
				}
				break;
			case Digit:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				number();
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				name();
				}
				break;
			case Color:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				color();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				string();
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				id();
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				bool();
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
		public TerminalNode NumberUnit() { return getToken(csssParser.NumberUnit, 0); }
		public NumberUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitNumberUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberUnitContext numberUnit() throws RecognitionException {
		NumberUnitContext _localctx = new NumberUnitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numberUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		public TerminalNode Color() { return getToken(csssParser.Color, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public TerminalNode Name() { return getToken(csssParser.Name, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public TerminalNode Number() { return getToken(csssParser.Number, 0); }
		public TerminalNode Digit() { return getToken(csssParser.Digit, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==Digit || _la==Number) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(csssParser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(csssParser.Variable, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csssVisitor ) return ((csssVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\5\3?\n\3\3\4"+
		"\3\4\5\4C\n\4\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\6\b[\n\b\r\b\16\b\\\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\te\n\t\3\n\5\nh\n\n\3\n\3\n\3\13\3\13\7\13n\n\13\f\13\16"+
		"\13q\13\13\3\f\3\f\3\f\6\fv\n\f\r\f\16\fw\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u009a\n\17\f\17\16\17\u009d\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\6\20\u00a9\n\20\r\20\16\20\u00aa\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\6\21\u00b5\n\21\r\21\16\21\u00b6\3\21\3\21\3\21\3\21"+
		"\6\21\u00bd\n\21\r\21\16\21\u00be\3\21\3\21\5\21\u00c3\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00d7\n\22\f\22\16\22\u00da\13\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e7\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\4\34\""+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\n\3\2\7"+
		"\t\4\2\7\7\r\r\3\2\16\17\3\2\21\22\3\2\24\25\4\2\b\b\26\26\4\2\34\34)"+
		")\3\2\31\32\u00ff\29\3\2\2\2\4>\3\2\2\2\6B\3\2\2\2\bF\3\2\2\2\nL\3\2\2"+
		"\2\fN\3\2\2\2\16Z\3\2\2\2\20d\3\2\2\2\22g\3\2\2\2\24o\3\2\2\2\26r\3\2"+
		"\2\2\30{\3\2\2\2\32}\3\2\2\2\34\u0088\3\2\2\2\36\u009e\3\2\2\2 \u00ae"+
		"\3\2\2\2\"\u00cb\3\2\2\2$\u00db\3\2\2\2&\u00e6\3\2\2\2(\u00e8\3\2\2\2"+
		"*\u00ea\3\2\2\2,\u00ec\3\2\2\2.\u00ee\3\2\2\2\60\u00f0\3\2\2\2\62\u00f2"+
		"\3\2\2\2\64\u00f4\3\2\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<?\5\b\5\2=?\5\26\f\2><\3\2\2\2>=\3"+
		"\2\2\2?\5\3\2\2\2@C\5\b\5\2AC\5\26\f\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2"+
		"DG\5\n\6\2EG\5\"\22\2FD\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HM\5\32\16\2IM\5\36"+
		"\20\2JM\5 \21\2KM\5\f\7\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13"+
		"\3\2\2\2NO\5\16\b\2OP\7\3\2\2PQ\5\24\13\2QR\7\4\2\2R\r\3\2\2\2SW\5\22"+
		"\n\2TV\5\20\t\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2ZS\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\17\3\2\2\2^_\7-\2\2"+
		"_`\7\5\2\2`a\5\62\32\2ab\7\6\2\2be\3\2\2\2ce\7,\2\2d^\3\2\2\2dc\3\2\2"+
		"\2e\21\3\2\2\2fh\t\2\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7&\2\2j\23\3"+
		"\2\2\2kn\5\26\f\2ln\5\n\6\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2p\25\3\2\2\2qo\3\2\2\2rs\5\30\r\2su\7\n\2\2tv\5\"\22\2ut\3\2\2"+
		"\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\13\2\2z\27\3\2\2\2{|\7"+
		"\'\2\2|\31\3\2\2\2}~\5\62\32\2~\177\7\f\2\2\177\u0080\5\"\22\2\u0080\u0081"+
		"\7\13\2\2\u0081\33\3\2\2\2\u0082\u0083\b\17\1\2\u0083\u0089\5\"\22\2\u0084"+
		"\u0085\7\5\2\2\u0085\u0086\5\34\17\2\u0086\u0087\7\6\2\2\u0087\u0089\3"+
		"\2\2\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u009b\3\2\2\2\u008a"+
		"\u008b\f\t\2\2\u008b\u008c\t\3\2\2\u008c\u009a\5\34\17\n\u008d\u008e\f"+
		"\b\2\2\u008e\u008f\t\4\2\2\u008f\u009a\5\34\17\t\u0090\u0091\f\7\2\2\u0091"+
		"\u0092\7\20\2\2\u0092\u009a\5\34\17\b\u0093\u0094\f\6\2\2\u0094\u0095"+
		"\t\5\2\2\u0095\u009a\5\34\17\7\u0096\u0097\f\5\2\2\u0097\u0098\7\23\2"+
		"\2\u0098\u009a\5\34\17\6\u0099\u008a\3\2\2\2\u0099\u008d\3\2\2\2\u0099"+
		"\u0090\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7\37\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\5\62\32"+
		"\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7!\2\2\u00a4\u00a5"+
		"\5.\30\2\u00a5\u00a6\7\6\2\2\u00a6\u00a8\7\3\2\2\u00a7\u00a9\5\b\5\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad\37\3\2\2\2\u00ae\u00af"+
		"\7\"\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\7\6\2\2"+
		"\u00b2\u00b4\7\3\2\2\u00b3\u00b5\5\4\3\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00c2\7\4\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bc\7\3\2\2\u00bb\u00bd\5\6"+
		"\4\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3!\3\2\2\2\u00c4\u00c5"+
		"\b\22\1\2\u00c5\u00cc\5&\24\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\5\"\22\2"+
		"\u00c8\u00c9\7\6\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\5$\23\2\u00cb\u00c4"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00d8\3\2\2\2\u00cd"+
		"\u00ce\f\b\2\2\u00ce\u00cf\t\6\2\2\u00cf\u00d7\5\"\22\t\u00d0\u00d1\f"+
		"\7\2\2\u00d1\u00d2\t\7\2\2\u00d2\u00d7\5\"\22\b\u00d3\u00d4\f\6\2\2\u00d4"+
		"\u00d5\7\27\2\2\u00d5\u00d7\5\"\22\7\u00d6\u00cd\3\2\2\2\u00d6\u00d0\3"+
		"\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9#\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\30\2\2"+
		"\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\13\2\2\u00de%\3\2\2\2\u00df\u00e7"+
		"\5(\25\2\u00e0\u00e7\5.\30\2\u00e1\u00e7\5,\27\2\u00e2\u00e7\5*\26\2\u00e3"+
		"\u00e7\5\60\31\2\u00e4\u00e7\5\62\32\2\u00e5\u00e7\5\64\33\2\u00e6\u00df"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\'\3\2\2\2"+
		"\u00e8\u00e9\7(\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7%\2\2\u00eb+\3\2\2\2\u00ec"+
		"\u00ed\7\'\2\2\u00ed-\3\2\2\2\u00ee\u00ef\t\b\2\2\u00ef/\3\2\2\2\u00f0"+
		"\u00f1\7.\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3\63\3\2\2\2\u00f4"+
		"\u00f5\t\t\2\2\u00f5\65\3\2\2\2\319>BFLW\\dgmow\u0088\u0099\u009b\u00aa"+
		"\u00b6\u00be\u00c2\u00cb\u00d6\u00d8\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}