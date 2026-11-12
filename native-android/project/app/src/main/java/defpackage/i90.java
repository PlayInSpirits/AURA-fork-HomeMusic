package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i90 extends InputStream {
    public long n;

    public i90() {
        this.n = 0;
    }

    public final void b(long r3) {
        if (r3 == (-1)) goto L6;
        this.n += r3;
        return;
    }
}
