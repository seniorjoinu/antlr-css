// Generated from C:/IdeaProjects/antlr-css/grammar/src/parse\var.g4 by ANTLR 4.5.3
package core.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link varParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface varVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link varParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(varParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(varParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(varParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(varParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ltgt}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtgt(varParser.LtgtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(varParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensPred}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPred(varParser.ParensPredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(varParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Andor}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndor(varParser.AndorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPred}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPred(varParser.ExprPredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Leqgeq}
	 * labeled alternative in {@link varParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeqgeq(varParser.LeqgeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#forDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDefinition(varParser.ForDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#ifDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefinition(varParser.IfDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPropValue}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPropValue(varParser.ExprPropValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addsub}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(varParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(varParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(varParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Prnt}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrnt(varParser.PrntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link varParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(varParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(varParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#propValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropValue(varParser.PropValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#numberUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberUnit(varParser.NumberUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(varParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(varParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(varParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(varParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link varParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(varParser.IdContext ctx);
}