package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk implements of4 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ sk(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.of4
    public final void L(tv r17, long r18) {
        int r2 = this.n;
        Object r3 = this.o;
        Object r0 = this.p;
        switch(r2) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        zz1.i(r17.o, 0, r18);
        long r6 = r18;
    L6:
        if (r6 <= 0) goto L10;
        ((fu4) r0).f();
        t84 r4 = r17.n;
        r4.getClass();
        int r8 = (int) Math.min(r6, r4.c - r4.b);
        ((OutputStream) r3).write(r4.a, r4.b, r8);
        int r9 = r4.b + r8;
        r4.b = r9;
        long r10 = r8;
        r6 = r6 - r10;
        r17.o -= r10;
        if (r9 != r4.c) goto L6;
        r17.n = r4.a();
        a94.a(r4);
        goto L6
    L10:
        return;
    L11:
        zz1.i(r17.o, 0, r18);
        long r7 = r18;
    L13:
        if (r7 <= 0) goto L38;
        t84 r5 = r17.n;
        r5.getClass();
        long r11 = 0;
    L16:
        if (r11 >= 65536) goto L21;
        r11 = r11 + ((long) (r5.c - r5.b));
        if (r11 >= r7) goto L19;
        r5 = r5.f;
        r5.getClass();
        goto L16
    L19:
        r11 = r7;
    L21:
        vh4 r12 = (vh4) r3;
        sk r13 = (sk) r0;
        r12.h();
        r13.L(r17, r11);     // Catch: Throwable -> L28 IOException -> L30
    L24:
        if (r12.i() == true) goto L27;
        r7 = r7 - r11;
        goto L13
    L27:
        throw r12.k(null);
    L28:
        th = move-exception;
        r12.i();
        throw th;
    L30:
        e = move-exception;
        if (r12.i() == true) goto L35;
        throw e;     // Catch: Throwable -> L28
    L35:
        throw r12.k(e);     // Catch: Throwable -> L28
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((OutputStream) r1).close();
        return;
    L6:
        vh4 r2 = (vh4) r1;
        sk r3 = (sk) this.p;
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

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((OutputStream) r1).flush();
        return;
    L6:
        vh4 r2 = (vh4) r1;
        sk r3 = (sk) this.p;
        r2.h();
        r3.flush();     // Catch: Throwable -> L13 IOException -> L15
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

    @Override // defpackage.of4
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
        return "sink(" + ((OutputStream) this.o) + ')';
    L7:
        return "AsyncTimeout.sink(" + ((sk) this.p) + ')';
    }
}
