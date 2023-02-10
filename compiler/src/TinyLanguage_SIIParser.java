// Generated from C:/Users/Administrateur/IdeaProjects/CompilerSII/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLanguage_SIIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMPIL=7, Start=8, Int=9, 
		String=10, Float=11, Then=12, Else=13, If=14, DoWhile=15, Do=16, Print=17, 
		Scan=18, NomProg=19, ID=20, EntierS=21, Entier=22, ReelS=23, Reel=24, 
		OPL=25, OPH=26, Op=27, Comp=28, AFF=29, PLUS=30, MINUS=31, MUL=32, DIV=33, 
		SUP=34, INF=35, EQ=36, DIF=37, COMM1L=38, COMM2L=39, ESPACE=40, Space=41;
	public static final int
		RULE_programme = 0, RULE_declar = 1, RULE_dec = 2, RULE_type = 3, RULE_desc = 4, 
		RULE_inst = 5, RULE_instif = 6, RULE_comp = 7, RULE_aff = 8, RULE_el = 9, 
		RULE_opr = 10, RULE_t = 11, RULE_exp = 12, RULE_val = 13, RULE_boucle = 14, 
		RULE_doo = 15, RULE_scan = 16, RULE_print = 17, RULE_ids = 18, RULE_id = 19, 
		RULE_idp = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declar", "dec", "type", "desc", "inst", "instif", "comp", 
			"aff", "el", "opr", "t", "exp", "val", "boucle", "doo", "scan", "print", 
			"ids", "id", "idp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'('", "')'", "','", "'compil '", "'start'", 
			"'intCompil'", "'stringCompil'", "'floatCompil'", "'then'", "'else'", 
			"'if'", "'while'", "'do'", "'printCompil'", "'scanCompil'", null, null, 
			null, null, null, null, null, null, null, null, "'='", "'+'", "'-'", 
			"'*'", "'/'", "'>'", "'<'", "'=='", "'!='", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "COMPIL", "Start", "Int", "String", 
			"Float", "Then", "Else", "If", "DoWhile", "Do", "Print", "Scan", "NomProg", 
			"ID", "EntierS", "Entier", "ReelS", "Reel", "OPL", "OPH", "Op", "Comp", 
			"AFF", "PLUS", "MINUS", "MUL", "DIV", "SUP", "INF", "EQ", "DIF", "COMM1L", 
			"COMM2L", "ESPACE", "Space"
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
	public String getGrammarFileName() { return "TinyLanguage_SII.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyLanguage_SIIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(TinyLanguage_SIIParser.COMPIL, 0); }
		public TerminalNode NomProg() { return getToken(TinyLanguage_SIIParser.NomProg, 0); }
		public DeclarContext declar() {
			return getRuleContext(DeclarContext.class,0);
		}
		public TerminalNode Start() { return getToken(TinyLanguage_SIIParser.Start, 0); }
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(COMPIL);
			setState(43);
			match(NomProg);
			setState(44);
			match(T__0);
			setState(45);
			declar(0);
			setState(46);
			match(Start);
			setState(47);
			desc();
			setState(48);
			match(T__1);
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

	public static class DeclarContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public DeclarContext declar() {
			return getRuleContext(DeclarContext.class,0);
		}
		public DeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarContext declar() throws RecognitionException {
		return declar(0);
	}

	private DeclarContext declar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarContext _localctx = new DeclarContext(_ctx, _parentState);
		DeclarContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_declar, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			dec();
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declar);
					setState(53);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(54);
					dec();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			ids();
			setState(62);
			match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(TinyLanguage_SIIParser.Int, 0); }
		public TerminalNode Float() { return getToken(TinyLanguage_SIIParser.Float, 0); }
		public TerminalNode String() { return getToken(TinyLanguage_SIIParser.String, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Float))) != 0)) ) {
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

	public static class DescContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_desc);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				inst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				inst();
				setState(68);
				desc();
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

	public static class InstContext extends ParserRuleContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public InstifContext instif() {
			return getRuleContext(InstifContext.class,0);
		}
		public AffContext aff() {
			return getRuleContext(AffContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inst);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				comp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				instif();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				aff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				boucle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				scan();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				print();
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

	public static class InstifContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TinyLanguage_SIIParser.If, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode Then() { return getToken(TinyLanguage_SIIParser.Then, 0); }
		public List<DescContext> desc() {
			return getRuleContexts(DescContext.class);
		}
		public DescContext desc(int i) {
			return getRuleContext(DescContext.class,i);
		}
		public ElContext el() {
			return getRuleContext(ElContext.class,0);
		}
		public InstifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterInstif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitInstif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitInstif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstifContext instif() throws RecognitionException {
		InstifContext _localctx = new InstifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(If);
			setState(81);
			match(T__3);
			setState(82);
			comp();
			setState(83);
			match(T__4);
			setState(84);
			match(Then);
			setState(85);
			match(T__0);
			setState(86);
			desc();
			setState(87);
			match(T__1);
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case If:
			case Do:
			case Print:
			case Scan:
			case ID:
			case EntierS:
			case Entier:
			case ReelS:
			case Reel:
				{
				}
				break;
			case Else:
				{
				setState(89);
				el();
				setState(90);
				match(T__0);
				setState(91);
				desc();
				setState(92);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CompContext extends ParserRuleContext {
		public List<OprContext> opr() {
			return getRuleContexts(OprContext.class);
		}
		public OprContext opr(int i) {
			return getRuleContext(OprContext.class,i);
		}
		public TerminalNode Comp() { return getToken(TinyLanguage_SIIParser.Comp, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			opr(0);
			setState(97);
			match(Comp);
			setState(98);
			opr(0);
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

	public static class AffContext extends ParserRuleContext {
		public IdpContext idp() {
			return getRuleContext(IdpContext.class,0);
		}
		public TerminalNode AFF() { return getToken(TinyLanguage_SIIParser.AFF, 0); }
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public AffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitAff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitAff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffContext aff() throws RecognitionException {
		AffContext _localctx = new AffContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			idp();
			setState(101);
			match(AFF);
			setState(102);
			opr(0);
			setState(103);
			match(T__2);
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

	public static class ElContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TinyLanguage_SIIParser.Else, 0); }
		public ElContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitEl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElContext el() throws RecognitionException {
		ElContext _localctx = new ElContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_el);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Else);
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

	public static class OprContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public TerminalNode OPL() { return getToken(TinyLanguage_SIIParser.OPL, 0); }
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		return opr(0);
	}

	private OprContext opr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OprContext _localctx = new OprContext(_ctx, _parentState);
		OprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_opr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_opr);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111);
					match(OPL);
					setState(112);
					t(0);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode OPH() { return getToken(TinyLanguage_SIIParser.OPH, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_t);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(OPH);
					setState(123);
					exp();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case EntierS:
			case Entier:
			case ReelS:
			case Reel:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				val();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__3);
				setState(131);
				opr(0);
				setState(132);
				match(T__4);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode Entier() { return getToken(TinyLanguage_SIIParser.Entier, 0); }
		public TerminalNode Reel() { return getToken(TinyLanguage_SIIParser.Reel, 0); }
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public TerminalNode EntierS() { return getToken(TinyLanguage_SIIParser.EntierS, 0); }
		public TerminalNode ReelS() { return getToken(TinyLanguage_SIIParser.ReelS, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << EntierS) | (1L << Entier) | (1L << ReelS) | (1L << Reel))) != 0)) ) {
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

	public static class BoucleContext extends ParserRuleContext {
		public DooContext doo() {
			return getRuleContext(DooContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public TerminalNode DoWhile() { return getToken(TinyLanguage_SIIParser.DoWhile, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitBoucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitBoucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			doo();
			setState(139);
			match(T__0);
			setState(140);
			desc();
			setState(141);
			match(T__1);
			setState(142);
			match(DoWhile);
			setState(143);
			match(T__3);
			setState(144);
			comp();
			setState(145);
			match(T__4);
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

	public static class DooContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(TinyLanguage_SIIParser.Do, 0); }
		public DooContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterDoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitDoo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitDoo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DooContext doo() throws RecognitionException {
		DooContext _localctx = new DooContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Do);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode Scan() { return getToken(TinyLanguage_SIIParser.Scan, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Scan);
			setState(150);
			match(T__3);
			setState(151);
			id();
			setState(152);
			match(T__4);
			setState(153);
			match(T__2);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(TinyLanguage_SIIParser.Print, 0); }
		public IdpContext idp() {
			return getRuleContext(IdpContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Print);
			setState(156);
			match(T__3);
			setState(157);
			idp();
			setState(158);
			match(T__4);
			setState(159);
			match(T__2);
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ids);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(ID);
				setState(162);
				match(T__5);
				setState(163);
				ids();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(ID);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_id);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID);
				setState(168);
				match(T__5);
				setState(169);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(ID);
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

	public static class IdpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public IdpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterIdp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitIdp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitIdp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdpContext idp() throws RecognitionException {
		IdpContext _localctx = new IdpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
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
		case 1:
			return declar_sempred((DeclarContext)_localctx, predIndex);
		case 10:
			return opr_sempred((OprContext)_localctx, predIndex);
		case 11:
			return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declar_sempred(DeclarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean opr_sempred(OprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\ft\n\f\f\f\16"+
		"\fw\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\177\n\r\f\r\16\r\u0082\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00a8\n\24\3\25\3\25\3\25"+
		"\3\25\5\25\u00ae\n\25\3\26\3\26\3\26\2\5\4\26\30\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\4\3\2\13\r\3\2\26\32\2\u00a9\2,\3\2\2\2"+
		"\4\64\3\2\2\2\6>\3\2\2\2\bB\3\2\2\2\nH\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2"+
		"\20b\3\2\2\2\22f\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30x\3\2\2\2\32\u0088"+
		"\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u0095\3\2\2\2\"\u0097\3\2"+
		"\2\2$\u009d\3\2\2\2&\u00a7\3\2\2\2(\u00ad\3\2\2\2*\u00af\3\2\2\2,-\7\t"+
		"\2\2-.\7\25\2\2./\7\3\2\2/\60\5\4\3\2\60\61\7\n\2\2\61\62\5\n\6\2\62\63"+
		"\7\4\2\2\63\3\3\2\2\2\64\65\b\3\1\2\65\66\5\6\4\2\66;\3\2\2\2\678\f\4"+
		"\2\28:\5\6\4\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=;"+
		"\3\2\2\2>?\5\b\5\2?@\5&\24\2@A\7\5\2\2A\7\3\2\2\2BC\t\2\2\2C\t\3\2\2\2"+
		"DI\5\f\7\2EF\5\f\7\2FG\5\n\6\2GI\3\2\2\2HD\3\2\2\2HE\3\2\2\2I\13\3\2\2"+
		"\2JQ\5\20\t\2KQ\5\16\b\2LQ\5\22\n\2MQ\5\36\20\2NQ\5\"\22\2OQ\5$\23\2P"+
		"J\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\r\3\2\2\2"+
		"RS\7\20\2\2ST\7\6\2\2TU\5\20\t\2UV\7\7\2\2VW\7\16\2\2WX\7\3\2\2XY\5\n"+
		"\6\2Y`\7\4\2\2Za\3\2\2\2[\\\5\24\13\2\\]\7\3\2\2]^\5\n\6\2^_\7\4\2\2_"+
		"a\3\2\2\2`Z\3\2\2\2`[\3\2\2\2a\17\3\2\2\2bc\5\26\f\2cd\7\36\2\2de\5\26"+
		"\f\2e\21\3\2\2\2fg\5*\26\2gh\7\37\2\2hi\5\26\f\2ij\7\5\2\2j\23\3\2\2\2"+
		"kl\7\17\2\2l\25\3\2\2\2mn\b\f\1\2no\5\30\r\2ou\3\2\2\2pq\f\4\2\2qr\7\33"+
		"\2\2rt\5\30\r\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\27\3\2\2\2wu"+
		"\3\2\2\2xy\b\r\1\2yz\5\32\16\2z\u0080\3\2\2\2{|\f\4\2\2|}\7\34\2\2}\177"+
		"\5\32\16\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\31\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0089\5\34\17\2\u0084"+
		"\u0085\7\6\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7\7\2\2\u0087\u0089\3"+
		"\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0089\33\3\2\2\2\u008a"+
		"\u008b\t\3\2\2\u008b\35\3\2\2\2\u008c\u008d\5 \21\2\u008d\u008e\7\3\2"+
		"\2\u008e\u008f\5\n\6\2\u008f\u0090\7\4\2\2\u0090\u0091\7\21\2\2\u0091"+
		"\u0092\7\6\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\7\2\2\u0094\37\3\2\2"+
		"\2\u0095\u0096\7\22\2\2\u0096!\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u0099"+
		"\7\6\2\2\u0099\u009a\5(\25\2\u009a\u009b\7\7\2\2\u009b\u009c\7\5\2\2\u009c"+
		"#\3\2\2\2\u009d\u009e\7\23\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\5*\26\2"+
		"\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7\5\2\2\u00a2%\3\2\2\2\u00a3\u00a4\7"+
		"\26\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a8\5&\24\2\u00a6\u00a8\7\26\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\'\3\2\2\2\u00a9\u00aa\7\26\2"+
		"\2\u00aa\u00ab\7\b\2\2\u00ab\u00ae\5(\25\2\u00ac\u00ae\7\26\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae)\3\2\2\2\u00af\u00b0\7\26\2\2"+
		"\u00b0+\3\2\2\2\13;HP`u\u0080\u0088\u00a7\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}