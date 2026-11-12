package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk implements ej4 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ tk(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((InputStream) r1).close();
        return;
    L6:
        vh4 r2 = (vh4) r1;
        tk r3 = (tk) this.p;
        r2.h();
        r3.close();     // Catch: Throwable -> L13 IOException -> L15
    L9:
        if (r2.i() == true) goto L12;
        return;
    L12:
        throw r2.k(null);
    L15:
        e = move-exception;
        if (r2.i() == true) goto L20;
        throw e;     // Catch: Throwable -> L13
    L20:
        throw r2.k(e);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r2.i();
        throw th;
    }

    @Override // defpackage.ej4
    public final long read(tv r5, long r6) {
        int r0 = this.n;
        Object r1 = this.o;
        Object r4 = this.p;
        r5.getClass();
        switch(r0) {
            case 0: goto L24;
            default: goto L5;
        };
    L24:
        vh4 r2 = (vh4) r1;
        tk r7 = (tk) r4;
        r2.h();
        long r8 = r7.read(r5, r6);     // Catch: Throwable -> L31 IOException -> L33
    L27:
        if (r2.i() == true) goto L30;
        return r8;
    L30:
        throw r2.k(null);
    L31:
        th = move-exception;
        r2.i();
        throw th;
    L33:
        e = move-exception;
        if (r2.i() == true) goto L38;
        throw e;     // Catch: Throwable -> L31
    L38:
        throw r2.k(e);     // Catch: Throwable -> L31
    L5:
        if (r6 == 0) goto L45;
        if (r6 >= 0) goto L43;
        kf2.e(b11.k("byteCount < 0: ", r6));
        return 0;
    L43:
        ((fu4) r4).f();     // Catch: AssertionError -> L16
        t84 r9 = r5.W(1);     // Catch: AssertionError -> L16
        int r10 = ((InputStream) r1).read(r9.a, r9.c, (int) Math.min(r6, 8192 - r9.c));     // Catch: AssertionError -> L16
        if (r10 == (-1)) goto L11;
        r9.c += r10;     // Catch: AssertionError -> L16
        long r3 = r10;
        r5.o += r3;     // Catch: AssertionError -> L16
        return r3;
    L11:
        if (r9.b != r9.c) goto L44;
        r5.n = r9.a();     // Catch: AssertionError -> L16
        a94.a(r9);     // Catch: AssertionError -> L16
    L44:
        return -1;
    L16:
        e = move-exception;
        if (wr1.E(e) == true) goto L20;
        throw e;
    L20:
        throw new IOException(e);
    L45:
        return 0;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (fu4) this.p;
    L7:
        return (vh4) this.o;
    }

    public final String toString() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return "source(" + ((InputStream) this.o) + ')';
    L7:
        return "AsyncTimeout.source(" + ((tk) this.p) + ')';
    }
}
