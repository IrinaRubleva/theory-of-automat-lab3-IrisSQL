// Generated from IrisSQL.g4 by ANTLR 4.13.2
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
		HASH=48, TREE=49, CONSTRAINT=50, EQ=51, NEQ=52, G=53, GE=54, L=55, LE=56, 
		LPAREN=57, RPAREN=58, COMMA=59, SEMICOLON=60, STAR=61, IDENTIFIER=62, 
		INTEGER_NUM=63, REAL_NUM=64, STRING=65, WS=66;
	public static final int
		RULE_prog = 0, RULE_request = 1, RULE_delete = 2, RULE_createDataBase = 3, 
		RULE_dropDataBase = 4, RULE_createTable = 5, RULE_indexType = 6, RULE_dropTable = 7, 
		RULE_columnDef = 8, RULE_columnModifier = 9, RULE_insert = 10, RULE_selectStatement = 11, 
		RULE_selectCore = 12, RULE_skipClause = 13, RULE_limitClause = 14, RULE_projection = 15, 
		RULE_selectItem = 16, RULE_alter = 17, RULE_constraintDef = 18, RULE_tableRef = 19, 
		RULE_joinClause = 20, RULE_columnList = 21, RULE_whereClause = 22, RULE_orderClause = 23, 
		RULE_orderItem = 24, RULE_groupByClause = 25, RULE_expr = 26, RULE_funcCall = 27, 
		RULE_literal = 28, RULE_dataType = 29, RULE_name = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "request", "delete", "createDataBase", "dropDataBase", "createTable", 
			"indexType", "dropTable", "columnDef", "columnModifier", "insert", "selectStatement", 
			"selectCore", "skipClause", "limitClause", "projection", "selectItem", 
			"alter", "constraintDef", "tableRef", "joinClause", "columnList", "whereClause", 
			"orderClause", "orderItem", "groupByClause", "expr", "funcCall", "literal", 
			"dataType", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'%'", "'+'", "'-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", 
			"'('", "')'", "','", "';'", "'*'"
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
			"DELETE", "SKIP_", "LIMIT", "WITH", "INDEXING", "HASH", "TREE", "CONSTRAINT", 
			"EQ", "NEQ", "G", "GE", "L", "LE", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", 
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
			setState(62);
			request();
			setState(63);
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
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				createDataBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				dropDataBase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				createTable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				dropTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				insert();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				selectStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				delete();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				alter();
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
			setState(75);
			match(DELETE);
			setState(76);
			match(FROM);
			setState(77);
			name();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(78);
				whereClause();
				}
			}

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
			setState(83);
			match(CREATE);
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
			setState(88);
			match(DROP);
			setState(89);
			match(DATABASE);
			setState(90);
			name();
			setState(91);
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
			setState(93);
			match(CREATE);
			setState(94);
			match(TABLE);
			setState(95);
			name();
			setState(96);
			match(LPAREN);
			setState(97);
			columnDef();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				columnDef();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(RPAREN);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(106);
				match(WITH);
				setState(107);
				match(INDEXING);
				setState(108);
				match(BY);
				setState(109);
				indexType();
				}
			}

			setState(112);
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
			setState(114);
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
			setState(116);
			match(DROP);
			setState(117);
			match(TABLE);
			setState(118);
			name();
			setState(119);
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
			setState(121);
			name();
			setState(122);
			dataType();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27262976L) != 0)) {
				{
				{
				setState(123);
				columnModifier();
				}
				}
				setState(128);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(PRIMARY);
				setState(130);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(UNIQUE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(NOT);
				setState(133);
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
			setState(136);
			match(INSERT);
			setState(137);
			match(INTO);
			setState(138);
			name();
			setState(139);
			match(VALUE);
			setState(140);
			match(LPAREN);
			setState(141);
			expr(0);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				expr(0);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(RPAREN);
			setState(150);
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
	public static class SelectStatementContext extends ParserRuleContext {
		public SelectCoreContext selectCore() {
			return getRuleContext(SelectCoreContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IrisSQLParser.SEMICOLON, 0); }
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			selectCore();
			setState(153);
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
	public static class SelectCoreContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(IrisSQLParser.SELECT, 0); }
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(IrisSQLParser.FROM, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
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
		public SelectCoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitSelectCore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectCoreContext selectCore() throws RecognitionException {
		SelectCoreContext _localctx = new SelectCoreContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectCore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SELECT);
			setState(156);
			projection();
			setState(157);
			match(FROM);
			setState(158);
			tableRef();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) {
				{
				{
				setState(159);
				joinClause();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(165);
				whereClause();
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(168);
				groupByClause();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(171);
				orderClause();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_) {
				{
				setState(174);
				skipClause();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(177);
				limitClause();
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
		enterRule(_localctx, 26, RULE_skipClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(SKIP_);
			setState(181);
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
		enterRule(_localctx, 28, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LIMIT);
			setState(184);
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
		enterRule(_localctx, 30, RULE_projection);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
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
				setState(187);
				selectItem();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(189);
					selectItem();
					}
					}
					setState(194);
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
		enterRule(_localctx, 32, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			expr(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(198);
				match(AS);
				setState(199);
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
		public TerminalNode CONSTRAINT() { return getToken(IrisSQLParser.CONSTRAINT, 0); }
		public ConstraintDefContext constraintDef() {
			return getRuleContext(ConstraintDefContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_alter);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ALTER);
				setState(203);
				match(TABLE);
				setState(204);
				name();
				setState(205);
				match(ADD);
				setState(206);
				match(COLUMN);
				setState(207);
				columnDef();
				setState(208);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ALTER);
				setState(211);
				match(TABLE);
				setState(212);
				name();
				setState(213);
				match(DROP);
				setState(214);
				match(COLUMN);
				setState(215);
				name();
				setState(216);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(ALTER);
				setState(219);
				match(TABLE);
				setState(220);
				name();
				setState(221);
				match(EDIT);
				setState(222);
				match(COLUMN);
				setState(223);
				columnDef();
				setState(224);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(ALTER);
				setState(227);
				match(TABLE);
				setState(228);
				name();
				setState(229);
				match(ADD);
				setState(230);
				match(CONSTRAINT);
				setState(231);
				name();
				setState(232);
				constraintDef();
				setState(233);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				match(ALTER);
				setState(236);
				match(TABLE);
				setState(237);
				name();
				setState(238);
				match(DROP);
				setState(239);
				match(CONSTRAINT);
				setState(240);
				name();
				setState(241);
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
	public static class ConstraintDefContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(IrisSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(IrisSQLParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(IrisSQLParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(IrisSQLParser.UNIQUE, 0); }
		public ConstraintDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IrisSQLVisitor ) return ((IrisSQLVisitor<? extends T>)visitor).visitConstraintDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintDefContext constraintDef() throws RecognitionException {
		ConstraintDefContext _localctx = new ConstraintDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraintDef);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(PRIMARY);
				setState(246);
				match(KEY);
				setState(247);
				match(LPAREN);
				setState(248);
				columnList();
				setState(249);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(UNIQUE);
				setState(252);
				match(LPAREN);
				setState(253);
				columnList();
				setState(254);
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
	public static class TableRefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(IrisSQLParser.LPAREN, 0); }
		public SelectCoreContext selectCore() {
			return getRuleContext(SelectCoreContext.class,0);
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
		enterRule(_localctx, 38, RULE_tableRef);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(LPAREN);
				setState(260);
				selectCore();
				setState(261);
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
		enterRule(_localctx, 40, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				setState(265);
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

			setState(268);
			match(JOIN);
			setState(269);
			tableRef();
			setState(270);
			match(ON);
			setState(271);
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
		enterRule(_localctx, 42, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			name();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274);
				match(COMMA);
				setState(275);
				name();
				}
				}
				setState(280);
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
		enterRule(_localctx, 44, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(WHERE);
			setState(282);
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
		enterRule(_localctx, 46, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ORDER);
			setState(285);
			match(BY);
			setState(286);
			orderItem();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				orderItem();
				}
				}
				setState(293);
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
		enterRule(_localctx, 48, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			name();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(295);
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
		enterRule(_localctx, 50, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(GROUP);
			setState(299);
			match(BY);
			setState(300);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(303);
				match(NOT);
				setState(304);
				expr(5);
				}
				break;
			case 2:
				{
				setState(305);
				match(LPAREN);
				setState(306);
				expr(0);
				setState(307);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(309);
				literal();
				}
				break;
			case 4:
				{
				setState(310);
				name();
				}
				break;
			case 5:
				{
				setState(311);
				funcCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(315);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009213693958L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(318);
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
						setState(319);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(321);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 141863388262170624L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(322);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(324);
						((ExprContext)_localctx).op = match(AND);
						setState(325);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(327);
						((ExprContext)_localctx).op = match(OR);
						setState(328);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 54, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			name();
			setState(335);
			match(LPAREN);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 4131758538803L) != 0)) {
				{
				setState(336);
				expr(0);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					expr(0);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(346);
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
		enterRule(_localctx, 56, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 1924145348633L) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 60, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		case 26:
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
		"\u0004\u0001B\u0163\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"J\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"P\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005e\b\u0005\n\u0005\f\u0005h\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"o\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b}\b\b\n\b\f\b\u0080\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0087\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0091\b\n\n\n\f\n\u0094\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00a1\b\f\n\f\f\f\u00a4\t\f\u0001\f\u0003\f\u00a7\b\f\u0001"+
		"\f\u0003\f\u00aa\b\f\u0001\f\u0003\f\u00ad\b\f\u0001\f\u0003\f\u00b0\b"+
		"\f\u0001\f\u0003\f\u00b3\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00bf\b\u000f\n\u000f\f\u000f\u00c2\t\u000f\u0003\u000f\u00c4\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c9\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f4"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0101\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0108\b\u0013\u0001\u0014\u0003\u0014\u010b\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0115\b\u0015\n\u0015\f\u0015\u0118"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0122\b\u0017\n\u0017\f\u0017"+
		"\u0125\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0129\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0139\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u014a\b\u001a\n\u001a\f\u001a\u014d\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0154\b\u001b"+
		"\n\u001b\f\u001b\u0157\t\u001b\u0003\u001b\u0159\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0000\u00014\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000"+
		"\b\u0002\u0000\u0010\u001001\u0001\u0000\"$\u0001\u0000\u0012\u0013\u0002"+
		"\u0000\u0001\u0002==\u0001\u0000\u0003\u0004\u0001\u000038\u0003\u0000"+
		"\u0019\u0019\u001c\u001d?A\u0001\u0000\u001e!\u016f\u0000>\u0001\u0000"+
		"\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000"+
		"\u0006S\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n]\u0001\u0000"+
		"\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000"+
		"\u0010y\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014"+
		"\u0088\u0001\u0000\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018"+
		"\u009b\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000\u001c"+
		"\u00b7\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00c5"+
		"\u0001\u0000\u0000\u0000\"\u00f3\u0001\u0000\u0000\u0000$\u0100\u0001"+
		"\u0000\u0000\u0000&\u0107\u0001\u0000\u0000\u0000(\u010a\u0001\u0000\u0000"+
		"\u0000*\u0111\u0001\u0000\u0000\u0000,\u0119\u0001\u0000\u0000\u0000."+
		"\u011c\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000\u00002\u012a\u0001"+
		"\u0000\u0000\u00004\u0138\u0001\u0000\u0000\u00006\u014e\u0001\u0000\u0000"+
		"\u00008\u015c\u0001\u0000\u0000\u0000:\u015e\u0001\u0000\u0000\u0000<"+
		"\u0160\u0001\u0000\u0000\u0000>?\u0003\u0002\u0001\u0000?@\u0005\u0000"+
		"\u0000\u0001@\u0001\u0001\u0000\u0000\u0000AJ\u0003\u0006\u0003\u0000"+
		"BJ\u0003\b\u0004\u0000CJ\u0003\n\u0005\u0000DJ\u0003\u000e\u0007\u0000"+
		"EJ\u0003\u0014\n\u0000FJ\u0003\u0016\u000b\u0000GJ\u0003\u0004\u0002\u0000"+
		"HJ\u0003\"\u0011\u0000IA\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000"+
		"IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000"+
		"\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005+\u0000\u0000LM\u0005"+
		"\r\u0000\u0000MO\u0003<\u001e\u0000NP\u0003,\u0016\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005"+
		"<\u0000\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000"+
		"TU\u0005\u0006\u0000\u0000UV\u0003<\u001e\u0000VW\u0005<\u0000\u0000W"+
		"\u0007\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000YZ\u0005\u0006\u0000"+
		"\u0000Z[\u0003<\u001e\u0000[\\\u0005<\u0000\u0000\\\t\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0005\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0003<\u001e"+
		"\u0000`a\u00059\u0000\u0000af\u0003\u0010\b\u0000bc\u0005;\u0000\u0000"+
		"ce\u0003\u0010\b\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000in\u0005:\u0000\u0000jk\u0005.\u0000\u0000"+
		"kl\u0005/\u0000\u0000lm\u0005\u0011\u0000\u0000mo\u0003\f\u0006\u0000"+
		"nj\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0005<\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0007\u0000"+
		"\u0000\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\b\u0000\u0000uv\u0005"+
		"\u0007\u0000\u0000vw\u0003<\u001e\u0000wx\u0005<\u0000\u0000x\u000f\u0001"+
		"\u0000\u0000\u0000yz\u0003<\u001e\u0000z~\u0003:\u001d\u0000{}\u0003\u0012"+
		"\t\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0011\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0015\u0000"+
		"\u0000\u0082\u0087\u0005\u0016\u0000\u0000\u0083\u0087\u0005\u0017\u0000"+
		"\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085\u0087\u0005\u0019\u0000"+
		"\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000"+
		"\u008a\u008b\u0003<\u001e\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c"+
		"\u008d\u00059\u0000\u0000\u008d\u0092\u00034\u001a\u0000\u008e\u008f\u0005"+
		";\u0000\u0000\u008f\u0091\u00034\u001a\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005:\u0000\u0000"+
		"\u0096\u0097\u0005<\u0000\u0000\u0097\u0015\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003\u0018\f\u0000\u0099\u009a\u0005<\u0000\u0000\u009a\u0017"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\f\u0000\u0000\u009c\u009d\u0003"+
		"\u001e\u000f\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u00a2\u0003&"+
		"\u0013\u0000\u009f\u00a1\u0003(\u0014\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003,\u0016\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00aa\u00032\u0019\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003.\u0017\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u001a\r\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0003\u001c\u000e\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u0019\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005,\u0000\u0000\u00b5\u00b6\u0005?\u0000"+
		"\u0000\u00b6\u001b\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005-\u0000\u0000"+
		"\u00b8\u00b9\u0005?\u0000\u0000\u00b9\u001d\u0001\u0000\u0000\u0000\u00ba"+
		"\u00c4\u0005=\u0000\u0000\u00bb\u00c0\u0003 \u0010\u0000\u00bc\u00bd\u0005"+
		";\u0000\u0000\u00bd\u00bf\u0003 \u0010\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000"+
		"\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c4\u001f\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u00034\u001a\u0000\u00c6\u00c7\u0005\u0014\u0000\u0000"+
		"\u00c7\u00c9\u0003<\u001e\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\'\u0000\u0000\u00cb\u00cc\u0005\u0007\u0000\u0000\u00cc\u00cd\u0003"+
		"<\u001e\u0000\u00cd\u00ce\u0005)\u0000\u0000\u00ce\u00cf\u0005(\u0000"+
		"\u0000\u00cf\u00d0\u0003\u0010\b\u0000\u00d0\u00d1\u0005<\u0000\u0000"+
		"\u00d1\u00f4\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\'\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d5\u0003<\u001e\u0000\u00d5\u00d6"+
		"\u0005\b\u0000\u0000\u00d6\u00d7\u0005(\u0000\u0000\u00d7\u00d8\u0003"+
		"<\u001e\u0000\u00d8\u00d9\u0005<\u0000\u0000\u00d9\u00f4\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005\'\u0000\u0000\u00db\u00dc\u0005\u0007\u0000\u0000"+
		"\u00dc\u00dd\u0003<\u001e\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de\u00df"+
		"\u0005(\u0000\u0000\u00df\u00e0\u0003\u0010\b\u0000\u00e0\u00e1\u0005"+
		"<\u0000\u0000\u00e1\u00f4\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\'"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0007\u0000\u0000\u00e4\u00e5\u0003<\u001e"+
		"\u0000\u00e5\u00e6\u0005)\u0000\u0000\u00e6\u00e7\u00052\u0000\u0000\u00e7"+
		"\u00e8\u0003<\u001e\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9\u00ea\u0005"+
		"<\u0000\u0000\u00ea\u00f4\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\'"+
		"\u0000\u0000\u00ec\u00ed\u0005\u0007\u0000\u0000\u00ed\u00ee\u0003<\u001e"+
		"\u0000\u00ee\u00ef\u0005\b\u0000\u0000\u00ef\u00f0\u00052\u0000\u0000"+
		"\u00f0\u00f1\u0003<\u001e\u0000\u00f1\u00f2\u0005<\u0000\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ca\u0001\u0000\u0000\u0000\u00f3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00f3\u00da\u0001\u0000\u0000\u0000\u00f3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f4#\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0015\u0000\u0000\u00f6\u00f7\u0005"+
		"\u0016\u0000\u0000\u00f7\u00f8\u00059\u0000\u0000\u00f8\u00f9\u0003*\u0015"+
		"\u0000\u00f9\u00fa\u0005:\u0000\u0000\u00fa\u0101\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\u0017\u0000\u0000\u00fc\u00fd\u00059\u0000\u0000\u00fd"+
		"\u00fe\u0003*\u0015\u0000\u00fe\u00ff\u0005:\u0000\u0000\u00ff\u0101\u0001"+
		"\u0000\u0000\u0000\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00fb\u0001"+
		"\u0000\u0000\u0000\u0101%\u0001\u0000\u0000\u0000\u0102\u0108\u0003<\u001e"+
		"\u0000\u0103\u0104\u00059\u0000\u0000\u0104\u0105\u0003\u0018\f\u0000"+
		"\u0105\u0106\u0005:\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0102\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0108"+
		"\'\u0001\u0000\u0000\u0000\u0109\u010b\u0007\u0001\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005%\u0000\u0000\u010d\u010e\u0003"+
		"&\u0013\u0000\u010e\u010f\u0005&\u0000\u0000\u010f\u0110\u00034\u001a"+
		"\u0000\u0110)\u0001\u0000\u0000\u0000\u0111\u0116\u0003<\u001e\u0000\u0112"+
		"\u0113\u0005;\u0000\u0000\u0113\u0115\u0003<\u001e\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117+\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u000e"+
		"\u0000\u0000\u011a\u011b\u00034\u001a\u0000\u011b-\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005\u0010\u0000\u0000\u011d\u011e\u0005\u0011\u0000\u0000"+
		"\u011e\u0123\u00030\u0018\u0000\u011f\u0120\u0005;\u0000\u0000\u0120\u0122"+
		"\u00030\u0018\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124/\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u0003<\u001e\u0000\u0127\u0129\u0007\u0002\u0000"+
		"\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u01291\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u000f\u0000\u0000"+
		"\u012b\u012c\u0005\u0011\u0000\u0000\u012c\u012d\u0003*\u0015\u0000\u012d"+
		"3\u0001\u0000\u0000\u0000\u012e\u012f\u0006\u001a\uffff\uffff\u0000\u012f"+
		"\u0130\u0005\u0018\u0000\u0000\u0130\u0139\u00034\u001a\u0005\u0131\u0132"+
		"\u00059\u0000\u0000\u0132\u0133\u00034\u001a\u0000\u0133\u0134\u0005:"+
		"\u0000\u0000\u0134\u0139\u0001\u0000\u0000\u0000\u0135\u0139\u00038\u001c"+
		"\u0000\u0136\u0139\u0003<\u001e\u0000\u0137\u0139\u00036\u001b\u0000\u0138"+
		"\u012e\u0001\u0000\u0000\u0000\u0138\u0131\u0001\u0000\u0000\u0000\u0138"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u014b\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\n\n\u0000\u0000\u013b\u013c\u0007\u0003\u0000\u0000\u013c\u014a"+
		"\u00034\u001a\u000b\u013d\u013e\n\t\u0000\u0000\u013e\u013f\u0007\u0004"+
		"\u0000\u0000\u013f\u014a\u00034\u001a\n\u0140\u0141\n\b\u0000\u0000\u0141"+
		"\u0142\u0007\u0005\u0000\u0000\u0142\u014a\u00034\u001a\t\u0143\u0144"+
		"\n\u0007\u0000\u0000\u0144\u0145\u0005\u001a\u0000\u0000\u0145\u014a\u0003"+
		"4\u001a\b\u0146\u0147\n\u0006\u0000\u0000\u0147\u0148\u0005\u001b\u0000"+
		"\u0000\u0148\u014a\u00034\u001a\u0007\u0149\u013a\u0001\u0000\u0000\u0000"+
		"\u0149\u013d\u0001\u0000\u0000\u0000\u0149\u0140\u0001\u0000\u0000\u0000"+
		"\u0149\u0143\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c5\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0003<\u001e\u0000\u014f\u0158"+
		"\u00059\u0000\u0000\u0150\u0155\u00034\u001a\u0000\u0151\u0152\u0005;"+
		"\u0000\u0000\u0152\u0154\u00034\u001a\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u0150\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005:\u0000\u0000\u015b7\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0007\u0006\u0000\u0000\u015d9\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0007\u0007\u0000\u0000\u015f;\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		">\u0000\u0000\u0161=\u0001\u0000\u0000\u0000\u001cIOfn~\u0086\u0092\u00a2"+
		"\u00a6\u00a9\u00ac\u00af\u00b2\u00c0\u00c3\u00c8\u00f3\u0100\u0107\u010a"+
		"\u0116\u0123\u0128\u0138\u0149\u014b\u0155\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}