package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p04 implements ci0 {
    public final ci0 n;
    public boolean o;

    public p04(ci0 r1, mj0 r2) {
        this.n = r1;
    }

    @Override // defpackage.ci0
    public final long b(ii0 r2) {
        hi0 r0 = r2.a();
        r0.i = r2.i & (-3);
        ii0 r3 = r0.a();
        this.o = true;
        return this.n.b(r3);
    }

    @Override // defpackage.ci0
    public final void c(rw4 r1) {
        r1.getClass();
        this.n.c(r1);
    }

    @Override // defpackage.ci0
    public final void close() {
        if (this.o == false) goto L6;
        this.o = false;
        this.n.close();
        return;
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        Uri r0 = this.n.m();
        if (r0 != null) goto L6;
        return null;
    L6:
        return r0;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r1, int r2, int r3) {
        return this.n.read(r1, r2, r3);
    }
}
