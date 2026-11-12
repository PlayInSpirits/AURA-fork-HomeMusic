package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qx implements ci0 {
    public final ci0 n;
    public final se4 o;

    public qx(ci0 r1, se4 r2) {
        r2.getClass();
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.ci0
    public final long b(ii0 r12) {
        r12.getClass();
        ci0 r0 = this.n;
        long r1 = r0.b(r12);
        String r13 = r12.h;
        if (r13 == null) goto L35;
        se4 r11 = this.o;
        Map r2 = r0.j();
        r2.getClass();
        Iterator r3 = r2.entrySet().iterator();
    L5:
        Long r4 = null;
        if (r3.hasNext() == false) goto L10;
        Object r5 = r3.next();
        if ("Content-Range".equalsIgnoreCase((String) ((Map.Entry) r5).getKey()) == false) goto L5;
    L11:
        Map.Entry r6 = (Map.Entry) r5;
        if (r6 == null) goto L24;
        List r7 = (List) r6.getValue();
        if (r7 == null) goto L24;
        String r8 = (String) q40.x0(r7);
        if (r8 == null) goto L24;
        Long r9 = xm4.m0(qm4.K0(qm4.G0(r8, '/', "")).toString());
        if (r9 == null) goto L24;
        if (r9.longValue() <= 0) goto L22;
        r4 = r9;
    L22:
        if (r4 == null) goto L24;
        long r10 = r4.longValue();
    L26:
        if (r10 == (-1)) goto L35;
        r11.getClass();     // Catch: Cache$CacheException -> L33
        if (nd0.a(r11.i(r13)) != (-1)) goto L35;
        xc5 r14 = new xc5(5);     // Catch: Cache$CacheException -> L33
        r14.m(Long.valueOf(r10), "exo_len");     // Catch: Cache$CacheException -> L33
        r11.c(r13, r14);     // Catch: Cache$CacheException -> L33
        return r1;
    L33:
        e = move-exception;
        Log.w("CacheLength", "length of " + r13 + " not stored: " + e);
    L24:
        r10 = -1;
        goto L26
    L10:
        r5 = null;
    L35:
        return r1;
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
        Map r0 = this.n.j();
        r0.getClass();
        return r0;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] r1, int r2, int r3) {
        r1.getClass();
        return this.n.read(r1, r2, r3);
    }
}
