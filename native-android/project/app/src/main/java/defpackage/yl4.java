package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl4 implements ci0 {
    public final ci0 n;
    public long o;
    public Uri p;
    public Map q;

    public yl4(ci0 r1) {
        r1.getClass();
        this.n = r1;
        this.p = Uri.EMPTY;
        this.q = Collections.EMPTY_MAP;
    }

    @Override // defpackage.ci0
    public final long b(ii0 r4) {
        ci0 r0 = this.n;
        this.p = r4.a;
        this.q = Collections.EMPTY_MAP;
        long r1 = r0.b(r4);     // Catch: Throwable -> L9
        Uri r5 = r0.m();
        if (r5 == null) goto L7;
        this.p = r5;
    L7:
        this.q = r0.j();
        return r1;
    L9:
        th = move-exception;
        Uri r2 = r0.m();
        if (r2 == null) goto L13;
        this.p = r2;
    L13:
        this.q = r0.j();
        throw th;
    }

    @Override // defpackage.ci0
    public final void c(rw4 r1) {
        r1.getClass();
        this.n.c(r1);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.n.close();
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] r3, int r4, int r5) {
        int r6 = this.n.read(r3, r4, r5);
        if (r6 == (-1)) goto L5;
        this.o += (long) r6;
    L5:
        return r6;
    }
}
