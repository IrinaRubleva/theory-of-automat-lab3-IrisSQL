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
		INSERT=9, INTO=10, VALUE=11, SELECT=12, FROM=13, WHERE=14, ORDER=15, BY=16, 
		ASC=17, DESC=18, AS=19, PRIMARY=20, KEY=21, UNIQUE=22, NOT=23, NULL=24, 
		AND=25, OR=26, TRUE=27, FALSE=28, TEXT=29, LOGIC=30, INTEGER_TYPE=31, 
		REAL_TYPE=32, EQ=33, NEQ=34, LPAREN=35, RPAREN=36, COMMA=37, SEMICOLON=38, 
		STAR=39, IDENTIFIER=40, INTEGER_NUM=41, REAL_NUM=42, STRING=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_request = 1, RULE_createDataBase = 2, RULE_dropDataBase = 3, 
		RULE_createTable = 4, RULE_dropTable = 5, RULE_columnDef = 6, RULE_columnModifier = 7, 
		RULE_insert = 8, RULE_select = 9, RULE_projection = 10, RULE_selectItem = 11, 
		RULE_tableRef = 12, RULE_whereClause = 13, RULE_orderClause = 14, RULE_orderItem = 15, 
		RULE_expr = 16, RULE_literal = 17, RULE_dataType = 18, RULE_name = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "request", "createDataBase", "dropDataBase", "createTable", "dropTable", 
			"columnDef", "columnModifier", "insert", "select", "projection", "selectItem", 
			"tableRef", "whereClause", "orderClause", "orderItem", "expr", "literal", 
			"dataType", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'%'", "'+'", "'-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'='", "'<>'", 
			"'('", "')'", "','", "';'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CREATE", "DATABASE", "TABLE", "DROP", 
			"INSERT", "INTO", "VALUE", "SELECT", "FROM", "WHERE", "ORDER", "BY", 
			"ASC", "DESC", "AS", "PRIMARY", "KEY", "UNIQUE", "NOT", "NULL", "AND", 
			"OR", "TRUE", "FALSE", "TEXT", "LOGIC", "INTEGER_TYPE", "REAL_TYPE", 
			"EQ", "NEQ", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", "STAR", "IDENTIFIER", 
			"INTEGER_NUM", "REAL_NUM", "STRING", "WS"
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
			setState(40);
			request();
			setState(41);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				createDataBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				dropDataBase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				createTable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				dropTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				insert();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				select();
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
		enterRule(_localctx, 4, RULE_createDataBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CREATE);
			setState(52);
			match(DATABASE);
			setState(53);
			name();
			setState(54);
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
		enterRule(_localctx, 6, RULE_dropDataBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DROP);
			setState(57);
			match(DATABASE);
			setState(58);
			name();
			setState(59);
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
		enterRule(_localctx, 8, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CREATE);
			setState(62);
			match(TABLE);
			setState(63);
			name();
			setState(64);
			match(LPAREN);
			setState(65);
			columnDef();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(66);
				match(COMMA);
				setState(67);
				columnDef();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(RPAREN);
			setState(74);
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
		enterRule(_localctx, 10, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DROP);
			setState(77);
			match(TABLE);
			setState(78);
			name();
			setState(79);
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
		enterRule(_localctx, 12, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			name();
			setState(82);
			dataType();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13631488L) != 0)) {
				{
				{
				setState(83);
				columnModifier();
				}
				}
				setState(88);
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
		enterRule(_localctx, 14, RULE_columnModifier);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(PRIMARY);
				setState(90);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(UNIQUE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(NOT);
				setState(93);
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
		enterRule(_localctx, 16, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(INSERT);
			setState(97);
			match(INTO);
			setState(98);
			name();
			setState(99);
			match(VALUE);
			setState(100);
			match(LPAREN);
			setState(101);
			expr(0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				expr(0);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RPAREN);
			setState(110);
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
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
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
		enterRule(_localctx, 18, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SELECT);
			setState(113);
			projection();
			setState(114);
			match(FROM);
			setState(115);
			tableRef();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(116);
				whereClause();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(119);
				orderClause();
				}
			}

			setState(122);
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
		enterRule(_localctx, 20, RULE_projection);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
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
				setState(125);
				selectItem();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
					selectItem();
					}
					}
					setState(132);
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
		enterRule(_localctx, 22, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expr(0);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(136);
				match(AS);
				setState(137);
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
		enterRule(_localctx, 24, RULE_tableRef);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(LPAREN);
				setState(142);
				select();
				setState(143);
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
		enterRule(_localctx, 26, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(WHERE);
			setState(148);
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
		enterRule(_localctx, 28, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ORDER);
			setState(151);
			match(BY);
			setState(152);
			orderItem();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				orderItem();
				}
				}
				setState(159);
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
		enterRule(_localctx, 30, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			name();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(161);
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
		public TerminalNode STAR() { return getToken(IrisSQLParser.STAR, 0); }
		public TerminalNode EQ() { return getToken(IrisSQLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(IrisSQLParser.NEQ, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(165);
				match(NOT);
				setState(166);
				expr(4);
				}
				break;
			case LPAREN:
				{
				setState(167);
				match(LPAREN);
				setState(168);
				expr(0);
				setState(169);
				match(RPAREN);
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case INTEGER_NUM:
			case REAL_NUM:
			case STRING:
				{
				setState(171);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				setState(172);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755813894L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
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
						setState(180);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(185);
						((ExprContext)_localctx).op = match(AND);
						setState(186);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(188);
						((ExprContext)_localctx).op = match(OR);
						setState(189);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393582219264L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		case 16:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004E\b\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006U\b\u0006\n\u0006\f\u0006"+
		"X\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007_\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\bi\b\b\n\b\f\bl\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tv\b\t\u0001\t\u0003\ty\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0081\b\n\n\n\f\n\u0084"+
		"\t\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0092\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u009c\b\u000e\n\u000e\f\u000e\u009f\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00a3\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00ae\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00bf\b\u0010\n\u0010\f\u0010\u00c2\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001"+
		" \u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0006\u0001\u0000\u0011\u0012\u0002\u0000"+
		"\u0001\u0002\'\'\u0001\u0000\u0003\u0004\u0001\u0000!\"\u0003\u0000\u0018"+
		"\u0018\u001b\u001c)+\u0001\u0000\u001d \u00cf\u0000(\u0001\u0000\u0000"+
		"\u0000\u00021\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006"+
		"8\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fQ\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"`\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000\u0000\u0014\u0085\u0001"+
		"\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u0091\u0001"+
		"\u0000\u0000\u0000\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u0096\u0001"+
		"\u0000\u0000\u0000\u001e\u00a0\u0001\u0000\u0000\u0000 \u00ad\u0001\u0000"+
		"\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000"+
		"\u0000&\u00c7\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005"+
		"\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+2\u0003\u0004\u0002"+
		"\u0000,2\u0003\u0006\u0003\u0000-2\u0003\b\u0004\u0000.2\u0003\n\u0005"+
		"\u0000/2\u0003\u0010\b\u000002\u0003\u0012\t\u00001+\u0001\u0000\u0000"+
		"\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003"+
		"\u0001\u0000\u0000\u000034\u0005\u0005\u0000\u000045\u0005\u0006\u0000"+
		"\u000056\u0003&\u0013\u000067\u0005&\u0000\u00007\u0005\u0001\u0000\u0000"+
		"\u000089\u0005\b\u0000\u00009:\u0005\u0006\u0000\u0000:;\u0003&\u0013"+
		"\u0000;<\u0005&\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0005\u0005"+
		"\u0000\u0000>?\u0005\u0007\u0000\u0000?@\u0003&\u0013\u0000@A\u0005#\u0000"+
		"\u0000AF\u0003\f\u0006\u0000BC\u0005%\u0000\u0000CE\u0003\f\u0006\u0000"+
		"DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000IJ\u0005$\u0000\u0000JK\u0005&\u0000\u0000K\t\u0001\u0000"+
		"\u0000\u0000LM\u0005\b\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0003&"+
		"\u0013\u0000OP\u0005&\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0003"+
		"&\u0013\u0000RV\u0003$\u0012\u0000SU\u0003\u000e\u0007\u0000TS\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0014\u0000\u0000Z_\u0005\u0015\u0000\u0000[_\u0005\u0016\u0000"+
		"\u0000\\]\u0005\u0017\u0000\u0000]_\u0005\u0018\u0000\u0000^Y\u0001\u0000"+
		"\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_\u000f"+
		"\u0001\u0000\u0000\u0000`a\u0005\t\u0000\u0000ab\u0005\n\u0000\u0000b"+
		"c\u0003&\u0013\u0000cd\u0005\u000b\u0000\u0000de\u0005#\u0000\u0000ej"+
		"\u0003 \u0010\u0000fg\u0005%\u0000\u0000gi\u0003 \u0010\u0000hf\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mn\u0005$\u0000\u0000no\u0005&\u0000\u0000o\u0011\u0001\u0000\u0000"+
		"\u0000pq\u0005\f\u0000\u0000qr\u0003\u0014\n\u0000rs\u0005\r\u0000\u0000"+
		"su\u0003\u0018\f\u0000tv\u0003\u001a\r\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wy\u0003\u001c\u000e"+
		"\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0005&\u0000\u0000{\u0013\u0001\u0000\u0000\u0000|\u0086"+
		"\u0005\'\u0000\u0000}\u0082\u0003\u0016\u000b\u0000~\u007f\u0005%\u0000"+
		"\u0000\u007f\u0081\u0003\u0016\u000b\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085"+
		"}\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0003 \u0010\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089\u008b\u0003"+
		"&\u0013\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u0092\u0003&\u0013"+
		"\u0000\u008d\u008e\u0005#\u0000\u0000\u008e\u008f\u0003\u0012\t\u0000"+
		"\u008f\u0090\u0005$\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008c\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0092"+
		"\u0019\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u000e\u0000\u0000\u0094"+
		"\u0095\u0003 \u0010\u0000\u0095\u001b\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\u000f\u0000\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u009d"+
		"\u0003\u001e\u000f\u0000\u0099\u009a\u0005%\u0000\u0000\u009a\u009c\u0003"+
		"\u001e\u000f\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u001d\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0003&\u0013\u0000\u00a1\u00a3\u0007\u0000"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u001f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\u0010"+
		"\uffff\uffff\u0000\u00a5\u00a6\u0005\u0017\u0000\u0000\u00a6\u00ae\u0003"+
		" \u0010\u0004\u00a7\u00a8\u0005#\u0000\u0000\u00a8\u00a9\u0003 \u0010"+
		"\u0000\u00a9\u00aa\u0005$\u0000\u0000\u00aa\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ae\u0003\"\u0011\u0000\u00ac\u00ae\u0003&\u0013\u0000\u00ad"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00c0\u0001\u0000\u0000\u0000\u00af\u00b0\n\t\u0000\u0000\u00b0\u00b1"+
		"\u0007\u0001\u0000\u0000\u00b1\u00bf\u0003 \u0010\n\u00b2\u00b3\n\b\u0000"+
		"\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000\u00b4\u00bf\u0003 \u0010\t"+
		"\u00b5\u00b6\n\u0007\u0000\u0000\u00b6\u00b7\u0007\u0003\u0000\u0000\u00b7"+
		"\u00bf\u0003 \u0010\b\u00b8\u00b9\n\u0006\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0019\u0000\u0000\u00ba\u00bf\u0003 \u0010\u0007\u00bb\u00bc\n\u0005"+
		"\u0000\u0000\u00bc\u00bd\u0005\u001a\u0000\u0000\u00bd\u00bf\u0003 \u0010"+
		"\u0006\u00be\u00af\u0001\u0000\u0000\u0000\u00be\u00b2\u0001\u0000\u0000"+
		"\u0000\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000\u0000"+
		"\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0007\u0004\u0000\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0007\u0005\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005(\u0000\u0000\u00c8\'\u0001\u0000\u0000\u0000\u00101FV^jux\u0082"+
		"\u0085\u008a\u0091\u009d\u00a2\u00ad\u00be\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}