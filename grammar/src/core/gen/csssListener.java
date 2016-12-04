// Generated from C:/IdeaProjects/antlr-css1/grammar/src/parse\csss.g4 by ANTLR 4.5.3
package core.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csssParser}.
 */
public interface csssListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csssParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(csssParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(csssParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(csssParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(csssParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(csssParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(csssParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(csssParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(csssParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(csssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(csssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(csssParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(csssParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(csssParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(csssParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#propName}.
	 * @param ctx the parse tree
	 */
	void enterPropName(csssParser.PropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#propName}.
	 * @param ctx the parse tree
	 */
	void exitPropName(csssParser.PropNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(csssParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(csssParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ltgt}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLtgt(csssParser.LtgtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ltgt}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLtgt(csssParser.LtgtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNot(csssParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNot(csssParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensPred}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterParensPred(csssParser.ParensPredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensPred}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitParensPred(csssParser.ParensPredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterEq(csssParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitEq(csssParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Andor}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterAndor(csssParser.AndorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Andor}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitAndor(csssParser.AndorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPred}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExprPred(csssParser.ExprPredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPred}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExprPred(csssParser.ExprPredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Leqgeq}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLeqgeq(csssParser.LeqgeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Leqgeq}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLeqgeq(csssParser.LeqgeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#forDefinition}.
	 * @param ctx the parse tree
	 */
	void enterForDefinition(csssParser.ForDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#forDefinition}.
	 * @param ctx the parse tree
	 */
	void exitForDefinition(csssParser.ForDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#ifDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIfDefinition(csssParser.IfDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#ifDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIfDefinition(csssParser.IfDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPropValue}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPropValue(csssParser.ExprPropValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPropValue}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPropValue(csssParser.ExprPropValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addsub}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(csssParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addsub}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(csssParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulo(csssParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulo(csssParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(csssParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(csssParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Prnt}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrnt(csssParser.PrntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prnt}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrnt(csssParser.PrntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(csssParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(csssParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(csssParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(csssParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#propValue}.
	 * @param ctx the parse tree
	 */
	void enterPropValue(csssParser.PropValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#propValue}.
	 * @param ctx the parse tree
	 */
	void exitPropValue(csssParser.PropValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void enterNumberUnit(csssParser.NumberUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void exitNumberUnit(csssParser.NumberUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(csssParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(csssParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(csssParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(csssParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(csssParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(csssParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(csssParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(csssParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(csssParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(csssParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link csssParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(csssParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link csssParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(csssParser.BoolContext ctx);
}