package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class cf1 implements vo4 {
    public final SQLiteProgram n;

    public cf1(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.n = sQLiteProgram;
    }

    @Override // defpackage.vo4
    public final void c(int i, long j) {
        this.n.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // defpackage.vo4
    public final void d(double d, int i) {
        this.n.bindDouble(i, d);
    }

    @Override // defpackage.vo4
    public final void e(int i) {
        this.n.bindNull(i);
    }

    @Override // defpackage.vo4
    public final void h(int i, String str) {
        str.getClass();
        this.n.bindString(i, str);
    }

    @Override // defpackage.vo4
    public final void x(int i, byte[] bArr) {
        this.n.bindBlob(i, bArr);
    }
}
