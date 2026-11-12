package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 implements Closeable {
    public static final String[] o = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] p = new String[0];
    public static final r72 q;
    public static final r72 r;
    public final SQLiteDatabase n;

    static {
        e90 e90Var = new e90(5);
        b92 b92Var = b92.n;
        q = rr2.K(b92Var, e90Var);
        r = rr2.K(b92Var, new e90(6));
    }

    public we1(SQLiteDatabase sQLiteDatabase) {
        this.n = sQLiteDatabase;
    }

    public final Cursor F(wo4 wo4Var) {
        final lc lcVar = new lc(1, wo4Var);
        Cursor cursorRawQueryWithFactory = this.n.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ve1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) lcVar.d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, wo4Var.f(), p, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    public final void H() {
        this.n.setTransactionSuccessful();
    }

    public final void b() {
        this.n.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    public final void f() {
        this.n.beginTransactionNonExclusive();
    }

    public final df1 j(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.n.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new df1(sQLiteStatementCompileStatement);
    }

    public final void n() {
        this.n.endTransaction();
    }

    public final void q(String str) {
        this.n.execSQL(str);
    }

    public final void s(Object[] objArr) {
        this.n.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final int u() {
        return this.n.getVersion();
    }

    public final boolean v() {
        return this.n.inTransaction();
    }
}
