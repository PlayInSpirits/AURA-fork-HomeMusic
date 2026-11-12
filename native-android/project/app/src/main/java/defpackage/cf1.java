package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cf1 implements vo4 {
    public final SQLiteProgram n;

    public cf1(SQLiteProgram r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // defpackage.vo4
    public final void c(int r1, long r2) {
        this.n.bindLong(r1, r2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // defpackage.vo4
    public final void d(double r1, int r3) {
        this.n.bindDouble(r3, r1);
    }

    @Override // defpackage.vo4
    public final void e(int r1) {
        this.n.bindNull(r1);
    }

    @Override // defpackage.vo4
    public final void h(int r1, String r2) {
        r2.getClass();
        this.n.bindString(r1, r2);
    }

    @Override // defpackage.vo4
    public final void x(int r1, byte[] r2) {
        this.n.bindBlob(r1, r2);
    }
}
