// Generated from C:/IdeaProjects/antlr-css/grammar/src/parse\css.g4 by ANTLR 4.5.3
package parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cssParser}.
 */
public interface cssListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cssParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(cssParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(cssParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(cssParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(cssParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#cssClass}.
	 * @param ctx the parse tree
	 */
	void enterCssClass(cssParser.CssClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#cssClass}.
	 * @param ctx the parse tree
	 */
	void exitCssClass(cssParser.CssClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(cssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(cssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void enterCssBody(cssParser.CssBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void exitCssBody(cssParser.CssBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(cssParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(cssParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#propName}.
	 * @param ctx the parse tree
	 */
	void enterPropName(cssParser.PropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#propName}.
	 * @param ctx the parse tree
	 */
	void exitPropName(cssParser.PropNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#propValue}.
	 * @param ctx the parse tree
	 */
	void enterPropValue(cssParser.PropValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#propValue}.
	 * @param ctx the parse tree
	 */
	void exitPropValue(cssParser.PropValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void enterNumberUnit(cssParser.NumberUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void exitNumberUnit(cssParser.NumberUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(cssParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(cssParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(cssParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(cssParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(cssParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(cssParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(cssParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(cssParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(cssParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(cssParser.IdContext ctx);
}