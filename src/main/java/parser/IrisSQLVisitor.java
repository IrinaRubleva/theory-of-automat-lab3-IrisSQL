// Generated from C:/Users/iraru/Desktop/TheoryOfAutomat/lab3/src/main/antlr/IrisSQL.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IrisSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IrisSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IrisSQLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(IrisSQLParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(IrisSQLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#createDataBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDataBase(IrisSQLParser.CreateDataBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#dropDataBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDataBase(IrisSQLParser.DropDataBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(IrisSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(IrisSQLParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(IrisSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(IrisSQLParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#columnModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnModifier(IrisSQLParser.ColumnModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(IrisSQLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(IrisSQLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#skipClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipClause(IrisSQLParser.SkipClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(IrisSQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(IrisSQLParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(IrisSQLParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(IrisSQLParser.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#tableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRef(IrisSQLParser.TableRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(IrisSQLParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(IrisSQLParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(IrisSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#orderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderClause(IrisSQLParser.OrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#orderItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderItem(IrisSQLParser.OrderItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(IrisSQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IrisSQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(IrisSQLParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(IrisSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(IrisSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IrisSQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(IrisSQLParser.NameContext ctx);
}