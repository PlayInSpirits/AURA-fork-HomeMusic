package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ox implements ej4 {
    public boolean n;
    public final /* synthetic */ fw o;
    public final /* synthetic */ jw p;
    public final /* synthetic */ wu3 q;

    public ox(fw r1, jw r2, wu3 r3) {
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n == true) goto L10;
        tl1 r0 = ze5.a;
        TimeUnit.MILLISECONDS.getClass();
        boolean r1 = ze5.h(this, 100);     // Catch: IOException -> L7
    L8:
        if (r1 == true) goto L10;
        this.n = true;
        this.p.a();
    L7:
        r1 = false;
    L10:
        this.o.close();
    }

    @Override // defpackage.ej4
    public final long read(tv r10, long r11) {
        r10.getClass();
        long r6 = this.o.read(r10, r11);     // Catch: IOException -> L12
        wu3 r8 = this.q;
        if (r6 == (-1)) goto L7;
        r10.n(r8.o, r10.o - r6, r6);
        r8.b();
        return r6;
    L7:
        if (this.n == true) goto L9;
        this.n = true;
        r8.close();
    L9:
        return -1;
    L12:
        e = move-exception;
        if (this.n == true) goto L19;
        this.n = true;
        this.p.a();
        throw e;
    L19:
        throw e;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.o.timeout();
    }
}
