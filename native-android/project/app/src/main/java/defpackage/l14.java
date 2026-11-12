package defpackage;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l14 extends Reader {
    public final fw n;
    public final Charset o;
    public boolean p;
    public InputStreamReader q;

    public l14(fw r1, Charset r2) {
        r1.getClass();
        r2.getClass();
        this.n = r1;
        this.o = r2;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p = true;
        InputStreamReader r0 = this.q;
        if (r0 == null) goto L5;
        r0.close();
        j15 r1 = j15.a;
    L6:
        if (r1 != null) goto L9;
        this.n.close();
        return;
    L9:
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // java.io.Reader
    public final int read(char[] r5, int r6, int r7) {
        r5.getClass();
        if (this.p == true) goto L9;
        InputStreamReader r0 = this.q;
        if (r0 != null) goto L8;
        fw r1 = this.n;
        r0 = new InputStreamReader(r1.V(), ze5.g(r1, this.o));
        this.q = r0;
    L8:
        return r0.read(r5, r6, r7);
    L9:
        mj0.i("Stream closed");
        return 0;
    }
}
