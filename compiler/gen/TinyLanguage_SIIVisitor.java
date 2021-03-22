// Generated from C:/Users/Administrateur/IdeaProjects/compiler/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyLanguage_SIIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyLanguage_SIIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(TinyLanguage_SIIParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(TinyLanguage_SIIParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TinyLanguage_SIIParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#nomvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomvar(TinyLanguage_SIIParser.NomvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(TinyLanguage_SIIParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#ttinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtinst(TinyLanguage_SIIParser.TtinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(TinyLanguage_SIIParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(TinyLanguage_SIIParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(TinyLanguage_SIIParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(TinyLanguage_SIIParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TinyLanguage_SIIParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(TinyLanguage_SIIParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#boucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoucle(TinyLanguage_SIIParser.BoucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(TinyLanguage_SIIParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(TinyLanguage_SIIParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TinyLanguage_SIIParser.PrintContext ctx);
}