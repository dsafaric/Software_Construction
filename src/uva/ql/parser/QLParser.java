// Generated from QL.g4 by ANTLR 4.5

	package uva.ql.parser;
	import uva.ql.ast.expressions.*;
	import uva.ql.ast.expressions.literals.*;
	import uva.ql.ast.expressions.math.*;
	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, QuestionLiteral=16, 
		BooleanLiteral=17, NumberLiteral=18, WS=19, ID=20, ID_LETTER=21, INT=22, 
		FLOAT=23, CURRENCY=24, STRING=25, LINE_COMMENT=26, COMMENT=27, MUL=28, 
		DIV=29, ADD=30, SUB=31, LP=32, RP=33, LC=34, RC=35, LESS=36, LESS_EQUAL=37, 
		GREATER=38, GREATER_EQUAL=39, EQUAL=40, LOG_AND=41, LOG_OR=42, NOT_EQUAL=43, 
		NL=44, EXP=45;
	public static final int
		RULE_prog = 0, RULE_form = 1, RULE_quest = 2, RULE_stat = 3, RULE_quest_decl = 4, 
		RULE_decl = 5, RULE_assign = 6, RULE_expr = 7, RULE_ifStatement = 8, RULE_literal = 9, 
		RULE_primitiveType = 10, RULE_typeof = 11, RULE_questionType = 12;
	public static final String[] ruleNames = {
		"prog", "form", "quest", "stat", "quest_decl", "decl", "assign", "expr", 
		"ifStatement", "literal", "primitiveType", "typeof", "questionType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'form'", "'question'", "'='", "';'", "'.'", "'value'", "'if'", 
		"'else'", "'boolean'", "'float'", "'currency'", "'string'", "'int'", "'typeof'", 
		"'questionType'", null, null, null, null, null, null, null, null, null, 
		null, null, null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'&&'", "'||'", "'!='", null, "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "QuestionLiteral", "BooleanLiteral", "NumberLiteral", 
		"WS", "ID", "ID_LETTER", "INT", "FLOAT", "CURRENCY", "STRING", "LINE_COMMENT", 
		"COMMENT", "MUL", "DIV", "ADD", "SUB", "LP", "RP", "LC", "RC", "LESS", 
		"LESS_EQUAL", "GREATER", "GREATER_EQUAL", "EQUAL", "LOG_AND", "LOG_OR", 
		"NOT_EQUAL", "NL", "EXP"
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
	public String getGrammarFileName() { return "QL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QLParser.EOF, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				form();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(31);
			match(EOF);
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public List<QuestContext> quest() {
			return getRuleContexts(QuestContext.class);
		}
		public QuestContext quest(int i) {
			return getRuleContext(QuestContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(ID);
			setState(35);
			match(LC);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(36);
				quest();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==ID) {
				{
				{
				setState(42);
				stat();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(RC);
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

	public static class QuestContext extends ParserRuleContext {
		public List<String> decls =  new ArrayList<String>();
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public TypeofContext typeof() {
			return getRuleContext(TypeofContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<Quest_declContext> quest_decl() {
			return getRuleContexts(Quest_declContext.class);
		}
		public Quest_declContext quest_decl(int i) {
			return getRuleContext(Quest_declContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public QuestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitQuest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestContext quest() throws RecognitionException {
		QuestContext _localctx = new QuestContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(51);
			match(ID);
			setState(52);
			typeof();
			setState(53);
			primitiveType();
			setState(54);
			match(LC);
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					quest_decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(60);
				decl();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					stat();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiteral) | (1L << NumberLiteral) | (1L << ID) | (1L << LP))) != 0)) {
				{
				{
				setState(72);
				expr(0);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RC);
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

	public static class StatContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				ifStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				assign();
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

	public static class Quest_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(QLParser.STRING, 0); }
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public TerminalNode QuestionLiteral() { return getToken(QLParser.QuestionLiteral, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quest_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quest_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitQuest_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quest_declContext quest_decl() throws RecognitionException {
		Quest_declContext _localctx = new Quest_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quest_decl);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ID);
				setState(85);
				match(T__2);
				setState(86);
				match(STRING);
				setState(87);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				setState(89);
				match(T__4);
				setState(90);
				questionType();
				setState(91);
				match(T__2);
				setState(92);
				match(QuestionLiteral);
				setState(93);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(ID);
				setState(96);
				match(T__4);
				setState(97);
				match(T__5);
				setState(98);
				match(T__2);
				setState(99);
				expr(0);
				setState(100);
				match(T__3);
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

	public static class DeclContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			primitiveType();
			setState(105);
			match(ID);
			setState(107);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(106);
				match(T__2);
				}
			}

			setState(110);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiteral) | (1L << NumberLiteral) | (1L << ID) | (1L << LP))) != 0)) {
				{
				setState(109);
				expr(0);
				}
			}

			setState(112);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(T__2);
			setState(116);
			expr(0);
			setState(117);
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

	public static class ExprContext extends ParserRuleContext {
		public Expressions ex;
		public ExprContext x;
		public Token op;
		public ExprContext y;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode EXP() { return getToken(QLParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(QLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(QLParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(QLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(QLParser.SUB, 0); }
		public TerminalNode LESS() { return getToken(QLParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(QLParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(QLParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(QLParser.GREATER_EQUAL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			switch (_input.LA(1)) {
			case LP:
				{
				setState(120);
				match(LP);
				setState(121);
				((ExprContext)_localctx).x = expr(0);
				setState(122);
				match(RP);
				}
				break;
			case BooleanLiteral:
			case NumberLiteral:
			case ID:
				{
				setState(124);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(128);
						((ExprContext)_localctx).op = match(EXP);
						setState(129);
						((ExprContext)_localctx).y = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(132);
						((ExprContext)_localctx).y = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(135);
						((ExprContext)_localctx).y = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(138);
						((ExprContext)_localctx).y = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(141);
						((ExprContext)_localctx).y = expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						((ExprContext)_localctx).op = match(LOG_AND);
						setState(144);
						((ExprContext)_localctx).y = expr(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						((ExprContext)_localctx).op = match(LOG_OR);
						setState(147);
						((ExprContext)_localctx).y = expr(4);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class IfStatementContext extends ParserRuleContext {
		public Token ifThen;
		public Token ifElse;
		public Token elseStat;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<QuestContext> quest() {
			return getRuleContexts(QuestContext.class);
		}
		public QuestContext quest(int i) {
			return getRuleContext(QuestContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((IfStatementContext)_localctx).ifThen = match(T__6);
				setState(154);
				match(LP);
				setState(155);
				expr(0);
				setState(156);
				match(RP);
				setState(157);
				match(LC);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(158);
					quest();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==ID) {
					{
					{
					setState(164);
					stat();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					{
					setState(170);
					decl();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(RC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((IfStatementContext)_localctx).ifElse = match(T__6);
				setState(179);
				match(LP);
				setState(180);
				expr(0);
				setState(181);
				match(RP);
				setState(182);
				match(LC);
				setState(183);
				stat();
				setState(184);
				match(RC);
				setState(185);
				((IfStatementContext)_localctx).elseStat = match(T__7);
				setState(186);
				match(LP);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(187);
					quest();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6 || _la==ID) {
					{
					{
					setState(193);
					stat();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					{
					setState(199);
					decl();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(RP);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NumberLiteral() { return getToken(QLParser.NumberLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(QLParser.BooleanLiteral, 0); }
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiteral) | (1L << NumberLiteral) | (1L << ID))) != 0)) ) {
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class TypeofContext extends ParserRuleContext {
		public TypeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeof; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitTypeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofContext typeof() throws RecognitionException {
		TypeofContext _localctx = new TypeofContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__13);
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

	public static class QuestionTypeContext extends ParserRuleContext {
		public QuestionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLVisitor ) return ((QLVisitor<? extends T>)visitor).visitQuestionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionTypeContext questionType() throws RecognitionException {
		QuestionTypeContext _localctx = new QuestionTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_questionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__14);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4;\n\4\r\4\16\4<\3\4\7\4@\n\4\f\4\16\4C\13"+
		"\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\5"+
		"\3\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\5\7n\n\7\3\7\5\7q\n\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a2\n"+
		"\n\f\n\16\n\u00a5\13\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab\13\n\3\n\7\n\u00ae"+
		"\n\n\f\n\16\n\u00b1\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8"+
		"\13\n\3\n\7\n\u00cb\n\n\f\n\16\n\u00ce\13\n\3\n\3\n\5\n\u00d2\n\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\3\20\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\b\3\2\36\37\3\2 !\3\2&)\4\2**--\4\2\23\24\26\26\3\2\13\17"+
		"\u00e9\2\35\3\2\2\2\4#\3\2\2\2\6\64\3\2\2\2\bT\3\2\2\2\nh\3\2\2\2\fj\3"+
		"\2\2\2\16t\3\2\2\2\20\177\3\2\2\2\22\u00d1\3\2\2\2\24\u00d3\3\2\2\2\26"+
		"\u00d5\3\2\2\2\30\u00d7\3\2\2\2\32\u00d9\3\2\2\2\34\36\5\4\3\2\35\34\3"+
		"\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\""+
		"\3\3\2\2\2#$\7\3\2\2$%\7\26\2\2%)\7$\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*/\3\2\2\2+)\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7%\2\2\63"+
		"\5\3\2\2\2\64\65\7\4\2\2\65\66\7\26\2\2\66\67\5\30\r\2\678\5\26\f\28:"+
		"\7$\2\29;\5\n\6\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=A\3\2\2\2>@"+
		"\5\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2D"+
		"F\5\b\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2"+
		"JL\5\20\t\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\7%\2\2Q\7\3\2\2\2RU\5\22\n\2SU\5\16\b\2TR\3\2\2\2TS\3\2\2\2U\t\3"+
		"\2\2\2VW\7\26\2\2WX\7\5\2\2XY\7\33\2\2Yi\7\6\2\2Z[\7\26\2\2[\\\7\7\2\2"+
		"\\]\5\32\16\2]^\7\5\2\2^_\7\22\2\2_`\7\6\2\2`i\3\2\2\2ab\7\26\2\2bc\7"+
		"\7\2\2cd\7\b\2\2de\7\5\2\2ef\5\20\t\2fg\7\6\2\2gi\3\2\2\2hV\3\2\2\2hZ"+
		"\3\2\2\2ha\3\2\2\2i\13\3\2\2\2jk\5\26\f\2km\7\26\2\2ln\7\5\2\2ml\3\2\2"+
		"\2mn\3\2\2\2np\3\2\2\2oq\5\20\t\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\6"+
		"\2\2s\r\3\2\2\2tu\7\26\2\2uv\7\5\2\2vw\5\20\t\2wx\7\6\2\2x\17\3\2\2\2"+
		"yz\b\t\1\2z{\7\"\2\2{|\5\20\t\2|}\7#\2\2}\u0080\3\2\2\2~\u0080\5\24\13"+
		"\2\177y\3\2\2\2\177~\3\2\2\2\u0080\u0098\3\2\2\2\u0081\u0082\f\13\2\2"+
		"\u0082\u0083\7/\2\2\u0083\u0097\5\20\t\f\u0084\u0085\f\n\2\2\u0085\u0086"+
		"\t\2\2\2\u0086\u0097\5\20\t\13\u0087\u0088\f\t\2\2\u0088\u0089\t\3\2\2"+
		"\u0089\u0097\5\20\t\n\u008a\u008b\f\b\2\2\u008b\u008c\t\4\2\2\u008c\u0097"+
		"\5\20\t\t\u008d\u008e\f\7\2\2\u008e\u008f\t\5\2\2\u008f\u0097\5\20\t\b"+
		"\u0090\u0091\f\6\2\2\u0091\u0092\7+\2\2\u0092\u0097\5\20\t\7\u0093\u0094"+
		"\f\5\2\2\u0094\u0095\7,\2\2\u0095\u0097\5\20\t\6\u0096\u0081\3\2\2\2\u0096"+
		"\u0084\3\2\2\2\u0096\u0087\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008d\3\2"+
		"\2\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009c\7\t\2\2\u009c\u009d\7\"\2\2\u009d\u009e\5\20\t\2\u009e"+
		"\u009f\7#\2\2\u009f\u00a3\7$\2\2\u00a0\u00a2\5\6\4\2\u00a1\u00a0\3\2\2"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a9"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5\b\5\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\f\7\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3\u00d2\3\2\2\2\u00b4"+
		"\u00b5\7\t\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7"+
		"#\2\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\7%\2\2\u00bb"+
		"\u00bc\7\n\2\2\u00bc\u00c0\7\"\2\2\u00bd\u00bf\5\6\4\2\u00be\u00bd\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c6\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\b\5\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00cc\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\5\f\7\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u009b\3\2\2\2\u00d1\u00b4\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d4"+
		"\t\6\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\t\7\2\2\u00d6\27\3\2\2\2\u00d7\u00d8"+
		"\7\20\2\2\u00d8\31\3\2\2\2\u00d9\u00da\7\21\2\2\u00da\33\3\2\2\2\27\37"+
		")/<AGMThmp\177\u0096\u0098\u00a3\u00a9\u00af\u00c0\u00c6\u00cc\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}