package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lx implements ci0 {
    public long A;
    public long B;
    public te4 C;
    public boolean D;
    public boolean E;
    public long F;
    public final se4 n;
    public final ci0 o;
    public final jr4 p;
    public final ci0 q;
    public final px r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public Uri v;
    public ii0 w;
    public ii0 x;
    public ci0 y;
    public long z;

    public lx(se4 r1, ci0 r2, ci0 r3, jx r4, px r5, int r6) {
        this.n = r1;
        this.o = r3;
        this.r = r5;
        boolean r7 = false;
        if ((r6 & 1) == 0) goto L5;
        boolean r8 = true;
    L6:
        this.s = r8;
        if ((r6 & 2) == 0) goto L9;
        boolean r9 = true;
    L10:
        this.t = r9;
        if ((r6 & 4) == 0) goto L13;
        r7 = true;
    L13:
        this.u = r7;
        jr4 r10 = null;
        if (r2 == null) goto L20;
        this.q = r2;
        if (r4 == null) goto L18;
        r10 = new jr4(r2, r4);
    L18:
        this.p = r10;
        return;
    L20:
        this.q = mg3.n;
        this.p = null;
        return;
    L9:
        r9 = false;
        goto L10
    L5:
        r8 = false;
        goto L6
    }

    @Override // defpackage.ci0
    public final long b(ii0 r14) {
        se4 r0 = this.n;
        String r2 = this.r.d(r14);     // Catch: Throwable -> L26
        hi0 r3 = r14.a();     // Catch: Throwable -> L26
        long r4 = r14.f;     // Catch: Throwable -> L26
        long r6 = r14.g;     // Catch: Throwable -> L26
        r3.h = r2;     // Catch: Throwable -> L26
        ii0 r15 = r3.a();     // Catch: Throwable -> L26
        this.w = r15;     // Catch: Throwable -> L26
        Uri r5 = r15.a;     // Catch: Throwable -> L26
        byte[] r8 = (byte[]) r0.i(r2).b.get("exo_redir");     // Catch: Throwable -> L26
        Uri r9 = null;
        if (r8 == null) goto L6;
        String r10 = new String(r8, StandardCharsets.UTF_8);     // Catch: Throwable -> L26
    L7:
        if (r10 == null) goto L10;
        r9 = Uri.parse(r10);     // Catch: Throwable -> L26
    L10:
        if (r9 == null) goto L12;
        r5 = r9;
    L12:
        this.v = r5;     // Catch: Throwable -> L26
        this.A = r4;     // Catch: Throwable -> L26
        if (this.t == false) goto L18;
        if (this.D == false) goto L18;
    L21:
        boolean r7 = true;
    L23:
        this.E = r7;     // Catch: Throwable -> L26
        if (r7 == false) goto L28;
        this.B = -1;     // Catch: Throwable -> L26
    L36:
        if (r6 == (-1)) goto L42;
        long r11 = this.B;     // Catch: Throwable -> L26
        if (r11 != (-1)) goto L40;
        long r12 = r6;
    L41:
        this.B = r12;     // Catch: Throwable -> L26
        goto L42
    L40:
        r12 = Math.min(r11, r6);     // Catch: Throwable -> L26
    L42:
        long r13 = this.B;     // Catch: Throwable -> L26
        if (r13 <= 0) goto L45;
    L46:
        p(r15, false);     // Catch: Throwable -> L26
    L47:
        if (r6 == (-1)) goto L50;
        return r6;
    L50:
        return this.B;
    L45:
        if (r13 != (-1)) goto L47;
    L28:
        long r16 = nd0.a(r0.i(r2));     // Catch: Throwable -> L26
        this.B = r16;     // Catch: Throwable -> L26
        if (r16 == (-1)) goto L36;
        long r17 = r16 - r4;     // Catch: Throwable -> L26
        this.B = r17;     // Catch: Throwable -> L26
        if (r17 >= 0) goto L36;
        throw new DataSourceException(2008);     // Catch: Throwable -> L26
    L18:
        if (this.u == true) goto L20;
    L22:
        r7 = false;
        goto L23
    L20:
        if (r6 != (-1)) goto L22;
    L6:
        r10 = null;
    L26:
        th = move-exception;
        if (this.y != this.o) goto L54;
    L55:
        this.D = true;
    L56:
        throw th;
    L54:
        if ((th instanceof Cache$CacheException) == false) goto L56;
        goto L55
    }

    @Override // defpackage.ci0
    public final void c(rw4 r2) {
        r2.getClass();
        this.o.c(r2);
        this.q.c(r2);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.w = null;
        this.v = null;
        this.A = 0;
        o();     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        if (this.y != this.o) goto L9;
    L10:
        this.D = true;
    L11:
        throw th;
    L9:
        if ((th instanceof Cache$CacheException) == false) goto L11;
        goto L10
    }

    @Override // defpackage.ci0
    public final Map j() {
        if (this.y != this.o) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L10;
        return this.q.j();
    L10:
        return Collections.EMPTY_MAP;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.v;
    }

    public final void o() {
        se4 r0 = this.n;
        ci0 r1 = this.y;
        if (r1 != null) goto L16;
        return;
    L16:
        r1.close();     // Catch: Throwable -> L11
        this.x = null;
        this.y = null;
        te4 r2 = this.C;
        if (r2 == null) goto L18;
        r0.l(r2);
        this.C = null;
        return;
    L18:
        return;
    L11:
        th = move-exception;
        this.x = null;
        this.y = null;
        te4 r3 = this.C;
        if (r3 == null) goto L15;
        r0.l(r3);
        this.C = null;
    L15:
        throw th;
    }

    public final void p(ii0 r18, boolean r19) {
        String r7 = r18.h;
        String r2 = f35.a;
        Uri r8 = null;
        if (this.E == false) goto L5;
        te4 r9 = null;
    L22:
        if (r9 != null) goto L25;
        ci0 r4 = this.q;
        hi0 r5 = r18.a();
        r5.f = this.A;
        r5.g = this.B;
        ii0 r6 = r5.a();
    L41:
        if (this.E == false) goto L43;
    L45:
        long r10 = Long.MAX_VALUE;
    L46:
        this.F = r10;
        boolean r11 = false;
        if (r19 == true) goto L49;
    L62:
        if (r9 != null) goto L64;
    L66:
        this.y = r4;
        this.x = r6;
        this.z = 0;
        long r12 = r4.b(r6);
        xc5 r13 = new xc5(5);
        if (r6.g != (-1)) goto L72;
        if (r12 == (-1)) goto L72;
        this.B = r12;
        r13.m(Long.valueOf(this.A + r12), "exo_len");
    L72:
        if (this.y != this.o) goto L74;
        r11 = true;
    L74:
        if (r11 == true) goto L83;
        Uri r3 = r4.m();
        this.v = r3;
        if (r18.a.equals(r3) == true) goto L79;
        r8 = this.v;
    L79:
        if (r8 != null) goto L81;
        ((ArrayList) r13.p).add("exo_redir");
        ((HashMap) r13.o).remove("exo_redir");
        goto L83
    L81:
        r13.m(r8.toString(), "exo_redir");
    L83:
        if (this.y != this.p) goto L93;
        this.n.c(r7, r13);
        return;
    L93:
        return;
    L64:
        if (r9.q == true) goto L66;
        this.C = r9;
        goto L66
    L49:
        if (this.y != this.q) goto L51;
        boolean r14 = true;
    L52:
        rr2.w(r14);
        if (r4 != this.q) goto L86;
        return;
    L86:
        o();     // Catch: Throwable -> L57
    L57:
        th = move-exception;
        if (r9.q == true) goto L61;
        this.n.l(r9);
    L61:
        throw th;
    L51:
        r14 = false;
        goto L52
    L43:
        if (r4 != this.q) goto L45;
        r10 = this.A + 102400;
        goto L46
    L25:
        if (r9.q == false) goto L30;
        Uri r15 = Uri.fromFile(r9.r);
        long r16 = r9.o;
        long r17 = this.A - r16;
        long r110 = r9.p - r17;
        long r111 = this.B;
        if (r111 == (-1)) goto L29;
        r110 = Math.min(r110, r111);
    L29:
        hi0 r112 = r18.a();
        r112.a = r15;
        r112.b = r16;
        r112.f = r17;
        r112.g = r110;
        r6 = r112.a();
        r4 = this.o;
        goto L41
    L30:
        long r20 = r9.p;
        long r113 = this.B;
        if (r20 != (-1)) goto L34;
        r20 = r113;
    L36:
        hi0 r21 = r18.a();
        r21.f = this.A;
        r21.g = r20;
        r6 = r21.a();
        r4 = this.p;
        if (r4 != null) goto L41;
        r4 = this.q;
        this.n.l(r9);
        r9 = null;
        goto L41
    L34:
        if (r113 == (-1)) goto L36;
        r20 = Math.min(r20, r113);
        goto L36
    L5:
        boolean r22 = this.s;
        se4 r23 = this.n;
        long r24 = this.A;
        if (r22 == true) goto L88;
        r9 = r23.p(r24, this.B, r7);
        goto L22
    L88:
        long r25 = this.B;     // Catch: InterruptedException -> L18
        monitor-enter(r23);     // Catch: InterruptedException -> L18
        r23.d();     // Catch: Throwable -> L15
    L10:
        r9 = r23.p(r24, r25, r7);     // Catch: Throwable -> L15
        if (r9 != null) goto L12;
        r23.wait();     // Catch: Throwable -> L15
    L12:
        monitor-exit(r23);     // Catch: InterruptedException -> L18
    L15:
        th = move-exception;
        throw th;     // Catch: InterruptedException -> L18
    L18:
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
    }

    @Override // defpackage.wh0
    public final int read(byte[] r19, int r20, int r21) {
        ci0 r2 = this.o;
        boolean r3 = false;
        if (r21 != 0) goto L6;
        return 0;
    L6:
        if (this.B != 0) goto L8;
        return -1;
    L8:
        ii0 r4 = this.w;
        r4.getClass();
        ii0 r8 = this.x;
        r8.getClass();
    L12:
        th = move-exception;
        if (this.y != r2) goto L50;
    L51:
        this.D = true;
    L52:
        throw th;
    L50:
        if ((th instanceof Cache$CacheException) == false) goto L52;
    L10:
        if (this.A < this.F) goto L14;
        p(r4, true);     // Catch: Throwable -> L12
    L14:
        ci0 r10 = this.y;     // Catch: Throwable -> L12
        r10.getClass();     // Catch: Throwable -> L12
        int r11 = r10.read(r19, r20, r21);     // Catch: Throwable -> L12
        ci0 r13 = this.y;
        if (r11 == (-1)) goto L22;
        long r5 = r11;
        this.A += r5;     // Catch: Throwable -> L12
        this.z += r5;     // Catch: Throwable -> L12
        long r6 = this.B;     // Catch: Throwable -> L12
        if (r6 == (-1)) goto L44;
        this.B = r6 - r5;     // Catch: Throwable -> L12
        return r11;
    L44:
        return r11;
    L22:
        if (r13 != r2) goto L24;
        boolean r7 = true;
    L25:
        if (r7 == true) goto L38;
        long r16 = -1;
        long r14 = r8.g;     // Catch: Throwable -> L12
        if (r14 == (-1)) goto L31;
        int r9 = r11;
        if (this.z < r14) goto L32;
    L39:
        long r12 = this.B;     // Catch: Throwable -> L12
        if (r12 <= 0) goto L42;
    L45:
        o();     // Catch: Throwable -> L12
        p(r4, false);     // Catch: Throwable -> L12
        return read(r19, r20, r21);
    L42:
        if (r12 == r16) goto L45;
        return r9;
    L32:
        String r0 = r4.h;     // Catch: Throwable -> L12
        String r15 = f35.a;     // Catch: Throwable -> L12
        this.B = 0;     // Catch: Throwable -> L12
        if (r13 != this.p) goto L35;
        r3 = true;
    L35:
        if (r3 == false) goto L54;
        xc5 r17 = new xc5(5);     // Catch: Throwable -> L12
        r17.m(Long.valueOf(this.A), "exo_len");     // Catch: Throwable -> L12
        this.n.c(r0, r17);     // Catch: Throwable -> L12
        return r9;
    L54:
        return r9;
    L31:
        r9 = r11;
        goto L32
    L38:
        r9 = r11;
        r16 = -1;
        goto L39
    L24:
        r7 = false;
        goto L25
    }
}
