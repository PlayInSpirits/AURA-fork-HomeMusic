package defpackage;

import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jm4 implements ci0 {
    public final lx n;
    public ii0 o;
    public String p;

    public jm4(lx r1) {
        this.n = r1;
    }

    @Override // defpackage.ci0
    public final long b(ii0 r3) {
        r3.getClass();
        lx r0 = this.n;
        this.p = r0.r.d(r3);
        long r1 = r0.b(r3);
        this.o = r3;
        return r1;
    }

    @Override // defpackage.ci0
    public final void c(rw4 r1) {
        r1.getClass();
        this.n.c(r1);
    }

    @Override // defpackage.ci0
    public final void close() {
        lx r0 = this.n;
        se4 r1 = r0.n;
        r0.close();
        ii0 r2 = this.o;
        if (r2 == null) goto L13;
        String r6 = this.p;
        if (r6 != null) goto L8;
        r6 = r0.r.d(r2);
        r6.getClass();
    L8:
        if (nd0.a(r1.i(r6)) != (-1)) goto L11;
        Log.d("StreamingCacheDataSource", "Removing partial cache for ".concat(r6));
        r1.m(r6);
        return;
    L11:
        Log.d("StreamingCacheDataSource", "Key " + r6 + " has been fully cached");
        return;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.v;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r1, int r2, int r3) {
        r1.getClass();
        return this.n.read(r1, r2, r3);
    }
}
