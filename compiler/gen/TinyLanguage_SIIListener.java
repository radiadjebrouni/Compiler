// Generated from C:/Users/Administrateur/IdeaProjects/compiler/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyLanguage_SIIParser}.
 */
public interface TinyLanguage_SIIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(TinyLanguage_SIIParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(TinyLanguage_SIIParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(TinyLanguage_SIIParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(TinyLanguage_SIIParser.DeclarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TinyLanguage_SIIParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TinyLanguage_SIIParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#nomvar}.
	 * @param ctx the parse tree
	 */
	void enterNomvar(TinyLanguage_SIIParser.NomvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#nomvar}.
	 * @param ctx the parse tree
	 */
	void exitNomvar(TinyLanguage_SIIParser.NomvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(TinyLanguage_SIIParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(TinyLanguage_SIIParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#ttinst}.
	 * @param ctx the parse tree
	 */
	void enterTtinst(TinyLanguage_SIIParser.TtinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#ttinst}.
	 * @param ctx the parse tree
	 */
	void exitTtinst(TinyLanguage_SIIParser.TtinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(TinyLanguage_SIIParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(TinyLanguage_SIIParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(TinyLanguage_SIIParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(TinyLanguage_SIIParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(TinyLanguage_SIIParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(TinyLanguage_SIIParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(TinyLanguage_SIIParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(TinyLanguage_SIIParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TinyLanguage_SIIParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TinyLanguage_SIIParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(TinyLanguage_SIIParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(TinyLanguage_SIIParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(TinyLanguage_SIIParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(TinyLanguage_SIIParser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(TinyLanguage_SIIParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(TinyLanguage_SIIParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(TinyLanguage_SIIParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(TinyLanguage_SIIParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TinyLanguage_SIIParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TinyLanguage_SIIParser.PrintContext ctx);
}