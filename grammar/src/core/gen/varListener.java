// Generated from C:/IdeaProjects/antlr-css1/grammar/src/parse\var.g4 by ANTLR 4.5.3
package core.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link varParser}.
 */
public interface varListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link varParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(varParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(varParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(varParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(varParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(varParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(varParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(varParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(varParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ltgt}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLtgt(varParser.LtgtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ltgt}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLtgt(varParser.LtgtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNot(varParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNot(varParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensPred}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterParensPred(varParser.ParensPredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensPred}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitParensPred(varParser.ParensPredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterEq(varParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitEq(varParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Andor}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterAndor(varParser.AndorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Andor}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitAndor(varParser.AndorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPred}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExprPred(varParser.ExprPredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPred}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExprPred(varParser.ExprPredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Leqgeq}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLeqgeq(varParser.LeqgeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Leqgeq}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLeqgeq(varParser.LeqgeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#forDefinition}.
	 * @param ctx the parse tree
	 */
	void enterForDefinition(varParser.ForDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#forDefinition}.
	 * @param ctx the parse tree
	 */
	void exitForDefinition(varParser.ForDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#ifDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIfDefinition(varParser.IfDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#ifDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIfDefinition(varParser.IfDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPropValue}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPropValue(varParser.ExprPropValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPropValue}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPropValue(varParser.ExprPropValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addsub}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(varParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addsub}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(varParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulo(varParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulo(varParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(varParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(varParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Prnt}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrnt(varParser.PrntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prnt}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrnt(varParser.PrntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(varParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(varParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(varParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(varParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#propValue}.
	 * @param ctx the parse tree
	 */
	void enterPropValue(varParser.PropValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#propValue}.
	 * @param ctx the parse tree
	 */
	void exitPropValue(varParser.PropValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void enterNumberUnit(varParser.NumberUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void exitNumberUnit(varParser.NumberUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(varParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(varParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(varParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(varParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(varParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(varParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(varParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(varParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(varParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(varParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link varParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(varParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link varParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(varParser.BoolContext ctx);
}