// Generated from QL.g4 by ANTLR 4.5

	package uva.ql.parser;
	import uva.ql.ast.expressions.*;
	import uva.ql.ast.expressions.literals.*;
	import uva.ql.ast.expressions.math.*;
	import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QLParser}.
 */
public interface QLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(QLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(QLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(QLParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(QLParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#quest}.
	 * @param ctx the parse tree
	 */
	void enterQuest(QLParser.QuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#quest}.
	 * @param ctx the parse tree
	 */
	void exitQuest(QLParser.QuestContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(QLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(QLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#quest_decl}.
	 * @param ctx the parse tree
	 */
	void enterQuest_decl(QLParser.Quest_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#quest_decl}.
	 * @param ctx the parse tree
	 */
	void exitQuest_decl(QLParser.Quest_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(QLParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(QLParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(QLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(QLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(QLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(QLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(QLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(QLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(QLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(QLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(QLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(QLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#typeof}.
	 * @param ctx the parse tree
	 */
	void enterTypeof(QLParser.TypeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#typeof}.
	 * @param ctx the parse tree
	 */
	void exitTypeof(QLParser.TypeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(QLParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(QLParser.QuestionTypeContext ctx);
}