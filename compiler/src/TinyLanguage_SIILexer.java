// Generated from C:/Users/Administrateur/IdeaProjects/CompilerSII/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLanguage_SIILexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "COMPIL", "Start", "Int", 
			"String", "Float", "Then", "Else", "If", "DoWhile", "Do", "Print", "Scan", 
			"NomProg", "ID", "EntierS", "Entier", "ReelS", "Reel", "OPL", "OPH", 
			"Op", "Comp", "AFF", "PLUS", "MINUS", "MUL", "DIV", "SUP", "INF", "EQ", 
			"DIF", "COMM1L", "COMM2L", "ESPACE", "Space"
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


	public TinyLanguage_SIILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyLanguage_SII.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00c2"+
		"\n\24\f\24\16\24\u00c5\13\24\3\24\7\24\u00c8\n\24\f\24\16\24\u00cb\13"+
		"\24\3\24\7\24\u00ce\n\24\f\24\16\24\u00d1\13\24\3\24\3\24\7\24\u00d5\n"+
		"\24\f\24\16\24\u00d8\13\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de\13\24"+
		"\3\24\3\24\3\25\3\25\7\25\u00e4\n\25\f\25\16\25\u00e7\13\25\3\26\3\26"+
		"\3\26\6\26\u00ec\n\26\r\26\16\26\u00ed\3\26\3\26\3\27\6\27\u00f3\n\27"+
		"\r\27\16\27\u00f4\3\30\3\30\3\30\6\30\u00fa\n\30\r\30\16\30\u00fb\3\30"+
		"\5\30\u00ff\n\30\3\30\6\30\u0102\n\30\r\30\16\30\u0103\3\30\3\30\3\31"+
		"\6\31\u0109\n\31\r\31\16\31\u010a\3\31\5\31\u010e\n\31\3\31\6\31\u0111"+
		"\n\31\r\31\16\31\u0112\3\32\3\32\5\32\u0117\n\32\3\33\3\33\5\33\u011b"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u0121\n\34\3\35\3\35\3\35\3\35\5\35\u0127"+
		"\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\7\'\u0140\n\'\f\'\16\'\u0143\13\'\3\'\3\'\3(\3(\3("+
		"\3(\7(\u014b\n(\f(\16(\u014e\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3\u014c\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\n\3\2C\\\5\2\"\"C\\c|\4\2"+
		"C\\c|\5\2\62;C\\c|\4\2--//\3\2\62;\3\2\f\f\5\2\13\f\17\17\"\"\2\u0173"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a"+
		"\3\2\2\2\21i\3\2\2\2\23o\3\2\2\2\25y\3\2\2\2\27\u0086\3\2\2\2\31\u0092"+
		"\3\2\2\2\33\u0097\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3\2\2\2!\u00a5\3\2"+
		"\2\2#\u00a8\3\2\2\2%\u00b4\3\2\2\2\'\u00bf\3\2\2\2)\u00e1\3\2\2\2+\u00e8"+
		"\3\2\2\2-\u00f2\3\2\2\2/\u00f6\3\2\2\2\61\u0108\3\2\2\2\63\u0116\3\2\2"+
		"\2\65\u011a\3\2\2\2\67\u0120\3\2\2\29\u0126\3\2\2\2;\u0128\3\2\2\2=\u012a"+
		"\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C\u0130\3\2\2\2E\u0132\3\2\2\2G"+
		"\u0134\3\2\2\2I\u0136\3\2\2\2K\u0139\3\2\2\2M\u013c\3\2\2\2O\u0146\3\2"+
		"\2\2Q\u0154\3\2\2\2S\u0158\3\2\2\2UV\7}\2\2V\4\3\2\2\2WX\7\177\2\2X\6"+
		"\3\2\2\2YZ\7=\2\2Z\b\3\2\2\2[\\\7*\2\2\\\n\3\2\2\2]^\7+\2\2^\f\3\2\2\2"+
		"_`\7.\2\2`\16\3\2\2\2ab\7e\2\2bc\7q\2\2cd\7o\2\2de\7r\2\2ef\7k\2\2fg\7"+
		"n\2\2gh\7\"\2\2h\20\3\2\2\2ij\7u\2\2jk\7v\2\2kl\7c\2\2lm\7t\2\2mn\7v\2"+
		"\2n\22\3\2\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2rs\7E\2\2st\7q\2\2tu\7o\2\2u"+
		"v\7r\2\2vw\7k\2\2wx\7n\2\2x\24\3\2\2\2yz\7u\2\2z{\7v\2\2{|\7t\2\2|}\7"+
		"k\2\2}~\7p\2\2~\177\7i\2\2\177\u0080\7E\2\2\u0080\u0081\7q\2\2\u0081\u0082"+
		"\7o\2\2\u0082\u0083\7r\2\2\u0083\u0084\7k\2\2\u0084\u0085\7n\2\2\u0085"+
		"\26\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7n\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7v\2\2\u008b\u008c\7E\2\2\u008c\u008d\7q\2\2"+
		"\u008d\u008e\7o\2\2\u008e\u008f\7r\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7n\2\2\u0091\30\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7p\2\2\u0096\32\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\34\3\2\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7h\2\2\u009e\36\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1"+
		"\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		" \3\2\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7q\2\2\u00a7\"\3\2\2\2\u00a8"+
		"\u00a9\7r\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2"+
		"\u00ac\u00ad\7v\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af\7q\2\2\u00af\u00b0"+
		"\7o\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"$\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7E\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7o\2\2"+
		"\u00bb\u00bc\7r\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be&\3\2\2"+
		"\2\u00bf\u00c3\t\2\2\2\u00c0\u00c2\t\3\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c8\5Q)\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cf\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00ce\5S*\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d6\7*\2\2\u00d3\u00d5\5Q)\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dc\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00db\5S*\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\7+\2\2\u00e0(\3\2\2\2\u00e1\u00e5\t\4\2\2\u00e2\u00e4"+
		"\t\5\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6*\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9"+
		"\u00eb\t\6\2\2\u00ea\u00ec\t\7\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\7+\2\2\u00f0,\3\2\2\2\u00f1\u00f3\t\7\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5.\3\2\2\2"+
		"\u00f6\u00f7\7*\2\2\u00f7\u00f9\t\6\2\2\u00f8\u00fa\t\7\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00ff\7\60\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\t\7\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\7+\2\2\u0106\60\3\2\2\2\u0107\u0109\t\7\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010e\7\60\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\t\7\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\62\3\2\2"+
		"\2\u0114\u0117\5=\37\2\u0115\u0117\5? \2\u0116\u0114\3\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\64\3\2\2\2\u0118\u011b\5C\"\2\u0119\u011b\5A!\2\u011a\u0118"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b\66\3\2\2\2\u011c\u0121\5=\37\2\u011d"+
		"\u0121\5A!\2\u011e\u0121\5? \2\u011f\u0121\5C\"\2\u0120\u011c\3\2\2\2"+
		"\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u01218\3"+
		"\2\2\2\u0122\u0127\5E#\2\u0123\u0127\5I%\2\u0124\u0127\5G$\2\u0125\u0127"+
		"\5K&\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127:\3\2\2\2\u0128\u0129\7?\2\2\u0129<\3\2\2\2\u012a"+
		"\u012b\7-\2\2\u012b>\3\2\2\2\u012c\u012d\7/\2\2\u012d@\3\2\2\2\u012e\u012f"+
		"\7,\2\2\u012fB\3\2\2\2\u0130\u0131\7\61\2\2\u0131D\3\2\2\2\u0132\u0133"+
		"\7@\2\2\u0133F\3\2\2\2\u0134\u0135\7>\2\2\u0135H\3\2\2\2\u0136\u0137\7"+
		"?\2\2\u0137\u0138\7?\2\2\u0138J\3\2\2\2\u0139\u013a\7#\2\2\u013a\u013b"+
		"\7?\2\2\u013bL\3\2\2\2\u013c\u013d\7\61\2\2\u013d\u0141\7\61\2\2\u013e"+
		"\u0140\n\b\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\b\'\2\2\u0145N\3\2\2\2\u0146\u0147\7\61\2\2\u0147\u0148\7,\2\2"+
		"\u0148\u014c\3\2\2\2\u0149\u014b\13\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7,\2\2\u0150\u0151\7\61\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\b(\2\2\u0153P\3\2\2\2\u0154\u0155\t\t\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\b)\2\2\u0157R\3\2\2\2\u0158\u0159\7\"\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\b*\2\2\u015bT\3\2\2\2\27\2\u00c3\u00c9\u00cf\u00d6"+
		"\u00dc\u00e5\u00ed\u00f4\u00fb\u00fe\u0103\u010a\u010d\u0112\u0116\u011a"+
		"\u0120\u0126\u0141\u014c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}