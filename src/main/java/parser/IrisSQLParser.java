// Generated from C:/Users/iraru/Desktop/TheoryOfAutomat/lab3/src/main/antlr/IrisSQL.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IrisSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CREATE=5, DATABASE=6, TABLE=7, DROP=8, 
		INSERT=9, INTO=10, VALUE=11, SELECT=12, FROM=13, WHERE=14, GROUP=15, ORDER=16, 
		BY=17, ASC=18, DESC=19, AS=20, PRIMARY=21, KEY=22, UNIQUE=23, NOT=24, 
		NULL=25, AND=26, OR=27, TRUE=28, FALSE=29, TEXT=30, LOGIC=31, INTEGER_TYPE=32, 
		REAL_TYPE=33, LEFT=34, RIGHT=35, FULL=36, JOIN=37, ON=38, ALTER=39, COLUMN=40, 
		ADD=41, EDIT=42, DELETE=43, SKIP_=44, LIMIT=45, WITH=46, INDEXING=47, 
		HASH=48, TREE=49, EQ=50, NEQ=51, G=52, GE=53, L=54, LE=55, LPAREN=56, 
		RPAREN=57, COMMA=58, SEMICOLON=59, STAR=60, IDENTIFIER=61, INTEGER_NUM=62, 
		REAL_NUM=63, STRING=64, WS=65;
	public static final int
		RULE_prog = 0, RULE_request = 1, RULE_delete = 2, RULE_createDataBase = 3, 
		RULE_dropDataBase = 4, RULE_createTable = 5, RULE_indexType = 6, RULE_dropTable = 7, 
		RULE_columnDef = 8, RULE_columnModifier = 9, RULE_insert = 10, RULE_select = 11, 
		RULE_skipClause = 12, RULE_limitClause = 13, RULE_projection = 14, RULE_selectItem = 15, 
		RULE_alter = 16, RULE_tableRef = 17, RULE_joinClause = 18, RULE_columnList = 19, 
		RULE_whereClause = 20, RULE_orderClause = 21, RULE_orderItem = 22, RULE_groupByClause = 23, 
		RULE_expr = 24, RULE_funcCall = 25, RULE_literal = 26, RULE_dataType = 27, 
		RULE_name = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "request", "delete", "createDataBase", "dropDataBase", "createTable", 
			"indexType", "dropTable", "columnDef", "columnModifier", "insert", "select", 
			"skipClause", "limitClause", "projection", "selectItem", "alter", "tableRef", 
			"joinClause", "columnList", "whereClause", "orderClause", "orderItem", 
			"groupByClause", "expr", "funcCall", "literal", "dataType", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'%'", "'+'", "'-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'('", 
			"')'", "','", "';'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CREATE", "DATABASE", "TABLE", "DROP", 
			"INSERT", "INTO", "VALUE", "SELECT", "FROM", "WHERE", "GROUP", "ORDER", 
			"BY", "ASC", "DESC", "AS", "PRIMARY", "KEY", "UNIQUE", "NOT", "NULL", 
			"AND", "OR", "TRUE", "FALSE", "TEXT", "LOGIC", "INTEGER_TYPE", "REAL_TYPE", 
			"LEFT", "RIGHT", "FULL", "JOIN", "ON", "ALTER", "COLUMN", "ADD", "EDIT", 
			"DELETE", "SKIP_", "LIMIT", "WITH", "INDEXING", "HASH", "TREE", "EQ", 
			"NEQ", "G", "GE", "L", "LE", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", 
			"STAR", "IDENTIFIER", "INTEGER_NUM", "REAL_NUM", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "IrisSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IrisSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public RequestContext request() {
			return getRuleContext(RequestContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IrisSQLParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			request();
			setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RequestContext extends ParserRuleContext {
		public CreateDataBaseContext createDataBase() {
			return getRuleContext(CreateDataBaseContext.class,0);
		}
		public DropDataBaseContext dropDataBase() {
			return getRuleContext(DropDataBaseContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_request);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				createDataBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				dropDataBase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				createTable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				dropTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				insert();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				select();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				delete();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(IrisSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(IrisSQLParser.FROM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(DELETE);
			setState(71);
			match(FROM);
			setState(72);
			name();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(73);
				whereClause();
				}
			}

			setState(76);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDataBaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(IrisSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(IrisSQLParser.DATABASE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public CreateDataBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDataBase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitCreateDataBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDataBaseContext createDataBase() throws RecognitionException {
		CreateDataBaseContext _localctx = new CreateDataBaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createDataBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CREATE);
			setState(79);
			match(DATABASE);
			setState(80);
			name();
			setState(81);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DropDataBaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(IrisSQLParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(IrisSQLParser.DATABASE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public DropDataBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDataBase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitDropDataBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDataBaseContext dropDataBase() throws RecognitionException {
		DropDataBaseContext _localctx = new DropDataBaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dropDataBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(DROP);
			setState(84);
			match(DATABASE);
			setState(85);
			name();
			setState(86);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(IrisSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(IrisSQLParser.TABLE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IrisSQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IrisSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IrisSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(IrisSQLParser.WITH, 0); }
		public TerminalNode INDEXING() { return getToken(IrisSQLParser.INDEXING, 0); }
		public TerminalNode BY() { return getToken(IrisSQLParser.BY, 0); }
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CREATE);
			setState(89);
			match(TABLE);
			setState(90);
			name();
			setState(91);
			match(LPAREN);
			setState(92);
			columnDef();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				columnDef();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RPAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(101);
				match(WITH);
				setState(102);
				match(INDEXING);
				setState(103);
				match(BY);
				setState(104);
				indexType();
				}
			}

			setState(107);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexTypeContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(IrisSQLParser.ORDER, 0); }
		public TerminalNode HASH() { return getToken(IrisSQLParser.HASH, 0); }
		public TerminalNode TREE() { return getToken(IrisSQLParser.TREE, 0); }
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitIndexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_indexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 844424930197504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(IrisSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(IrisSQLParser.TABLE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DROP);
			setState(112);
			match(TABLE);
			setState(113);
			name();
			setState(114);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnModifierContext> columnModifier() {
			return getRuleContexts(ColumnModifierContext.class);
		}
		public ColumnModifierContext columnModifier(int i) {
			return getRuleContext(ColumnModifierContext.class,i);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			name();
			setState(117);
			dataType();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27262976L) != 0)) {
				{
				{
				setState(118);
				columnModifier();
				}
				}
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnModifierContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(IrisSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(IrisSQLParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(IrisSQLParser.UNIQUE, 0); }
		public TerminalNode NOT() { return getToken(IrisSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(IrisSQLParser.NULL, 0); }
		public ColumnModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitColumnModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnModifierContext columnModifier() throws RecognitionException {
		ColumnModifierContext _localctx = new ColumnModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnModifier);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(PRIMARY);
				setState(125);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(UNIQUE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(NOT);
				setState(128);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(IrisSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(IrisSQLParser.INTO, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(IrisSQLParser.VALUE, 0); }
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IrisSQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IrisSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IrisSQLParser.COMMA, i);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(INSERT);
			setState(132);
			match(INTO);
			setState(133);
			name();
			setState(134);
			match(VALUE);
			setState(135);
			match(LPAREN);
			setState(136);
			expr(0);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				expr(0);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RPAREN);
			setState(145);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(IrisSQLParser.SELECT, 0); }
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IrisSQLParser.FROM, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public SkipClauseContext skipClause() {
			return getRuleContext(SkipClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SELECT);
			setState(148);
			projection();
			setState(149);
			match(FROM);
			setState(150);
			tableRef();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) {
				{
				{
				setState(151);
				joinClause();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(157);
				whereClause();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(160);
				orderClause();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_) {
				{
				setState(163);
				skipClause();
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(166);
				limitClause();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(169);
				groupByClause();
				}
			}

			setState(172);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SkipClauseContext extends ParserRuleContext {
		public TerminalNode SKIP_() { return getToken(IrisSQLParser.SKIP_, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IrisSQLParser.INTEGER_NUM, 0); }
		public SkipClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitSkipClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipClauseContext skipClause() throws RecognitionException {
		SkipClauseContext _localctx = new SkipClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_skipClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(SKIP_);
			setState(175);
			match(INTEGER_NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(IrisSQLParser.LIMIT, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(IrisSQLParser.INTEGER_NUM, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LIMIT);
			setState(178);
			match(INTEGER_NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(IrisSQLParser.STAR, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IrisSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IrisSQLParser.COMMA, i);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_projection);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(STAR);
				}
				break;
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IDENTIFIER:
			case INTEGER_NUM:
			case REAL_NUM:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				selectItem();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182);
					match(COMMA);
					setState(183);
					selectItem();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(IrisSQLParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			expr(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(192);
				match(AS);
				setState(193);
				name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(IrisSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(IrisSQLParser.TABLE, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode ADD() { return getToken(IrisSQLParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(IrisSQLParser.COLUMN, 0); }
		public ColumnDefContext columnDef() {
			return getRuleContext(ColumnDefContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public TerminalNode DROP() { return getToken(IrisSQLParser.DROP, 0); }
		public TerminalNode EDIT() { return getToken(IrisSQLParser.EDIT, 0); }
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alter);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(ALTER);
				setState(197);
				match(TABLE);
				setState(198);
				name();
				setState(199);
				match(ADD);
				setState(200);
				match(COLUMN);
				setState(201);
				columnDef();
				setState(202);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ALTER);
				setState(205);
				match(TABLE);
				setState(206);
				name();
				setState(207);
				match(DROP);
				setState(208);
				match(COLUMN);
				setState(209);
				name();
				setState(210);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(ALTER);
				setState(213);
				match(TABLE);
				setState(214);
				name();
				setState(215);
				match(EDIT);
				setState(216);
				match(COLUMN);
				setState(217);
				columnDef();
				setState(218);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableRefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IrisSQLParser.RPAREN, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitTableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableRef);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(LPAREN);
				setState(224);
				select();
				setState(225);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(IrisSQLParser.JOIN, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode ON() { return getToken(IrisSQLParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(IrisSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(IrisSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(IrisSQLParser.FULL, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				setState(229);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(232);
			match(JOIN);
			setState(233);
			tableRef();
			setState(234);
			match(ON);
			setState(235);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnListContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IrisSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IrisSQLParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			name();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				name();
				}
				}
				setState(244);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(IrisSQLParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(WHERE);
			setState(246);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(IrisSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(IrisSQLParser.BY, 0); }
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IrisSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IrisSQLParser.COMMA, i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ORDER);
			setState(249);
			match(BY);
			setState(250);
			orderItem();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				orderItem();
				}
				}
				setState(257);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderItemContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(IrisSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(IrisSQLParser.DESC, 0); }
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitOrderItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			name();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(IrisSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(IrisSQLParser.BY, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(GROUP);
			setState(263);
			match(BY);
			setState(264);
			columnList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NOT() { return getToken(IrisSQLParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(IrisSQLParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode STAR() { return getToken(IrisSQLParser.STAR, 0); }
		public TerminalNode EQ() { return getToken(IrisSQLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(IrisSQLParser.NEQ, 0); }
		public TerminalNode G() { return getToken(IrisSQLParser.G, 0); }
		public TerminalNode GE() { return getToken(IrisSQLParser.GE, 0); }
		public TerminalNode L() { return getToken(IrisSQLParser.L, 0); }
		public TerminalNode LE() { return getToken(IrisSQLParser.LE, 0); }
		public TerminalNode AND() { return getToken(IrisSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(IrisSQLParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(267);
				match(NOT);
				setState(268);
				expr(5);
				}
				break;
			case 2:
				{
				setState(269);
				match(LPAREN);
				setState(270);
				expr(0);
				setState(271);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(273);
				literal();
				}
				break;
			case 4:
				{
				setState(274);
				name();
				}
				break;
			case 5:
				{
				setState(275);
				funcCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(279);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606846982L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(282);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(285);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70931694131085312L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(288);
						((ExprContext)_localctx).op = match(AND);
						setState(289);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(291);
						((ExprContext)_localctx).op = match(OR);
						setState(292);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(IrisSQLParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IrisSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IrisSQLParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			name();
			setState(299);
			match(LPAREN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 2065879269427L) != 0)) {
				{
				setState(300);
				expr(0);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(301);
					match(COMMA);
					setState(302);
					expr(0);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(310);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(IrisSQLParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUM() { return getToken(IrisSQLParser.REAL_NUM, 0); }
		public TerminalNode STRING() { return getToken(IrisSQLParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(IrisSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(IrisSQLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(IrisSQLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 962072674329L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(IrisSQLParser.TEXT, 0); }
		public TerminalNode INTEGER_TYPE() { return getToken(IrisSQLParser.INTEGER_TYPE, 0); }
		public TerminalNode REAL_TYPE() { return getToken(IrisSQLParser.REAL_TYPE, 0); }
		public TerminalNode LOGIC() { return getToken(IrisSQLParser.LOGIC, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IrisSQLParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(IDENTIFIER);
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
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001E\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002K\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005"+
		"c\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005j\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0082\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u008c\b\n\n\n\f\n\u008f\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0099\b\u000b\n\u000b\f\u000b\u009c\t\u000b\u0001\u000b\u0003\u000b\u009f"+
		"\b\u000b\u0001\u000b\u0003\u000b\u00a2\b\u000b\u0001\u000b\u0003\u000b"+
		"\u00a5\b\u000b\u0001\u000b\u0003\u000b\u00a8\b\u000b\u0001\u000b\u0003"+
		"\u000b\u00ab\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00b9\b\u000e\n\u000e\f\u000e\u00bc\t\u000e\u0003\u000e\u00be\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c3\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00dd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00e4\b\u0011\u0001\u0012\u0003\u0012\u00e7\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00f1\b\u0013\n\u0013\f\u0013\u00f4"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00fe\b\u0015\n\u0015\f\u0015"+
		"\u0101\t\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0105\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0115\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0126\b\u0018\n\u0018\f\u0018\u0129\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0130\b\u0019"+
		"\n\u0019\f\u0019\u0133\t\u0019\u0003\u0019\u0135\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0000\u00010\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\b"+
		"\u0002\u0000\u0010\u001001\u0001\u0000\"$\u0001\u0000\u0012\u0013\u0002"+
		"\u0000\u0001\u0002<<\u0001\u0000\u0003\u0004\u0001\u000027\u0003\u0000"+
		"\u0019\u0019\u001c\u001d>@\u0001\u0000\u001e!\u0149\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000"+
		"\u0006N\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nX\u0001\u0000"+
		"\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000"+
		"\u0010t\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014"+
		"\u0083\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018"+
		"\u00ae\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c"+
		"\u00bd\u0001\u0000\u0000\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00dc"+
		"\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u00e6\u0001"+
		"\u0000\u0000\u0000&\u00ed\u0001\u0000\u0000\u0000(\u00f5\u0001\u0000\u0000"+
		"\u0000*\u00f8\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000."+
		"\u0106\u0001\u0000\u0000\u00000\u0114\u0001\u0000\u0000\u00002\u012a\u0001"+
		"\u0000\u0000\u00004\u0138\u0001\u0000\u0000\u00006\u013a\u0001\u0000\u0000"+
		"\u00008\u013c\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005"+
		"\u0000\u0000\u0001<\u0001\u0001\u0000\u0000\u0000=E\u0003\u0006\u0003"+
		"\u0000>E\u0003\b\u0004\u0000?E\u0003\n\u0005\u0000@E\u0003\u000e\u0007"+
		"\u0000AE\u0003\u0014\n\u0000BE\u0003\u0016\u000b\u0000CE\u0003\u0004\u0002"+
		"\u0000D=\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000D?\u0001\u0000"+
		"\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000"+
		"\u0000FG\u0005+\u0000\u0000GH\u0005\r\u0000\u0000HJ\u00038\u001c\u0000"+
		"IK\u0003(\u0014\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0005;\u0000\u0000M\u0005\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0005\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u00038\u001c"+
		"\u0000QR\u0005;\u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0005\b\u0000"+
		"\u0000TU\u0005\u0006\u0000\u0000UV\u00038\u001c\u0000VW\u0005;\u0000\u0000"+
		"W\t\u0001\u0000\u0000\u0000XY\u0005\u0005\u0000\u0000YZ\u0005\u0007\u0000"+
		"\u0000Z[\u00038\u001c\u0000[\\\u00058\u0000\u0000\\a\u0003\u0010\b\u0000"+
		"]^\u0005:\u0000\u0000^`\u0003\u0010\b\u0000_]\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000di\u00059\u0000"+
		"\u0000ef\u0005.\u0000\u0000fg\u0005/\u0000\u0000gh\u0005\u0011\u0000\u0000"+
		"hj\u0003\f\u0006\u0000ie\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0005;\u0000\u0000l\u000b\u0001\u0000\u0000"+
		"\u0000mn\u0007\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u0005\b"+
		"\u0000\u0000pq\u0005\u0007\u0000\u0000qr\u00038\u001c\u0000rs\u0005;\u0000"+
		"\u0000s\u000f\u0001\u0000\u0000\u0000tu\u00038\u001c\u0000uy\u00036\u001b"+
		"\u0000vx\u0003\u0012\t\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0011\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0015\u0000\u0000"+
		"}\u0082\u0005\u0016\u0000\u0000~\u0082\u0005\u0017\u0000\u0000\u007f\u0080"+
		"\u0005\u0018\u0000\u0000\u0080\u0082\u0005\u0019\u0000\u0000\u0081|\u0001"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005\t\u0000"+
		"\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u0086\u00038\u001c\u0000"+
		"\u0086\u0087\u0005\u000b\u0000\u0000\u0087\u0088\u00058\u0000\u0000\u0088"+
		"\u008d\u00030\u0018\u0000\u0089\u008a\u0005:\u0000\u0000\u008a\u008c\u0003"+
		"0\u0018\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u00059\u0000\u0000\u0091\u0092\u0005;\u0000\u0000"+
		"\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0094\u0005\f\u0000\u0000\u0094"+
		"\u0095\u0003\u001c\u000e\u0000\u0095\u0096\u0005\r\u0000\u0000\u0096\u009a"+
		"\u0003\"\u0011\u0000\u0097\u0099\u0003$\u0012\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0003"+
		"(\u0014\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003*\u0015"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\u001a\r\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003.\u0017\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005;\u0000\u0000\u00ad\u0017\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005,\u0000\u0000\u00af\u00b0\u0005>\u0000"+
		"\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005-\u0000\u0000"+
		"\u00b2\u00b3\u0005>\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4"+
		"\u00be\u0005<\u0000\u0000\u00b5\u00ba\u0003\u001e\u000f\u0000\u00b6\u00b7"+
		"\u0005:\u0000\u0000\u00b7\u00b9\u0003\u001e\u000f\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00b4\u0001"+
		"\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000\u00be\u001d\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u00030\u0018\u0000\u00c0\u00c1\u0005\u0014"+
		"\u0000\u0000\u00c1\u00c3\u00038\u001c\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u001f\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\'\u0000\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000"+
		"\u00c6\u00c7\u00038\u001c\u0000\u00c7\u00c8\u0005)\u0000\u0000\u00c8\u00c9"+
		"\u0005(\u0000\u0000\u00c9\u00ca\u0003\u0010\b\u0000\u00ca\u00cb\u0005"+
		";\u0000\u0000\u00cb\u00dd\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\'"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0007\u0000\u0000\u00ce\u00cf\u00038\u001c"+
		"\u0000\u00cf\u00d0\u0005\b\u0000\u0000\u00d0\u00d1\u0005(\u0000\u0000"+
		"\u00d1\u00d2\u00038\u001c\u0000\u00d2\u00d3\u0005;\u0000\u0000\u00d3\u00dd"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\'\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0007\u0000\u0000\u00d6\u00d7\u00038\u001c\u0000\u00d7\u00d8\u0005*\u0000"+
		"\u0000\u00d8\u00d9\u0005(\u0000\u0000\u00d9\u00da\u0003\u0010\b\u0000"+
		"\u00da\u00db\u0005;\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00c4\u0001\u0000\u0000\u0000\u00dc\u00cc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d4\u0001\u0000\u0000\u0000\u00dd!\u0001\u0000\u0000\u0000\u00de\u00e4"+
		"\u00038\u001c\u0000\u00df\u00e0\u00058\u0000\u0000\u00e0\u00e1\u0003\u0016"+
		"\u000b\u0000\u00e1\u00e2\u00059\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000"+
		"\u0000\u00e4#\u0001\u0000\u0000\u0000\u00e5\u00e7\u0007\u0001\u0000\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005%\u0000\u0000\u00e9"+
		"\u00ea\u0003\"\u0011\u0000\u00ea\u00eb\u0005&\u0000\u0000\u00eb\u00ec"+
		"\u00030\u0018\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00f2\u00038"+
		"\u001c\u0000\u00ee\u00ef\u0005:\u0000\u0000\u00ef\u00f1\u00038\u001c\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\'\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005\u000e\u0000\u0000\u00f6\u00f7\u00030\u0018\u0000\u00f7)\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005\u0010\u0000\u0000\u00f9\u00fa\u0005"+
		"\u0011\u0000\u0000\u00fa\u00ff\u0003,\u0016\u0000\u00fb\u00fc\u0005:\u0000"+
		"\u0000\u00fc\u00fe\u0003,\u0016\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100+\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0104\u00038\u001c\u0000\u0103\u0105"+
		"\u0007\u0002\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\u000f\u0000\u0000\u0107\u0108\u0005\u0011\u0000\u0000\u0108\u0109\u0003"+
		"&\u0013\u0000\u0109/\u0001\u0000\u0000\u0000\u010a\u010b\u0006\u0018\uffff"+
		"\uffff\u0000\u010b\u010c\u0005\u0018\u0000\u0000\u010c\u0115\u00030\u0018"+
		"\u0005\u010d\u010e\u00058\u0000\u0000\u010e\u010f\u00030\u0018\u0000\u010f"+
		"\u0110\u00059\u0000\u0000\u0110\u0115\u0001\u0000\u0000\u0000\u0111\u0115"+
		"\u00034\u001a\u0000\u0112\u0115\u00038\u001c\u0000\u0113\u0115\u00032"+
		"\u0019\u0000\u0114\u010a\u0001\u0000\u0000\u0000\u0114\u010d\u0001\u0000"+
		"\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0127\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\n\n\u0000\u0000\u0117\u0118\u0007\u0003\u0000"+
		"\u0000\u0118\u0126\u00030\u0018\u000b\u0119\u011a\n\t\u0000\u0000\u011a"+
		"\u011b\u0007\u0004\u0000\u0000\u011b\u0126\u00030\u0018\n\u011c\u011d"+
		"\n\b\u0000\u0000\u011d\u011e\u0007\u0005\u0000\u0000\u011e\u0126\u0003"+
		"0\u0018\t\u011f\u0120\n\u0007\u0000\u0000\u0120\u0121\u0005\u001a\u0000"+
		"\u0000\u0121\u0126\u00030\u0018\b\u0122\u0123\n\u0006\u0000\u0000\u0123"+
		"\u0124\u0005\u001b\u0000\u0000\u0124\u0126\u00030\u0018\u0007\u0125\u0116"+
		"\u0001\u0000\u0000\u0000\u0125\u0119\u0001\u0000\u0000\u0000\u0125\u011c"+
		"\u0001\u0000\u0000\u0000\u0125\u011f\u0001\u0000\u0000\u0000\u0125\u0122"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u01281\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0003"+
		"8\u001c\u0000\u012b\u0134\u00058\u0000\u0000\u012c\u0131\u00030\u0018"+
		"\u0000\u012d\u012e\u0005:\u0000\u0000\u012e\u0130\u00030\u0018\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u012c\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u00059\u0000\u0000\u01373\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0007\u0006\u0000\u0000\u01395\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0007\u0007\u0000\u0000\u013b7\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005=\u0000\u0000\u013d9\u0001\u0000\u0000\u0000\u001b"+
		"DJaiy\u0081\u008d\u009a\u009e\u00a1\u00a4\u00a7\u00aa\u00ba\u00bd\u00c2"+
		"\u00dc\u00e3\u00e6\u00f2\u00ff\u0104\u0114\u0125\u0127\u0131\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}