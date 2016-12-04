// Generated from C:/IdeaProjects/antlr-css1/grammar/src/parse\csss.g4 by ANTLR 4.5.3
package core.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csssVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csssParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(csssParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(csssParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(csssParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(csssParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(csssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(csssParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(csssParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(csssParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(csssParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ltgt}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtgt(csssParser.LtgtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(csssParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensPred}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPred(csssParser.ParensPredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(csssParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Andor}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndor(csssParser.AndorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPred}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPred(csssParser.ExprPredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Leqgeq}
	 * labeled alternative in {@link csssParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeqgeq(csssParser.LeqgeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#forDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDefinition(csssParser.ForDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#ifDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefinition(csssParser.IfDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPropValue}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPropValue(csssParser.ExprPropValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addsub}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(csssParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(csssParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(csssParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Prnt}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrnt(csssParser.PrntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multdiv}
	 * labeled alternative in {@link csssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(csssParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(csssParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#propValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropValue(csssParser.PropValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#numberUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberUnit(csssParser.NumberUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(csssParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(csssParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(csssParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(csssParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(csssParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link csssParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(csssParser.BoolContext ctx);
}