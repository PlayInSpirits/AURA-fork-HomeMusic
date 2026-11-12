package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 implements ej4 {
    public final xu3 n;
    public final Inflater o;
    public int p;
    public boolean q;

    public wy1(xu3 r1, Inflater r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.q == false) goto L5;
        return;
    L5:
        this.o.end();
        this.q = true;
        this.n.close();
    }

    @Override // defpackage.ej4
    public final long read(tv r11, long r12) {
        r11.getClass();
    L4:
        if (r12 < 0) goto L48;
        if (this.q == true) goto L46;
        xu3 r3 = this.n;
        Inflater r4 = this.o;
        if (r12 != 0) goto L50;
    L9:
        long r8 = 0;
    L29:
        if (r8 > 0) goto L30;
        if (r4.finished() == true) goto L41;
        if (r4.needsDictionary() == true) goto L59;
        if (r3.l() == false) goto L4;
        throw new EOFException("source exhausted prematurely");
    L59:
        return -1;
    L41:
        return -1;
    L30:
        return r8;
    L50:
        t84 r2 = r11.W(1);     // Catch: DataFormatException -> L43
        int r5 = (int) Math.min(r12, 8192 - r2.c);     // Catch: DataFormatException -> L43
        if (r4.needsInput() == true) goto L15;
    L18:
        int r6 = r4.inflate(r2.a, r2.c, r5);     // Catch: DataFormatException -> L43
        int r7 = this.p;     // Catch: DataFormatException -> L43
        if (r7 == 0) goto L22;
        int r9 = r7 - r4.getRemaining();     // Catch: DataFormatException -> L43
        this.p -= r9;     // Catch: DataFormatException -> L43
        r3.skip(r9);     // Catch: DataFormatException -> L43
    L22:
        if (r6 <= 0) goto L25;
        r2.c += r6;     // Catch: DataFormatException -> L43
        r8 = r6;
        r11.o += r8;     // Catch: DataFormatException -> L43
        goto L29
    L25:
        if (r2.b != r2.c) goto L9;
        r11.n = r2.a();     // Catch: DataFormatException -> L43
        a94.a(r2);     // Catch: DataFormatException -> L43
        goto L9
    L15:
        if (r3.l() == true) goto L18;
        t84 r10 = r3.o.n;     // Catch: DataFormatException -> L43
        r10.getClass();     // Catch: DataFormatException -> L43
        int r13 = r10.c;     // Catch: DataFormatException -> L43
        int r14 = r10.b;     // Catch: DataFormatException -> L43
        int r15 = r13 - r14;     // Catch: DataFormatException -> L43
        this.p = r15;     // Catch: DataFormatException -> L43
        r4.setInput(r10.a, r14, r15);     // Catch: DataFormatException -> L43
    L43:
        e = move-exception;
        throw new IOException(e);
    L46:
        kf2.o("closed");
        return 0;
    L48:
        kf2.e(b11.k("byteCount < 0: ", r12));
        return 0;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n.n.timeout();
    }
}
