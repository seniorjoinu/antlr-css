// Generated from C:/IdeaProjects/antlr-css/grammar/src/parse\css.g4 by ANTLR 4.5.3
package parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cssVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cssParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(cssParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(cssParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(cssParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#cssClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClass(cssParser.CssClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(cssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#cssBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBody(cssParser.CssBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(cssParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(cssParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#propValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropValue(cssParser.PropValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#numberUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberUnit(cssParser.NumberUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(cssParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(cssParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(cssParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(cssParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(cssParser.VariableContext ctx);
}