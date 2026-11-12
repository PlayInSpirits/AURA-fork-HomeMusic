package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 extends zb1 {
    public final if1 o;
    public boolean p;

    public f61(of4 r1, if1 r2) {
        r1.getClass();
        super(r1);
        this.o = r2;
    }

    @Override // defpackage.zb1, defpackage.of4
    public final void L(tv r2, long r3) {
        if (this.p == false) goto L11;
        r2.skip(r3);
        return;
    L11:
        this.n.L(r2, r3);     // Catch: IOException -> L8
        return;
    L8:
        e = move-exception;
        this.p = true;
        this.o.invoke(e);
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        this.p = true;
        this.o.invoke(e);
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Flushable
    public final void flush() {
        if (this.p == false) goto L10;
        return;
    L10:
        super.flush();     // Catch: IOException -> L7
        return;
    L7:
        e = move-exception;
        this.p = true;
        this.o.invoke(e);
    }
}
