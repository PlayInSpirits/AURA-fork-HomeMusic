package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr4 implements ci0 {
    public final ci0 n;
    public final jx o;
    public boolean p;
    public long q;

    public jr4(ci0 r1, jx r2) {
        r1.getClass();
        this.n = r1;
        r2.getClass();
        this.o = r2;
    }

    @Override // defpackage.ci0
    public final long b(ii0 r9) {
        long r0 = this.n.b(r9);
        this.q = r0;
        if (r0 != 0) goto L6;
        return 0;
    L6:
        if (r9.g == (-1)) goto L8;
    L10:
        int r1 = r9.i;
        this.p = true;
        jx r2 = this.o;
        r2.getClass();
        r9.h.getClass();
        if (r9.g == (-1)) goto L13;
    L15:
        r2.d = r9;
        if ((r1 & 4) != 4) goto L18;
        long r4 = r2.b;
    L19:
        r2.e = r4;
        r2.i = 0;
        r2.b(r9);     // Catch: IOException -> L23
    L22:
        return this.q;
    L23:
        e = move-exception;
        throw new CacheDataSink$CacheDataSinkException(e);
    L18:
        r4 = Long.MAX_VALUE;
        goto L19
    L13:
        if ((r1 & 2) != 2) goto L15;
        r2.d = null;
        goto L22
    L8:
        if (r0 == (-1)) goto L10;
        r9 = r9.b(0, r0);
        goto L10
    }

    @Override // defpackage.ci0
    public final void c(rw4 r1) {
        r1.getClass();
        this.n.c(r1);
    }

    @Override // defpackage.ci0
    public final void close() {
        jx r0 = this.o;
        this.n.close();     // Catch: Throwable -> L15
        if (this.p == false) goto L14;
        this.p = false;
        if (r0.d == null) goto L33;
        r0.a();     // Catch: IOException -> L11
        return;
    L11:
        e = move-exception;
        throw new CacheDataSink$CacheDataSinkException(e);
    L33:
        return;
    L14:
        return;
    L15:
        th = move-exception;
        if (this.p == false) goto L26;
        this.p = false;
        if (r0.d == null) goto L26;
        r0.a();     // Catch: IOException -> L23
    L23:
        e = move-exception;
        throw new CacheDataSink$CacheDataSinkException(e);
    L26:
        throw th;
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
    public final int read(byte[] r10, int r11, int r12) {
        if (this.q != 0) goto L6;
        return -1;
    L6:
        int r13 = this.n.read(r10, r11, r12);
        if (r13 <= 0) goto L24;
        jx r0 = this.o;
        ii0 r1 = r0.d;
        if (r1 == null) goto L21;
        int r2 = 0;
    L12:
        if (r2 >= r13) goto L21;
        if (r0.h != r0.e) goto L16;
        r0.a();     // Catch: IOException -> L18
        r0.b(r1);     // Catch: IOException -> L18
    L16:
        int r3 = (int) Math.min(r13 - r2, r0.e - r0.h);     // Catch: IOException -> L18
        OutputStream r4 = r0.g;     // Catch: IOException -> L18
        String r5 = f35.a;     // Catch: IOException -> L18
        r4.write(r10, r11 + r2, r3);     // Catch: IOException -> L18
        r2 = r2 + r3;     // Catch: IOException -> L18
        long r6 = r3;
        r0.h += r6;     // Catch: IOException -> L18
        r0.i += r6;     // Catch: IOException -> L18
    L18:
        e = move-exception;
        throw new CacheDataSink$CacheDataSinkException(e);
    L21:
        long r14 = this.q;
        if (r14 == (-1)) goto L24;
        this.q = r14 - ((long) r13);
    L24:
        return r13;
    }
}
