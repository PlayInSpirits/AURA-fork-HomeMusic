package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zn0 implements of4 {
    public final /* synthetic */ int n;
    public boolean o;
    public final Object p;
    public final Object q;

    public zn0(hq1 r2) {
        this.n = 1;
        this.q = r2;
        this.p = new cc1(((ew) r2.e).timeout());
    }

    @Override // defpackage.of4
    public final void L(tv r13, long r14) {
        int r0 = this.n;
        Object r1 = this.q;
        switch(r0) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        zz1.i(r13.o, 0, r14);
        long r15 = r14;
    L11:
        if (r15 <= 0) goto L16;
        t84 r2 = r13.n;
        r2.getClass();
        int r3 = (int) Math.min(r15, r2.c - r2.b);
        ((Deflater) r1).setInput(r2.a, r2.b, r3);
        b(false);
        long r5 = r3;
        r13.o -= r5;
        int r4 = r2.b + r3;
        r2.b = r4;
        if (r4 != r2.c) goto L15;
        r13.n = r2.a();
        a94.a(r2);
    L15:
        r15 = r15 - r5;
        goto L11
    L16:
        return;
    L5:
        if (this.o == true) goto L7;
        xe5.a(r13.o, 0, r14);
        ((ew) ((hq1) r1).e).L(r13, r14);
        return;
    L7:
        kf2.o("closed");
    }

    public void b(boolean r8) {
        Deflater r0 = (Deflater) this.q;
        wu3 r7 = (wu3) this.p;
        tv r1 = r7.o;
    L3:
        t84 r2 = r1.W(1);
        byte[] r3 = r2.a;
        int r4 = r2.c;
        if (r8 == true) goto L19;
        int r5 = r0.deflate(r3, r4, 8192 - r4);     // Catch: NullPointerException -> L16
    L8:
        if (r5 > 0) goto L9;
        if (r0.needsInput() == false) goto L3;
        if (r2.b != r2.c) goto L27;
        r1.n = r2.a();
        a94.a(r2);
        return;
    L27:
        return;
    L9:
        r2.c += r5;
        r1.o += (long) r5;
        r7.b();
        goto L3
    L19:
        r5 = r0.deflate(r3, r4, 8192 - r4, 2);     // Catch: NullPointerException -> L16
    L16:
        e = move-exception;
        throw new IOException("Deflater already closed", e);
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int r0 = this.n;
        Object r1 = this.p;
        Object r3 = this.q;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        hq1 r4 = (hq1) r3;
        if (this.o == true) goto L35;
        this.o = true;
        cc1 r2 = (cc1) r1;
        fu4 r5 = r2.e;
        r2.e = fu4.d;
        r5.a();
        r5.b();
        r4.a = 3;
        return;
    L35:
        return;
    L9:
        Deflater r6 = (Deflater) r3;
        if (this.o == true) goto L36;
        r6.finish();     // Catch: Throwable -> L14
        b(false);     // Catch: Throwable -> L14
        th = null;
    L33:
        r6.end();     // Catch: Throwable -> L17
    L29:
        ((wu3) r1).close();     // Catch: Throwable -> L22
    L25:
        this.o = true;
        if (th != null) goto L28;
        return;
    L28:
        throw th;
    L22:
        th = move-exception;
        if (th != null) goto L25;
        th = th;
    L17:
        th = move-exception;
        if (th != null) goto L29;
        th = th;
    L14:
        th = th;
        goto L33
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() {
        switch(this.n) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        b(true);
        ((wu3) this.p).flush();
        return;
    L5:
        if (this.o == true) goto L11;
        ((ew) ((hq1) this.q).e).flush();
        return;
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        int r0 = this.n;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (cc1) r1;
    L7:
        return ((wu3) r1).n.timeout();
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "DeflaterSink(" + ((wu3) this.p) + ')';
    }

    public zn0(wu3 r2, Deflater r3) {
        this.n = 0;
        this.p = r2;
        this.q = r3;
    }
}
