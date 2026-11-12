package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 extends bq1 {
    public long q;
    public final /* synthetic */ hq1 r;

    public eq1(hq1 r3, long r4) {
        this.r = r3;
        super(r3);
        this.q = r4;
        if (r4 != 0) goto L6;
        b();
        return;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.o == false) goto L6;
        return;
    L6:
        if (this.q == 0) goto L13;
        tl1 r0 = ze5.a;
        TimeUnit.MILLISECONDS.getClass();
        boolean r1 = ze5.h(this, 100);     // Catch: IOException -> L10
    L11:
        if (r1 == true) goto L13;
        ((q21) this.r.c).a();
        b();
    L10:
        r1 = false;
    L13:
        this.o = true;
    }

    @Override // defpackage.bq1, defpackage.ej4
    public final long read(tv r8, long r9) {
        r8.getClass();
        if (r9 >= 0) goto L5;
        kf2.e(b11.k("byteCount < 0: ", r9));
        return 0;
    L5:
        if (this.o == true) goto L17;
        long r2 = this.q;
        if (r2 != 0) goto L9;
        return -1;
    L9:
        long r10 = super.read(r8, Math.min(r2, r9));
        if (r10 == (-1)) goto L15;
        long r3 = this.q - r10;
        this.q = r3;
        if (r3 != 0) goto L14;
        b();
    L14:
        return r10;
    L15:
        ((q21) this.r.c).a();
        ProtocolException r11 = new ProtocolException("unexpected end of stream");
        b();
        throw r11;
    L17:
        kf2.o("closed");
        return 0;
    }
}
