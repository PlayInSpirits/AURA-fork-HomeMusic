package defpackage;

import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jx {
    public final se4 a;
    public final long b;
    public final int c;
    public ii0 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public z14 j;

    public jx(se4 r3) {
        r3.getClass();
        this.a = r3;
        this.b = 5242880;
        this.c = 20480;
    }

    public final void a() {
        OutputStream r0 = this.g;
        if (r0 != null) goto L55;
        return;
    L55:
        r0.flush();     // Catch: Throwable -> L47
        f35.h(this.g);
        this.g = null;
        File r2 = this.f;
        this.f = null;
        se4 r8 = this.a;
        long r3 = this.h;
        monitor-enter(r8);
    L18:
        th = move-exception;
        throw th;
    L10:
        if (r2.exists() == true) goto L14;
        monitor-exit(r8);
        return;
    L14:
        if (r3 != 0) goto L20;
        r2.delete();     // Catch: Throwable -> L18
        monitor-exit(r8);
        return;
    L20:
        te4 r15 = te4.b(r2, r3, -9223372036854775807L, r8.c);     // Catch: Throwable -> L18
        r15.getClass();     // Catch: Throwable -> L18
        wx r1 = r8.c.l(r15.n);     // Catch: Throwable -> L18
        r1.getClass();     // Catch: Throwable -> L18
        rr2.w(r1.c(r15.o, r15.p));     // Catch: Throwable -> L18
        long r4 = nd0.a(r1.e);     // Catch: Throwable -> L18
        if (r4 == (-1)) goto L28;
        if ((r15.o + r15.p) > r4) goto L25;
        boolean r5 = true;
    L26:
        rr2.w(r5);     // Catch: Throwable -> L18
        goto L28
    L25:
        r5 = false;
    L28:
        if (r8.d == null) goto L36;
        String r14 = r2.getName();     // Catch: Throwable -> L18
        r8.d.k(r15.p, r15.s, r14);     // Catch: Throwable -> L18 IOException -> L32
    L32:
        e = move-exception;
        throw new Cache$CacheException(e);     // Catch: Throwable -> L18
    L36:
        r8.b(r15);     // Catch: Throwable -> L18
        r8.c.u();     // Catch: Throwable -> L18 IOException -> L41
        r8.notifyAll();     // Catch: Throwable -> L18
        monitor-exit(r8);
        return;
    L41:
        e = move-exception;
        throw new Cache$CacheException(e);     // Catch: Throwable -> L18
    L47:
        th = move-exception;
        f35.h(this.g);
        this.g = null;
        File r6 = this.f;
        this.f = null;
        r6.delete();
        throw th;
    }

    public final void b(ii0 r15) {
        long r0 = r15.g;
        long r2 = -1;
        if (r0 == (-1)) goto L6;
        r2 = Math.min(r0 - this.i, this.e);
    L6:
        se4 r1 = this.a;
        String r3 = r15.h;
        String r4 = f35.a;
        long r10 = r15.f + this.i;
        monitor-enter(r1);
        r1.d();     // Catch: Throwable -> L11
        wx r16 = r1.c.l(r3);     // Catch: Throwable -> L11
        r16.getClass();     // Catch: Throwable -> L11
        rr2.w(r16.c(r10, r2));     // Catch: Throwable -> L11
        if (r1.a.exists() == true) goto L13;
        se4.e(r1.a);     // Catch: Throwable -> L11
        r1.o();     // Catch: Throwable -> L11
    L13:
        r1.b.a(r1, r2);     // Catch: Throwable -> L11
        File r8 = new File(r1.a, Integer.toString(r1.f.nextInt(10)));     // Catch: Throwable -> L11
        if (r8.exists() == true) goto L16;
        se4.e(r8);     // Catch: Throwable -> L11
    L16:
        long r12 = System.currentTimeMillis();     // Catch: Throwable -> L11
        File r17 = te4.c(r8, r16.a, r10, r12);     // Catch: Throwable -> L11
        monitor-exit(r1);
        this.f = r17;
        FileOutputStream r18 = new FileOutputStream(this.f);
        if (this.c <= 0) goto L25;
        z14 r5 = this.j;
        if (r5 != null) goto L23;
        this.j = new z14(r18, this.c);
    L24:
        this.g = this.j;
    L26:
        this.h = 0;
        return;
    L23:
        r5.b(r18);
        goto L24
    L25:
        this.g = r18;
    L11:
        th = move-exception;
        throw th;
    }
}
