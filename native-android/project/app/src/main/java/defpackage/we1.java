package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 implements Closeable {
    public static final String[] o = null;
    public static final String[] p = null;
    public static final r72 q = null;
    public static final r72 r = null;
    public final SQLiteDatabase n;

    static {
        o = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        p = new String[0];
        e90 r0 = new e90(5);
        b92 r1 = b92.n;
        q = rr2.K(r1, r0);
        r = rr2.K(r1, new e90(6));
    }

    public we1(SQLiteDatabase r1) {
        this.n = r1;
    }

    public final Cursor F(wo4 r4) {
        final lc r0 = new lc(1, r4);
        SQLiteDatabase.CursorFactory r1 = new ve1(r0);
        String r5 = r4.f();
        String[] r2 = p;
        Cursor r3 = this.n.rawQueryWithFactory(r1, r5, r2, null);
        r3.getClass();
        return r3;
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

    public final df1 j(String r2) {
        r2.getClass();
        SQLiteStatement r1 = this.n.compileStatement(r2);
        r1.getClass();
        return new df1(r1);
    }

    public final void n() {
        this.n.endTransaction();
    }

    public final void q(String r1) {
        this.n.execSQL(r1);
    }

    public final void s(Object[] r2) {
        this.n.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", r2);
    }

    public final int u() {
        return this.n.getVersion();
    }

    public final boolean v() {
        return this.n.inTransaction();
    }
}
